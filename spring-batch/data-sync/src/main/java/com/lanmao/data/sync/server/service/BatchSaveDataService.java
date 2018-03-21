package com.lanmao.data.sync.server.service;

import com.lanmao.data.SpringUtils;
import com.lanmao.data.sync.client.param.DataSyncPacket;
import com.lanmao.data.sync.dao.oracle.SaveDataMapper;
import com.lanmao.data.sync.http.async.AsyncNotifier;
import com.lanmao.data.sync.http.async.DefaultNotifyObserver;
import com.lanmao.data.sync.http.async.Notify;
import com.lanmao.data.sync.http.async.NotifyObserver;
import com.lanmao.data.sync.param.TaskStatus;
import com.lanmao.data.sync.param.Tasklet;
import com.lanmao.data.sync.redis.RedisUtils;
import com.lanmao.data.sync.service.JobInfoService;
import com.lanmao.data.sync.utils.GsonUtils;
import com.lanmao.runtime.util.http.HttpUtils;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author hui.zhou 15:43 2018/3/9
 */
@Service
public class BatchSaveDataService {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private JobInfoService jobInfoService;

    @Value("${server.url}")
    private String serverUrl;

    @Resource
    private AsyncNotifier asyncNotifier;
    private NotifyObserver observer = new DefaultNotifyObserver();

    private AtomicLong count = new AtomicLong();
    private Map<String, Object> mapperMap = new ConcurrentHashMap<>();
    /**
     * 批量保存数据
     * @param packetList
     */
    @Transactional
    public void saveList(List<DataSyncPacket> packetList){
        logger.info("持久化数据-START");
        for(DataSyncPacket packet : packetList){
            boolean saveSucc = true;
            StringBuilder desc = new StringBuilder();
            long succCount = 0;
            long failCount = 0;
            try {
                Object mapper = mapperMap.get(packet.getJobName());
                if(mapper == null){
                    mapper = SpringUtils.getBean(jobInfoService.getMapperClsOracle(packet.getJobName()));
                    mapperMap.put(packet.getJobName(), mapper);
                }
                for(Object infoMap : packet.getDatas()){
                    Object entity = null;
                    try {
                        entity = jobInfoService.getEntityCls(packet.getJobName()).newInstance();
                        ConvertUtils.register(new DateLocaleConverter(Locale.CHINA, "yyyyMMddHHmmss"), Date.class);
                        BeanUtils.populate(entity, (Map<String, ? extends Object>) infoMap);
                        insert(mapper, entity);
                        succCount++;
                    } catch (Exception e){
                        logger.error("持久化数据异常");
                        saveSucc = false;
                        desc.append(e.getMessage() + "/");
                        failCount++;
                    }
                }
            }catch (Exception e) {
                logger.error("未知异常", e);
                desc.append(e.getMessage() + "/");
            }

            try {
                //更新同步状态
                Tasklet tasklet = new Tasklet();
                tasklet.setId(packet.getQueryRange() + "/" + packet.getPacketSeq());
                tasklet.setJobName(packet.getJobName());
                tasklet.setTaskStatus(saveSucc ? TaskStatus.FINISHED : TaskStatus.FAILED);
                tasklet.setDesc(desc.toString());
                tasklet.setSuccCount(succCount);
                tasklet.setFailCount(failCount);

                Map<String, String> params = new HashMap<>();
                params.put("taskletJson", GsonUtils.buildGson().toJson(tasklet));
                try {
                    Notify notify = new Notify(
                            tasklet.getId(),
                            new URL(serverUrl + "manager/updateJobStatus"),
                            "",
                            params,
                            "update status");
                    asyncNotifier.send(notify, observer);

                    Notify increment = new Notify(
                            tasklet.getId(),
                            new URL(serverUrl + "manager/incr/" + tasklet.getJobName()),
                            "",
                            null,
                            "ince receive size");
                    asyncNotifier.send(increment, observer);

                    //HttpUtils.post(new URL(serverUrl + "manager/updateJobStatus"), Charset.forName("UTF-8"), params);
                } catch (IOException e) {
                    logger.error("http更新状态失败，{}", params);
                }
            } catch (Exception e) {
                logger.error("更新状态失败", e);
            }
        }
        logger.info("持久化数据-END");
    }

    private void insert(Object mapper, Object entity) {
        SaveDataMapper pageQueryMapper = (SaveDataMapper) mapper;
        pageQueryMapper.insert(entity);
    }
}

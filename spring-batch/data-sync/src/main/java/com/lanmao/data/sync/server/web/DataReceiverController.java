package com.lanmao.data.sync.server.web;

import com.lanmao.data.sync.client.param.DataSyncPacket;
import com.lanmao.data.sync.server.job.BatchSaveDataJobLauncher;
import com.lanmao.data.sync.utils.GsonUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 数据接收
 * @author hui.zhou 13:31 2018/3/8
 */
@RestController
@RequestMapping("sync")
public class DataReceiverController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private BatchSaveDataJobLauncher saveDataJobLauncher;

    @RequestMapping("receive")
    public String receive(String dataSyncPacket){
        DataSyncPacket packet = GsonUtils.buildGson().fromJson(dataSyncPacket, DataSyncPacket.class);
        //logger.info("接收到客户端推送数据，{},{},{}", packet.getJobName(), packet.getStartPoint(), packet.getDatas());
        saveDataJobLauncher.saveData(packet);
        return "SUCCESS";
    }
}

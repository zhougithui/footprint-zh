package com.lanmao.data.sync.client.web;

import com.lanmao.data.sync.client.job.JobLauncher;
import com.lanmao.data.sync.dao.db2.MinMaxDayMapper;
import com.lanmao.data.sync.param.MinMaxDay;
import com.lanmao.data.sync.param.MinMaxId;
import com.lanmao.data.sync.param.TaskStatus;
import com.lanmao.data.sync.param.Tasklet;
import com.lanmao.data.sync.redis.RedisUtils;
import com.lanmao.data.sync.service.JobInfoService;
import com.lanmao.data.sync.utils.GsonUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

/**
 * 数据同步管理器
 * @author hui.zhou 16:22 2018/3/8
 */
@Controller
@RequestMapping("manager")
public class DataSyncManagerController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private JobInfoService jobInfoService;

    @Resource
    private JobLauncher jobLauncher;

    @Resource
    private MinMaxDayMapper minMaxDayMapper;

    /**
     * 列表显示任务名称
     * @return
     */
    @RequestMapping("list")
    public String queryAllTable(HttpServletRequest request){
        Set<String> jobSet = jobInfoService.queryAllJob();
        TreeSet<String> sortJobSet = new TreeSet<>();
        jobSet.forEach(jobName -> {
            if(jobName.contains("MinMaxDay") || jobName.contains("PageQuery")){

            }else{
                sortJobSet.add(jobName);
            }
        });
        request.setAttribute("jobNameSet", sortJobSet);
        return "jobList";
    }

    /**
     * 执行任务
     * @param jobName
     * @return
     */
    @RequestMapping("start/{jobName}/{syncDay}")
    @ResponseBody
    public String startSync(@PathVariable String jobName, @PathVariable String syncDay){
        jobLauncher.startDataSync(jobName, syncDay);
        return "SUCCESS";
    }

    /**
     * 执行任务
     * @param jobName 任务名称
     * @param start 开始日期
     * @param offset 同步记录数
     * @return
     */
    @RequestMapping("job/{jobName}/{start}/{offset}")
    @ResponseBody
    public String startTaskById(@PathVariable String jobName, @PathVariable long start, @PathVariable long offset){
        jobLauncher.startDataSyncById(jobName, start, offset);
        return "SUCCESS";
    }

    /**
     * 更新状态，接收端调用
     * @param taskletJson
     * @return
     */
    @RequestMapping("updateJobStatus")
    @ResponseBody
    public String updateJob(String taskletJson){
        Tasklet taskletUpdate = GsonUtils.buildGson().fromJson(taskletJson, Tasklet.class);

        Tasklet tasklet = RedisUtils.hget(taskletUpdate.getJobName(), taskletUpdate.getId(), Tasklet.class);
        tasklet.setEndTime(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")));
        tasklet.setTaskStatus(taskletUpdate.getTaskStatus());
        tasklet.setDesc(taskletUpdate.getDesc());
        tasklet.setFailCount(taskletUpdate.getFailCount());
        tasklet.setSuccCount(taskletUpdate.getSuccCount());

        RedisUtils.hset(tasklet.getJobName(), tasklet.getId(), tasklet, 1l, TimeUnit.DAYS);

        if(tasklet.getTaskStatus() != TaskStatus.FINISHED){
            RedisUtils.hset("failJob-" + tasklet.getJobName(), tasklet.getId(), tasklet, 1l, TimeUnit.DAYS);
        }
        return "SUCCESS";
    }

    @RequestMapping("status/{jobName}")
    @ResponseBody
    public Object getJobStatus(@PathVariable String jobName){
        Map<String, Tasklet> taskletMap = RedisUtils.hgetAll(jobName, Tasklet.class);
        return taskletMap != null ? taskletMap.values() : new ArrayList<>();
    }

    @RequestMapping("failJobList/{jobName}")
    @ResponseBody
    public Object failJobList(@PathVariable String jobName){
        Map<String, Tasklet> taskletMap = RedisUtils.hgetAll("failJob-" + jobName, Tasklet.class);
        return taskletMap != null ? taskletMap.values() : new ArrayList<>();
    }

    /**
     * 根据日期排序
     * @param jobName
     * @return
     */
    @RequestMapping("minMaxDay/{jobName}")
    @ResponseBody
    public MinMaxDay minMaxDay(@PathVariable String jobName){
        return minMaxDayMapper.minMaxDay(jobInfoService.getTableName(jobName));
    }

    /**
     * 根据ID排序
     * @param jobName
     * @return
     */
    @RequestMapping("minMaxId/{jobName}")
    @ResponseBody
    public MinMaxId minMaxId(@PathVariable String jobName){
        return minMaxDayMapper.minMaxId(jobInfoService.getTableName(jobName));
    }

    @RequestMapping("incr/{jobName}")
    @ResponseBody
    public String incrReceiveCount(@PathVariable String jobName){
        try {
            RedisUtils.increment(jobName + "-receive", 1l, TimeUnit.DAYS);
        } catch (Exception e) {
            logger.error("更新数据包持久化数量失败");
        }
        return "SUCCESS";
    }

    @RequestMapping("checkCount/{jobName}")
    @ResponseBody
    public String checkCount(@PathVariable String jobName){
        try {
            Long sendPacketSize = RedisUtils.get(jobName + "-send");
            Long receivePacketSize = RedisUtils.get(jobName + "-receive");

            return "send=" + sendPacketSize + ";receive=" + receivePacketSize;
        } catch (Exception e) {
            logger.error("更新数据包持久化数量失败");
        }
        return "0-0";
    }
}

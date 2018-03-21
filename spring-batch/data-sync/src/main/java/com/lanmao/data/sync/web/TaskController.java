package com.lanmao.data.sync.web;

import com.lanmao.runtime.util.http.HttpUtils;
import com.lanmao.runtime.util.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;

/**
 * @author hui.zhou 11:13 2018/3/12
 */
@RestController
@RequestMapping("task")
public class TaskController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 执行任务
     * @param jobName 任务名称
     * @param start 开始日期
     * @param days 同步天数
     * @return
     */
    @RequestMapping("job/{jobName}/{start}/{days}")
    public String startTask(@PathVariable String jobName, @PathVariable String start, @PathVariable int days, HttpServletRequest request){
        try {
            Date startDay = DateUtils.parseDate(start, new String[]{"yyyyMMdd"});

            for(; days>0; days--){
                String startDayStr = DateUtils.format("yyyyMMdd", startDay);
                logger.info("开始同步,{}, {}", jobName, startDayStr);
                HttpUtils.post(
                        new URL("http://localhost:"+ request.getLocalPort() + "/data-sync/manager/start/" + jobName + "/" + startDayStr),
                        Charset.forName("UTF-8"),
                        new HashMap<>()
                );
                startDay = DateUtils.addDays(startDay, 1);
            }
        } catch (ParseException e) {
            logger.error("日期格式错误");
            return "日期格式错误";
        } catch (Exception e) {
            logger.error("任务执行失败", e);
            return "FAILED";
        }
        return "SUCCESS";
    }
}

package com.lanmao.data.sync.client.service;

import com.lanmao.data.SpringUtils;
import com.lanmao.data.sync.client.exception.QueryJobException;
import com.lanmao.data.sync.client.param.PageQueryParam;
import com.lanmao.data.sync.dao.db2.PageQueryMapper;
import com.lanmao.data.sync.service.JobInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hui.zhou 16:41 2018/3/8
 */
@Service
public class DataQueryService {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Resource
    private JobInfoService jobInfoService;

    public List<Object> queryList(String jobName, PageQueryParam param) {
        Object mapper = SpringUtils.getBean(jobInfoService.getMapperClsDB2(jobName));
        param.setTableName(jobInfoService.getTableName(jobName));
        return queryList(mapper, param);
    }

    private List<Object> queryList(Object mapper, PageQueryParam param) {
        PageQueryMapper pageQueryMapper = (PageQueryMapper) mapper;
        try {
            return pageQueryMapper.queryList(param);
        } catch (Exception e) {
            logger.error("数据读取错误：", e);
            throw new QueryJobException(e, e.getMessage());
        }
    }

}

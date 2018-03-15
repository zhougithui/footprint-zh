package com.lanmao.data.sync.db.job;

import com.lanmao.data.sync.db.oracle.dao.AuthOrderEntityMapper;
import com.lanmao.data.sync.db.oracle.entity.AuthOrderEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hui.zhou 11:04 2018/3/7
 */
@Service
public class AuthOrderWriter implements ItemWriter<AuthOrderEntity> {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private AuthOrderEntityMapper authOrderEntityMapper;

    @Override
    public void write(List<? extends AuthOrderEntity> items) throws Exception {
        logger.info("批量插入T_AUTH_ORDER数据条数，{}", items.size());
        items.forEach(item -> {
            authOrderEntityMapper.insertSelective(item);
        });
        logger.info("批量插入T_AUTH_ORDER数据条数结束");
    }
}

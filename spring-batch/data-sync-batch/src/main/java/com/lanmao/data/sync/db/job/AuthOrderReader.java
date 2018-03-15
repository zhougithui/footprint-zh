package com.lanmao.data.sync.db.job;

import com.lanmao.data.sync.db.oracle.entity.AuthOrderEntity;
import org.springframework.batch.item.database.JdbcPagingItemReader;

/**
 * 鉴权订单分页提取
 * @author hui.zhou 11:03 2018/3/7
 */
public class AuthOrderReader extends JdbcPagingItemReader<AuthOrderEntity> {

}

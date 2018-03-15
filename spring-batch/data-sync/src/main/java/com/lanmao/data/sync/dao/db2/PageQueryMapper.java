package com.lanmao.data.sync.dao.db2;

import com.lanmao.data.sync.client.param.PageQueryParam;

import java.util.List;

/**
 * @author hui.zhou 11:22 2018/3/9
 */
public interface PageQueryMapper<T> {
    List<T> queryList(PageQueryParam param);
}

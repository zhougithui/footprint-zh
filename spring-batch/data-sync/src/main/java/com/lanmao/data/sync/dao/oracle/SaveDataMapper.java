package com.lanmao.data.sync.dao.oracle;

/**
 * @author hui.zhou 15:50 2018/3/9
 */
public interface SaveDataMapper<T> {
    int insert(T record);
}

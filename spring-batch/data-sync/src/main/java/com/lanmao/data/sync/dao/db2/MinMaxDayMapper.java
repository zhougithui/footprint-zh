package com.lanmao.data.sync.dao.db2;

import com.lanmao.data.sync.param.MinMaxDay;
import com.lanmao.data.sync.param.MinMaxId;
import org.apache.ibatis.annotations.Param;

/**
 * @author hui.zhou 9:30 2018/3/14
 */
public interface MinMaxDayMapper {
    MinMaxDay minMaxDay(@Param("tableName") String tableName);

    MinMaxId minMaxId(@Param("tableName") String tableName);
}

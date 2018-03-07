package com.lanmao.data.sync.db.oracle.dao;

import com.lanmao.data.sync.db.oracle.entity.AuthOrderEntity;

public interface AuthOrderEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AuthOrderEntity record);

    int insertSelective(AuthOrderEntity record);

    AuthOrderEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AuthOrderEntity record);

    int updateByPrimaryKey(AuthOrderEntity record);
}
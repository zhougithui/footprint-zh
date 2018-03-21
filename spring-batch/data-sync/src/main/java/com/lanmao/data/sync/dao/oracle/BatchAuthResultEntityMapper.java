package com.lanmao.data.sync.dao.oracle;

import com.lanmao.data.sync.dao.entity.BatchAuthResultEntity;

public interface BatchAuthResultEntityMapper extends SaveDataMapper<BatchAuthResultEntity> {
    int deleteByPrimaryKey(Long id);

    int insert(BatchAuthResultEntity record);

    int insertSelective(BatchAuthResultEntity record);

    BatchAuthResultEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BatchAuthResultEntity record);

    int updateByPrimaryKey(BatchAuthResultEntity record);
}
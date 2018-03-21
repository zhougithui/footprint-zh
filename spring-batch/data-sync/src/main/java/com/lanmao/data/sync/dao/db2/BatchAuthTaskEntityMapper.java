package com.lanmao.data.sync.dao.db2;

import com.lanmao.data.sync.dao.entity.BatchAuthTaskEntity;

public interface BatchAuthTaskEntityMapper extends PageQueryMapper<BatchAuthTaskEntity> {
    int deleteByPrimaryKey(Long id);

    int insert(BatchAuthTaskEntity record);

    int insertSelective(BatchAuthTaskEntity record);

    BatchAuthTaskEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BatchAuthTaskEntity record);

    int updateByPrimaryKey(BatchAuthTaskEntity record);
}
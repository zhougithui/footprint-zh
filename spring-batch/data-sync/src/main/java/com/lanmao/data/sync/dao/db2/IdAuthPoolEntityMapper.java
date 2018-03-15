package com.lanmao.data.sync.dao.db2;

import com.lanmao.data.sync.dao.entity.IdAuthPoolEntity;

public interface IdAuthPoolEntityMapper extends PageQueryMapper<IdAuthPoolEntity> {
    int deleteByPrimaryKey(Long id);

    int insert(IdAuthPoolEntity record);

    int insertSelective(IdAuthPoolEntity record);

    IdAuthPoolEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IdAuthPoolEntity record);

    int updateByPrimaryKey(IdAuthPoolEntity record);
}
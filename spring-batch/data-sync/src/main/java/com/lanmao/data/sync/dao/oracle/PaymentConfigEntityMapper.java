package com.lanmao.data.sync.dao.oracle;

import com.lanmao.data.sync.dao.entity.PaymentConfigEntity;

public interface PaymentConfigEntityMapper extends SaveDataMapper<PaymentConfigEntity> {
    int deleteByPrimaryKey(Long id);

    int insert(PaymentConfigEntity record);

    int insertSelective(PaymentConfigEntity record);

    PaymentConfigEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PaymentConfigEntity record);

    int updateByPrimaryKey(PaymentConfigEntity record);
}
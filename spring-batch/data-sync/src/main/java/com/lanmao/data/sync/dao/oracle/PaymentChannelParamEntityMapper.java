package com.lanmao.data.sync.dao.oracle;

import com.lanmao.data.sync.dao.entity.PaymentChannelParamEntity;

public interface PaymentChannelParamEntityMapper extends SaveDataMapper<PaymentChannelParamEntity> {
    int deleteByPrimaryKey(Long id);

    int insert(PaymentChannelParamEntity record);

    int insertSelective(PaymentChannelParamEntity record);

    PaymentChannelParamEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PaymentChannelParamEntity record);

    int updateByPrimaryKey(PaymentChannelParamEntity record);
}
package com.lanmao.data.sync.dao.oracle;

import java.util.List;

import com.lanmao.data.sync.dao.entity.PaymentSubjectChannelEntity;
import com.lanmao.data.sync.dao.entity.PaymentSubjectChannelEntityExample;
import com.lanmao.data.sync.dao.entity.PaymentSubjectChannelEntityKey;
import org.apache.ibatis.annotations.Param;

public interface PaymentSubjectChannelEntityMapper extends SaveDataMapper<PaymentSubjectChannelEntity> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_SUBJECT_CHANNEL
     *
     * @mbggenerated Mon Mar 28 09:14:27 CST 2016
     */
    int countByExample(PaymentSubjectChannelEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_SUBJECT_CHANNEL
     *
     * @mbggenerated Mon Mar 28 09:14:27 CST 2016
     */
    int deleteByExample(PaymentSubjectChannelEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_SUBJECT_CHANNEL
     *
     * @mbggenerated Mon Mar 28 09:14:27 CST 2016
     */
    int deleteByPrimaryKey(PaymentSubjectChannelEntityKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_SUBJECT_CHANNEL
     *
     * @mbggenerated Mon Mar 28 09:14:27 CST 2016
     */
    int insert(PaymentSubjectChannelEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_SUBJECT_CHANNEL
     *
     * @mbggenerated Mon Mar 28 09:14:27 CST 2016
     */
    int insertSelective(PaymentSubjectChannelEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_SUBJECT_CHANNEL
     *
     * @mbggenerated Mon Mar 28 09:14:27 CST 2016
     */
    List<PaymentSubjectChannelEntity> selectByExample(PaymentSubjectChannelEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_SUBJECT_CHANNEL
     *
     * @mbggenerated Mon Mar 28 09:14:27 CST 2016
     */
    PaymentSubjectChannelEntity selectByPrimaryKey(PaymentSubjectChannelEntityKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_SUBJECT_CHANNEL
     *
     * @mbggenerated Mon Mar 28 09:14:27 CST 2016
     */
    int updateByExampleSelective(@Param("record") PaymentSubjectChannelEntity record, @Param("example") PaymentSubjectChannelEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_SUBJECT_CHANNEL
     *
     * @mbggenerated Mon Mar 28 09:14:27 CST 2016
     */
    int updateByExample(@Param("record") PaymentSubjectChannelEntity record, @Param("example") PaymentSubjectChannelEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_SUBJECT_CHANNEL
     *
     * @mbggenerated Mon Mar 28 09:14:27 CST 2016
     */
    int updateByPrimaryKeySelective(PaymentSubjectChannelEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_SUBJECT_CHANNEL
     *
     * @mbggenerated Mon Mar 28 09:14:27 CST 2016
     */
    int updateByPrimaryKey(PaymentSubjectChannelEntity record);
}
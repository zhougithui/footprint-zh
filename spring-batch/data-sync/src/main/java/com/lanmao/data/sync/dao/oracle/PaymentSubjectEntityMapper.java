package com.lanmao.data.sync.dao.oracle;

import java.util.List;

import com.lanmao.data.sync.dao.entity.PaymentSubjectEntity;
import com.lanmao.data.sync.dao.entity.PaymentSubjectEntityExample;
import org.apache.ibatis.annotations.Param;

public interface PaymentSubjectEntityMapper extends SaveDataMapper<PaymentSubjectEntity> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_SUBJECT
     *
     * @mbggenerated Wed Jul 19 16:58:48 CST 2017
     */
    int countByExample(PaymentSubjectEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_SUBJECT
     *
     * @mbggenerated Wed Jul 19 16:58:48 CST 2017
     */
    int deleteByExample(PaymentSubjectEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_SUBJECT
     *
     * @mbggenerated Wed Jul 19 16:58:48 CST 2017
     */
    int deleteByPrimaryKey(String subjectNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_SUBJECT
     *
     * @mbggenerated Wed Jul 19 16:58:48 CST 2017
     */
    int insert(PaymentSubjectEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_SUBJECT
     *
     * @mbggenerated Wed Jul 19 16:58:48 CST 2017
     */
    int insertSelective(PaymentSubjectEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_SUBJECT
     *
     * @mbggenerated Wed Jul 19 16:58:48 CST 2017
     */
    List<PaymentSubjectEntity> selectByExample(PaymentSubjectEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_SUBJECT
     *
     * @mbggenerated Wed Jul 19 16:58:48 CST 2017
     */
    PaymentSubjectEntity selectByPrimaryKey(String subjectNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_SUBJECT
     *
     * @mbggenerated Wed Jul 19 16:58:48 CST 2017
     */
    int updateByExampleSelective(@Param("record") PaymentSubjectEntity record, @Param("example") PaymentSubjectEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_SUBJECT
     *
     * @mbggenerated Wed Jul 19 16:58:48 CST 2017
     */
    int updateByExample(@Param("record") PaymentSubjectEntity record, @Param("example") PaymentSubjectEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_SUBJECT
     *
     * @mbggenerated Wed Jul 19 16:58:48 CST 2017
     */
    int updateByPrimaryKeySelective(PaymentSubjectEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_SUBJECT
     *
     * @mbggenerated Wed Jul 19 16:58:48 CST 2017
     */
    int updateByPrimaryKey(PaymentSubjectEntity record);
}
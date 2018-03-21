package com.lanmao.data.sync.dao.db2;

import com.lanmao.data.sync.dao.entity.PaymentOrderCountEntity;
import com.lanmao.data.sync.dao.entity.PaymentOrderCountEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentOrderCountEntityMapper extends PageQueryMapper<PaymentOrderCountEntity> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_ORDER_COUNT
     *
     * @mbggenerated Wed Jan 17 10:20:49 CST 2018
     */
    int countByExample(PaymentOrderCountEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_ORDER_COUNT
     *
     * @mbggenerated Wed Jan 17 10:20:49 CST 2018
     */
    int deleteByExample(PaymentOrderCountEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_ORDER_COUNT
     *
     * @mbggenerated Wed Jan 17 10:20:49 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_ORDER_COUNT
     *
     * @mbggenerated Wed Jan 17 10:20:49 CST 2018
     */
    int insert(PaymentOrderCountEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_ORDER_COUNT
     *
     * @mbggenerated Wed Jan 17 10:20:49 CST 2018
     */
    int insertSelective(PaymentOrderCountEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_ORDER_COUNT
     *
     * @mbggenerated Wed Jan 17 10:20:49 CST 2018
     */
    List<PaymentOrderCountEntity> selectByExample(PaymentOrderCountEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_ORDER_COUNT
     *
     * @mbggenerated Wed Jan 17 10:20:49 CST 2018
     */
    PaymentOrderCountEntity selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_ORDER_COUNT
     *
     * @mbggenerated Wed Jan 17 10:20:49 CST 2018
     */
    int updateByExampleSelective(@Param("record") PaymentOrderCountEntity record, @Param("example") PaymentOrderCountEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_ORDER_COUNT
     *
     * @mbggenerated Wed Jan 17 10:20:49 CST 2018
     */
    int updateByExample(@Param("record") PaymentOrderCountEntity record, @Param("example") PaymentOrderCountEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_ORDER_COUNT
     *
     * @mbggenerated Wed Jan 17 10:20:49 CST 2018
     */
    int updateByPrimaryKeySelective(PaymentOrderCountEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_ORDER_COUNT
     *
     * @mbggenerated Wed Jan 17 10:20:49 CST 2018
     */
    int updateByPrimaryKey(PaymentOrderCountEntity record);

    void batchInsert(List<PaymentOrderCountEntity> list);
}
package com.lanmao.data.sync.dao.oracle;

import java.util.Date;
import java.util.List;

import com.lanmao.data.sync.dao.entity.PaymentProfitDailyEntity;
import com.lanmao.data.sync.dao.entity.PaymentProfitDailyEntityExample;
import org.apache.ibatis.annotations.Param;

public interface PaymentProfitDailyEntityMapper extends SaveDataMapper<PaymentProfitDailyEntity> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_PROFIT_DAILY
     *
     * @mbggenerated Wed Oct 11 15:40:52 CST 2017
     */
    int countByExample(PaymentProfitDailyEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_PROFIT_DAILY
     *
     * @mbggenerated Wed Oct 11 15:40:52 CST 2017
     */
    int deleteByExample(PaymentProfitDailyEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_PROFIT_DAILY
     *
     * @mbggenerated Wed Oct 11 15:40:52 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_PROFIT_DAILY
     *
     * @mbggenerated Wed Oct 11 15:40:52 CST 2017
     */
    int insert(PaymentProfitDailyEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_PROFIT_DAILY
     *
     * @mbggenerated Wed Oct 11 15:40:52 CST 2017
     */
    int insertSelective(PaymentProfitDailyEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_PROFIT_DAILY
     *
     * @mbggenerated Wed Oct 11 15:40:52 CST 2017
     */
    List<PaymentProfitDailyEntity> selectByExample(PaymentProfitDailyEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_PROFIT_DAILY
     *
     * @mbggenerated Wed Oct 11 15:40:52 CST 2017
     */
    PaymentProfitDailyEntity selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_PROFIT_DAILY
     *
     * @mbggenerated Wed Oct 11 15:40:52 CST 2017
     */
    int updateByExampleSelective(@Param("record") PaymentProfitDailyEntity record, @Param("example") PaymentProfitDailyEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_PROFIT_DAILY
     *
     * @mbggenerated Wed Oct 11 15:40:52 CST 2017
     */
    int updateByExample(@Param("record") PaymentProfitDailyEntity record, @Param("example") PaymentProfitDailyEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_PROFIT_DAILY
     *
     * @mbggenerated Wed Oct 11 15:40:52 CST 2017
     */
    int updateByPrimaryKeySelective(PaymentProfitDailyEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_PROFIT_DAILY
     *
     * @mbggenerated Wed Oct 11 15:40:52 CST 2017
     */
    int updateByPrimaryKey(PaymentProfitDailyEntity record);
    
    
    int batchInsert(List<PaymentProfitDailyEntity> record);
    
    /**
     * TODO 根据日总计计算月总计
     * @param startDate
     * @param endDate
     * @return
     */
    List<PaymentProfitDailyEntity> countMonthlyProfit(@Param("startDate") Date startDate, @Param("endDate") Date endDate, @Param("payCompany") String payCompany);
    
}
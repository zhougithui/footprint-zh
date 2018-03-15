package com.lanmao.data.sync.dao.db2;

import java.util.List;

import com.lanmao.data.sync.dao.entity.PaymentCompanyEntity;
import com.lanmao.data.sync.dao.entity.PaymentCompanyEntityExample;
import org.apache.ibatis.annotations.Param;

public interface PaymentCompanyEntityMapper extends PageQueryMapper<PaymentCompanyEntity> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_COMPANY
     *
     * @mbggenerated Tue Jan 30 12:50:03 CST 2018
     */
    int countByExample(PaymentCompanyEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_COMPANY
     *
     * @mbggenerated Tue Jan 30 12:50:03 CST 2018
     */
    int deleteByExample(PaymentCompanyEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_COMPANY
     *
     * @mbggenerated Tue Jan 30 12:50:03 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_COMPANY
     *
     * @mbggenerated Tue Jan 30 12:50:03 CST 2018
     */
    int insert(PaymentCompanyEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_COMPANY
     *
     * @mbggenerated Tue Jan 30 12:50:03 CST 2018
     */
    int insertSelective(PaymentCompanyEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_COMPANY
     *
     * @mbggenerated Tue Jan 30 12:50:03 CST 2018
     */
    List<PaymentCompanyEntity> selectByExample(PaymentCompanyEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_COMPANY
     *
     * @mbggenerated Tue Jan 30 12:50:03 CST 2018
     */
    PaymentCompanyEntity selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_COMPANY
     *
     * @mbggenerated Tue Jan 30 12:50:03 CST 2018
     */
    int updateByExampleSelective(@Param("record") PaymentCompanyEntity record, @Param("example") PaymentCompanyEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_COMPANY
     *
     * @mbggenerated Tue Jan 30 12:50:03 CST 2018
     */
    int updateByExample(@Param("record") PaymentCompanyEntity record, @Param("example") PaymentCompanyEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_COMPANY
     *
     * @mbggenerated Tue Jan 30 12:50:03 CST 2018
     */
    int updateByPrimaryKeySelective(PaymentCompanyEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_COMPANY
     *
     * @mbggenerated Tue Jan 30 12:50:03 CST 2018
     */
    int updateByPrimaryKey(PaymentCompanyEntity record);
}
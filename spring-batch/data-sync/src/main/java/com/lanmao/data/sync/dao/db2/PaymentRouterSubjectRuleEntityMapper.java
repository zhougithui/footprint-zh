package com.lanmao.data.sync.dao.db2;

import java.util.List;

import com.lanmao.data.sync.dao.entity.PaymentRouterSubjectRuleEntity;
import com.lanmao.data.sync.dao.entity.PaymentRouteSubjectRuleEntityExample;
import com.lanmao.data.sync.dao.entity.PaymentRouterSubjectRuleEntityKey;
import org.apache.ibatis.annotations.Param;

public interface PaymentRouterSubjectRuleEntityMapper extends PageQueryMapper<PaymentRouterSubjectRuleEntity> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_ROUTER_SUBJECT_RULE
     *
     * @mbggenerated Thu Apr 07 17:18:59 CST 2016
     */
    int countByExample(PaymentRouteSubjectRuleEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_ROUTER_SUBJECT_RULE
     *
     * @mbggenerated Thu Apr 07 17:18:59 CST 2016
     */
    int deleteByExample(PaymentRouteSubjectRuleEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_ROUTER_SUBJECT_RULE
     *
     * @mbggenerated Thu Apr 07 17:18:59 CST 2016
     */
    int deleteByPrimaryKey(PaymentRouterSubjectRuleEntityKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_ROUTER_SUBJECT_RULE
     *
     * @mbggenerated Thu Apr 07 17:18:59 CST 2016
     */
    int insert(PaymentRouterSubjectRuleEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_ROUTER_SUBJECT_RULE
     *
     * @mbggenerated Thu Apr 07 17:18:59 CST 2016
     */
    int insertSelective(PaymentRouterSubjectRuleEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_ROUTER_SUBJECT_RULE
     *
     * @mbggenerated Thu Apr 07 17:18:59 CST 2016
     */
    List<PaymentRouterSubjectRuleEntity> selectByExample(PaymentRouteSubjectRuleEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_ROUTER_SUBJECT_RULE
     *
     * @mbggenerated Thu Apr 07 17:18:59 CST 2016
     */
    PaymentRouterSubjectRuleEntity selectByPrimaryKey(PaymentRouterSubjectRuleEntityKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_ROUTER_SUBJECT_RULE
     *
     * @mbggenerated Thu Apr 07 17:18:59 CST 2016
     */
    int updateByExampleSelective(@Param("record") PaymentRouterSubjectRuleEntity record, @Param("example") PaymentRouteSubjectRuleEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_ROUTER_SUBJECT_RULE
     *
     * @mbggenerated Thu Apr 07 17:18:59 CST 2016
     */
    int updateByExample(@Param("record") PaymentRouterSubjectRuleEntity record, @Param("example") PaymentRouteSubjectRuleEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_ROUTER_SUBJECT_RULE
     *
     * @mbggenerated Thu Apr 07 17:18:59 CST 2016
     */
    int updateByPrimaryKeySelective(PaymentRouterSubjectRuleEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_PAYMENT_ROUTER_SUBJECT_RULE
     *
     * @mbggenerated Thu Apr 07 17:18:59 CST 2016
     */
    int updateByPrimaryKey(PaymentRouterSubjectRuleEntity record);
}
package com.lanmao.data.sync.dao.db2;

import java.util.List;

import com.lanmao.data.sync.dao.entity.CertMerchantAuthorizationEntity;
import com.lanmao.data.sync.dao.entity.CertMerchantAuthorizationEntityExample;
import org.apache.ibatis.annotations.Param;

public interface CertMerchantAuthorizationEntityMapper extends PageQueryMapper<CertMerchantAuthorizationEntity> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_CERT_MERCHANT_AUTHORIZATION
     *
     * @mbggenerated Thu Oct 26 16:06:39 CST 2017
     */
    int countByExample(CertMerchantAuthorizationEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_CERT_MERCHANT_AUTHORIZATION
     *
     * @mbggenerated Thu Oct 26 16:06:39 CST 2017
     */
    int deleteByExample(CertMerchantAuthorizationEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_CERT_MERCHANT_AUTHORIZATION
     *
     * @mbggenerated Thu Oct 26 16:06:39 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_CERT_MERCHANT_AUTHORIZATION
     *
     * @mbggenerated Thu Oct 26 16:06:39 CST 2017
     */
    int insert(CertMerchantAuthorizationEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_CERT_MERCHANT_AUTHORIZATION
     *
     * @mbggenerated Thu Oct 26 16:06:39 CST 2017
     */
    int insertSelective(CertMerchantAuthorizationEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_CERT_MERCHANT_AUTHORIZATION
     *
     * @mbggenerated Thu Oct 26 16:06:39 CST 2017
     */
    List<CertMerchantAuthorizationEntity> selectByExample(CertMerchantAuthorizationEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_CERT_MERCHANT_AUTHORIZATION
     *
     * @mbggenerated Thu Oct 26 16:06:39 CST 2017
     */
    CertMerchantAuthorizationEntity selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_CERT_MERCHANT_AUTHORIZATION
     *
     * @mbggenerated Thu Oct 26 16:06:39 CST 2017
     */
    int updateByExampleSelective(@Param("record") CertMerchantAuthorizationEntity record, @Param("example") CertMerchantAuthorizationEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_CERT_MERCHANT_AUTHORIZATION
     *
     * @mbggenerated Thu Oct 26 16:06:39 CST 2017
     */
    int updateByExample(@Param("record") CertMerchantAuthorizationEntity record, @Param("example") CertMerchantAuthorizationEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_CERT_MERCHANT_AUTHORIZATION
     *
     * @mbggenerated Thu Oct 26 16:06:39 CST 2017
     */
    int updateByPrimaryKeySelective(CertMerchantAuthorizationEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_CERT_MERCHANT_AUTHORIZATION
     *
     * @mbggenerated Thu Oct 26 16:06:39 CST 2017
     */
    int updateByPrimaryKey(CertMerchantAuthorizationEntity record);
}
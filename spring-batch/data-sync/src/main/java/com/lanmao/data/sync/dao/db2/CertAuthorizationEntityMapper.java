package com.lanmao.data.sync.dao.db2;

import java.util.List;

import com.lanmao.data.sync.dao.entity.CertAuthorizationEntity;
import com.lanmao.data.sync.dao.entity.CertAuthorizationEntityExample;
import org.apache.ibatis.annotations.Param;

public interface CertAuthorizationEntityMapper extends PageQueryMapper<CertAuthorizationEntity> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_CERT_AUTHORIZATION
     *
     * @mbggenerated Wed Oct 25 16:45:43 CST 2017
     */
    int countByExample(CertAuthorizationEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_CERT_AUTHORIZATION
     *
     * @mbggenerated Wed Oct 25 16:45:43 CST 2017
     */
    int deleteByExample(CertAuthorizationEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_CERT_AUTHORIZATION
     *
     * @mbggenerated Wed Oct 25 16:45:43 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_CERT_AUTHORIZATION
     *
     * @mbggenerated Wed Oct 25 16:45:43 CST 2017
     */
    int insert(CertAuthorizationEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_CERT_AUTHORIZATION
     *
     * @mbggenerated Wed Oct 25 16:45:43 CST 2017
     */
    int insertSelective(CertAuthorizationEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_CERT_AUTHORIZATION
     *
     * @mbggenerated Wed Oct 25 16:45:43 CST 2017
     */
    List<CertAuthorizationEntity> selectByExample(CertAuthorizationEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_CERT_AUTHORIZATION
     *
     * @mbggenerated Wed Oct 25 16:45:43 CST 2017
     */
    CertAuthorizationEntity selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_CERT_AUTHORIZATION
     *
     * @mbggenerated Wed Oct 25 16:45:43 CST 2017
     */
    int updateByExampleSelective(@Param("record") CertAuthorizationEntity record, @Param("example") CertAuthorizationEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_CERT_AUTHORIZATION
     *
     * @mbggenerated Wed Oct 25 16:45:43 CST 2017
     */
    int updateByExample(@Param("record") CertAuthorizationEntity record, @Param("example") CertAuthorizationEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_CERT_AUTHORIZATION
     *
     * @mbggenerated Wed Oct 25 16:45:43 CST 2017
     */
    int updateByPrimaryKeySelective(CertAuthorizationEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_CERT_AUTHORIZATION
     *
     * @mbggenerated Wed Oct 25 16:45:43 CST 2017
     */
    int updateByPrimaryKey(CertAuthorizationEntity record);
}
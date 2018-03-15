package com.lanmao.data.sync.dao.db2;

import java.util.List;

import com.lanmao.data.sync.dao.entity.CertOrderEntity;
import com.lanmao.data.sync.dao.entity.CertOrderEntityExample;
import org.apache.ibatis.annotations.Param;

public interface CertOrderEntityMapper extends PageQueryMapper<CertOrderEntity> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_CERT_ORDER
     *
     * @mbggenerated Wed Oct 25 16:45:43 CST 2017
     */
    int countByExample(CertOrderEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_CERT_ORDER
     *
     * @mbggenerated Wed Oct 25 16:45:43 CST 2017
     */
    int deleteByExample(CertOrderEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_CERT_ORDER
     *
     * @mbggenerated Wed Oct 25 16:45:43 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_CERT_ORDER
     *
     * @mbggenerated Wed Oct 25 16:45:43 CST 2017
     */
    int insert(CertOrderEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_CERT_ORDER
     *
     * @mbggenerated Wed Oct 25 16:45:43 CST 2017
     */
    int insertSelective(CertOrderEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_CERT_ORDER
     *
     * @mbggenerated Wed Oct 25 16:45:43 CST 2017
     */
    List<CertOrderEntity> selectByExample(CertOrderEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_CERT_ORDER
     *
     * @mbggenerated Wed Oct 25 16:45:43 CST 2017
     */
    CertOrderEntity selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_CERT_ORDER
     *
     * @mbggenerated Wed Oct 25 16:45:43 CST 2017
     */
    int updateByExampleSelective(@Param("record") CertOrderEntity record, @Param("example") CertOrderEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_CERT_ORDER
     *
     * @mbggenerated Wed Oct 25 16:45:43 CST 2017
     */
    int updateByExample(@Param("record") CertOrderEntity record, @Param("example") CertOrderEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_CERT_ORDER
     *
     * @mbggenerated Wed Oct 25 16:45:43 CST 2017
     */
    int updateByPrimaryKeySelective(CertOrderEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_CERT_ORDER
     *
     * @mbggenerated Wed Oct 25 16:45:43 CST 2017
     */
    int updateByPrimaryKey(CertOrderEntity record);
}
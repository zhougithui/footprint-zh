package com.lanmao.data.sync.dao.db2;

import java.util.List;

import com.lanmao.data.sync.dao.entity.AuthRecordEntity;
import com.lanmao.data.sync.dao.entity.AuthRecordEntityExample;
import org.apache.ibatis.annotations.Param;

public interface AuthRecordEntityMapper extends PageQueryMapper<AuthRecordEntity> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_AUTH_RECORD
     *
     * @mbggenerated Tue Jan 16 10:17:38 CST 2018
     */
    int countByExample(AuthRecordEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_AUTH_RECORD
     *
     * @mbggenerated Tue Jan 16 10:17:38 CST 2018
     */
    int deleteByExample(AuthRecordEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_AUTH_RECORD
     *
     * @mbggenerated Tue Jan 16 10:17:38 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_AUTH_RECORD
     *
     * @mbggenerated Tue Jan 16 10:17:38 CST 2018
     */
    int insert(AuthRecordEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_AUTH_RECORD
     *
     * @mbggenerated Tue Jan 16 10:17:38 CST 2018
     */
    int insertSelective(AuthRecordEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_AUTH_RECORD
     *
     * @mbggenerated Tue Jan 16 10:17:38 CST 2018
     */
    List<AuthRecordEntity> selectByExample(AuthRecordEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_AUTH_RECORD
     *
     * @mbggenerated Tue Jan 16 10:17:38 CST 2018
     */
    AuthRecordEntity selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_AUTH_RECORD
     *
     * @mbggenerated Tue Jan 16 10:17:38 CST 2018
     */
    int updateByExampleSelective(@Param("record") AuthRecordEntity record, @Param("example") AuthRecordEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_AUTH_RECORD
     *
     * @mbggenerated Tue Jan 16 10:17:38 CST 2018
     */
    int updateByExample(@Param("record") AuthRecordEntity record, @Param("example") AuthRecordEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_AUTH_RECORD
     *
     * @mbggenerated Tue Jan 16 10:17:38 CST 2018
     */
    int updateByPrimaryKeySelective(AuthRecordEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_AUTH_RECORD
     *
     * @mbggenerated Tue Jan 16 10:17:38 CST 2018
     */
    int updateByPrimaryKey(AuthRecordEntity record);
}
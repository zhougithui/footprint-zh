package com.lanmao.data.sync.dao.db2;

import com.lanmao.data.sync.dao.entity.AuthOrderEntity;
import com.lanmao.data.sync.dao.entity.AuthOrderEntityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AuthOrderEntityMapper extends PageQueryMapper<AuthOrderEntity> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_AUTH_ORDER
     *
     * @mbggenerated Tue Jan 16 10:17:38 CST 2018
     */
    int countByExample(AuthOrderEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_AUTH_ORDER
     *
     * @mbggenerated Tue Jan 16 10:17:38 CST 2018
     */
    int deleteByExample(AuthOrderEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_AUTH_ORDER
     *
     * @mbggenerated Tue Jan 16 10:17:38 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_AUTH_ORDER
     *
     * @mbggenerated Tue Jan 16 10:17:38 CST 2018
     */
    int insert(AuthOrderEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_AUTH_ORDER
     *
     * @mbggenerated Tue Jan 16 10:17:38 CST 2018
     */
    int insertSelective(AuthOrderEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_AUTH_ORDER
     *
     * @mbggenerated Tue Jan 16 10:17:38 CST 2018
     */
    List<AuthOrderEntity> selectByExample(AuthOrderEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_AUTH_ORDER
     *
     * @mbggenerated Tue Jan 16 10:17:38 CST 2018
     */
    AuthOrderEntity selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_AUTH_ORDER
     *
     * @mbggenerated Tue Jan 16 10:17:38 CST 2018
     */
    int updateByExampleSelective(@Param("record") AuthOrderEntity record, @Param("example") AuthOrderEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_AUTH_ORDER
     *
     * @mbggenerated Tue Jan 16 10:17:38 CST 2018
     */
    int updateByExample(@Param("record") AuthOrderEntity record, @Param("example") AuthOrderEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_AUTH_ORDER
     *
     * @mbggenerated Tue Jan 16 10:17:38 CST 2018
     */
    int updateByPrimaryKeySelective(AuthOrderEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LM_PAY.T_AUTH_ORDER
     *
     * @mbggenerated Tue Jan 16 10:17:38 CST 2018
     */
    int updateByPrimaryKey(AuthOrderEntity record);

}
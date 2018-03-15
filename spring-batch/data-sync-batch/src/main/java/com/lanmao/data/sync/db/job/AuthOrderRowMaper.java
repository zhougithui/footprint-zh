package com.lanmao.data.sync.db.job;

import com.lanmao.data.sync.db.oracle.entity.AuthOrderEntity;
import org.apache.commons.lang3.StringUtils;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author hui.zhou 11:33 2018/3/7
 */
public class AuthOrderRowMaper implements RowMapper<AuthOrderEntity> {

    @Nullable
    @Override
    public AuthOrderEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        AuthOrderEntity entity = new AuthOrderEntity();
        entity.setId(rs.getLong("ID"));
        entity.setStatus(rs.getString("STATUS"));
        entity.setSubjectNo(rs.getString("SUBJECT_NO"));
        entity.setInitiator(rs.getString("INITIATOR"));
        entity.setRequestNo(rs.getString("REQUEST_NO"));
        entity.setAuthNo(rs.getString("AUTH_NO"));
        entity.setCardNo(rs.getString("CARD_NO"));
        entity.setCardHolder(rs.getString("CARD_HOLDER"));
        entity.setCredNum(rs.getString("CRED_NUM"));
        entity.setMobile(rs.getString("MOBILE"));
        entity.setMerchantOrderNo(rs.getString("MERCHANT_ORDER_NO"));
        entity.setCreateTime(rs.getDate("CREATE_TIME"));
        entity.setCompleteTime(rs.getDate("COMPLETE_TIME"));
        entity.setBank(rs.getString("BANK"));
        entity.setAuthFactor(rs.getString("AUTH_FACTOR"));
        entity.setCnaps(rs.getString("CNAPS"));
        entity.setAuthMode(rs.getString("AUTH_MODE"));
        entity.setBizType(rs.getString("BIZ_TYPE"));
        entity.setPlatform(rs.getString("PLATFORM"));
        entity.setAuthChannel(rs.getString("AUTH_CHANNEL"));
        entity.setMerchantNo(rs.getString("MERCHANT_NO"));
        entity.setErrorCode(rs.getString("ERROR_CODE"));
        entity.setErrorMessage(rs.getString("ERROR_MESSAGE"));
        entity.setTranslateErrorCode(rs.getString("TRANSLATE_ERROR_CODE"));
        entity.setTranslateErrorMessage(rs.getString("TRANSLATE_ERROR_MESSAGE"));
        entity.setConsumeTime(rs.getLong("CONSUME_TIME"));
        return entity;
    }
}

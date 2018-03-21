package com.lanmao.data.sync.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CertRecordEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CertRecordEntityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("ORDER_NO =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("ORDER_NO <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("ORDER_NO >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_NO >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("ORDER_NO <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("ORDER_NO <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("ORDER_NO like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("ORDER_NO not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("ORDER_NO in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("ORDER_NO not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("ORDER_NO between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("ORDER_NO not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCertRequestNoIsNull() {
            addCriterion("CERT_REQUEST_NO is null");
            return (Criteria) this;
        }

        public Criteria andCertRequestNoIsNotNull() {
            addCriterion("CERT_REQUEST_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCertRequestNoEqualTo(String value) {
            addCriterion("CERT_REQUEST_NO =", value, "certRequestNo");
            return (Criteria) this;
        }

        public Criteria andCertRequestNoNotEqualTo(String value) {
            addCriterion("CERT_REQUEST_NO <>", value, "certRequestNo");
            return (Criteria) this;
        }

        public Criteria andCertRequestNoGreaterThan(String value) {
            addCriterion("CERT_REQUEST_NO >", value, "certRequestNo");
            return (Criteria) this;
        }

        public Criteria andCertRequestNoGreaterThanOrEqualTo(String value) {
            addCriterion("CERT_REQUEST_NO >=", value, "certRequestNo");
            return (Criteria) this;
        }

        public Criteria andCertRequestNoLessThan(String value) {
            addCriterion("CERT_REQUEST_NO <", value, "certRequestNo");
            return (Criteria) this;
        }

        public Criteria andCertRequestNoLessThanOrEqualTo(String value) {
            addCriterion("CERT_REQUEST_NO <=", value, "certRequestNo");
            return (Criteria) this;
        }

        public Criteria andCertRequestNoLike(String value) {
            addCriterion("CERT_REQUEST_NO like", value, "certRequestNo");
            return (Criteria) this;
        }

        public Criteria andCertRequestNoNotLike(String value) {
            addCriterion("CERT_REQUEST_NO not like", value, "certRequestNo");
            return (Criteria) this;
        }

        public Criteria andCertRequestNoIn(List<String> values) {
            addCriterion("CERT_REQUEST_NO in", values, "certRequestNo");
            return (Criteria) this;
        }

        public Criteria andCertRequestNoNotIn(List<String> values) {
            addCriterion("CERT_REQUEST_NO not in", values, "certRequestNo");
            return (Criteria) this;
        }

        public Criteria andCertRequestNoBetween(String value1, String value2) {
            addCriterion("CERT_REQUEST_NO between", value1, value2, "certRequestNo");
            return (Criteria) this;
        }

        public Criteria andCertRequestNoNotBetween(String value1, String value2) {
            addCriterion("CERT_REQUEST_NO not between", value1, value2, "certRequestNo");
            return (Criteria) this;
        }

        public Criteria andCertChannelIsNull() {
            addCriterion("CERT_CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andCertChannelIsNotNull() {
            addCriterion("CERT_CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andCertChannelEqualTo(String value) {
            addCriterion("CERT_CHANNEL =", value, "certChannel");
            return (Criteria) this;
        }

        public Criteria andCertChannelNotEqualTo(String value) {
            addCriterion("CERT_CHANNEL <>", value, "certChannel");
            return (Criteria) this;
        }

        public Criteria andCertChannelGreaterThan(String value) {
            addCriterion("CERT_CHANNEL >", value, "certChannel");
            return (Criteria) this;
        }

        public Criteria andCertChannelGreaterThanOrEqualTo(String value) {
            addCriterion("CERT_CHANNEL >=", value, "certChannel");
            return (Criteria) this;
        }

        public Criteria andCertChannelLessThan(String value) {
            addCriterion("CERT_CHANNEL <", value, "certChannel");
            return (Criteria) this;
        }

        public Criteria andCertChannelLessThanOrEqualTo(String value) {
            addCriterion("CERT_CHANNEL <=", value, "certChannel");
            return (Criteria) this;
        }

        public Criteria andCertChannelLike(String value) {
            addCriterion("CERT_CHANNEL like", value, "certChannel");
            return (Criteria) this;
        }

        public Criteria andCertChannelNotLike(String value) {
            addCriterion("CERT_CHANNEL not like", value, "certChannel");
            return (Criteria) this;
        }

        public Criteria andCertChannelIn(List<String> values) {
            addCriterion("CERT_CHANNEL in", values, "certChannel");
            return (Criteria) this;
        }

        public Criteria andCertChannelNotIn(List<String> values) {
            addCriterion("CERT_CHANNEL not in", values, "certChannel");
            return (Criteria) this;
        }

        public Criteria andCertChannelBetween(String value1, String value2) {
            addCriterion("CERT_CHANNEL between", value1, value2, "certChannel");
            return (Criteria) this;
        }

        public Criteria andCertChannelNotBetween(String value1, String value2) {
            addCriterion("CERT_CHANNEL not between", value1, value2, "certChannel");
            return (Criteria) this;
        }

        public Criteria andCertChannelOrderNoIsNull() {
            addCriterion("CERT_CHANNEL_ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andCertChannelOrderNoIsNotNull() {
            addCriterion("CERT_CHANNEL_ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCertChannelOrderNoEqualTo(String value) {
            addCriterion("CERT_CHANNEL_ORDER_NO =", value, "certChannelOrderNo");
            return (Criteria) this;
        }

        public Criteria andCertChannelOrderNoNotEqualTo(String value) {
            addCriterion("CERT_CHANNEL_ORDER_NO <>", value, "certChannelOrderNo");
            return (Criteria) this;
        }

        public Criteria andCertChannelOrderNoGreaterThan(String value) {
            addCriterion("CERT_CHANNEL_ORDER_NO >", value, "certChannelOrderNo");
            return (Criteria) this;
        }

        public Criteria andCertChannelOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("CERT_CHANNEL_ORDER_NO >=", value, "certChannelOrderNo");
            return (Criteria) this;
        }

        public Criteria andCertChannelOrderNoLessThan(String value) {
            addCriterion("CERT_CHANNEL_ORDER_NO <", value, "certChannelOrderNo");
            return (Criteria) this;
        }

        public Criteria andCertChannelOrderNoLessThanOrEqualTo(String value) {
            addCriterion("CERT_CHANNEL_ORDER_NO <=", value, "certChannelOrderNo");
            return (Criteria) this;
        }

        public Criteria andCertChannelOrderNoLike(String value) {
            addCriterion("CERT_CHANNEL_ORDER_NO like", value, "certChannelOrderNo");
            return (Criteria) this;
        }

        public Criteria andCertChannelOrderNoNotLike(String value) {
            addCriterion("CERT_CHANNEL_ORDER_NO not like", value, "certChannelOrderNo");
            return (Criteria) this;
        }

        public Criteria andCertChannelOrderNoIn(List<String> values) {
            addCriterion("CERT_CHANNEL_ORDER_NO in", values, "certChannelOrderNo");
            return (Criteria) this;
        }

        public Criteria andCertChannelOrderNoNotIn(List<String> values) {
            addCriterion("CERT_CHANNEL_ORDER_NO not in", values, "certChannelOrderNo");
            return (Criteria) this;
        }

        public Criteria andCertChannelOrderNoBetween(String value1, String value2) {
            addCriterion("CERT_CHANNEL_ORDER_NO between", value1, value2, "certChannelOrderNo");
            return (Criteria) this;
        }

        public Criteria andCertChannelOrderNoNotBetween(String value1, String value2) {
            addCriterion("CERT_CHANNEL_ORDER_NO not between", value1, value2, "certChannelOrderNo");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIsNull() {
            addCriterion("COMPLETE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIsNotNull() {
            addCriterion("COMPLETE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeEqualTo(Date value) {
            addCriterion("COMPLETE_TIME =", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotEqualTo(Date value) {
            addCriterion("COMPLETE_TIME <>", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeGreaterThan(Date value) {
            addCriterion("COMPLETE_TIME >", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("COMPLETE_TIME >=", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeLessThan(Date value) {
            addCriterion("COMPLETE_TIME <", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("COMPLETE_TIME <=", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIn(List<Date> values) {
            addCriterion("COMPLETE_TIME in", values, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotIn(List<Date> values) {
            addCriterion("COMPLETE_TIME not in", values, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeBetween(Date value1, Date value2) {
            addCriterion("COMPLETE_TIME between", value1, value2, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("COMPLETE_TIME not between", value1, value2, "completeTime");
            return (Criteria) this;
        }

        public Criteria andManageStateIsNull() {
            addCriterion("MANAGE_STATE is null");
            return (Criteria) this;
        }

        public Criteria andManageStateIsNotNull() {
            addCriterion("MANAGE_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andManageStateEqualTo(String value) {
            addCriterion("MANAGE_STATE =", value, "manageState");
            return (Criteria) this;
        }

        public Criteria andManageStateNotEqualTo(String value) {
            addCriterion("MANAGE_STATE <>", value, "manageState");
            return (Criteria) this;
        }

        public Criteria andManageStateGreaterThan(String value) {
            addCriterion("MANAGE_STATE >", value, "manageState");
            return (Criteria) this;
        }

        public Criteria andManageStateGreaterThanOrEqualTo(String value) {
            addCriterion("MANAGE_STATE >=", value, "manageState");
            return (Criteria) this;
        }

        public Criteria andManageStateLessThan(String value) {
            addCriterion("MANAGE_STATE <", value, "manageState");
            return (Criteria) this;
        }

        public Criteria andManageStateLessThanOrEqualTo(String value) {
            addCriterion("MANAGE_STATE <=", value, "manageState");
            return (Criteria) this;
        }

        public Criteria andManageStateLike(String value) {
            addCriterion("MANAGE_STATE like", value, "manageState");
            return (Criteria) this;
        }

        public Criteria andManageStateNotLike(String value) {
            addCriterion("MANAGE_STATE not like", value, "manageState");
            return (Criteria) this;
        }

        public Criteria andManageStateIn(List<String> values) {
            addCriterion("MANAGE_STATE in", values, "manageState");
            return (Criteria) this;
        }

        public Criteria andManageStateNotIn(List<String> values) {
            addCriterion("MANAGE_STATE not in", values, "manageState");
            return (Criteria) this;
        }

        public Criteria andManageStateBetween(String value1, String value2) {
            addCriterion("MANAGE_STATE between", value1, value2, "manageState");
            return (Criteria) this;
        }

        public Criteria andManageStateNotBetween(String value1, String value2) {
            addCriterion("MANAGE_STATE not between", value1, value2, "manageState");
            return (Criteria) this;
        }

        public Criteria andErrorCodeIsNull() {
            addCriterion("ERROR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andErrorCodeIsNotNull() {
            addCriterion("ERROR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andErrorCodeEqualTo(String value) {
            addCriterion("ERROR_CODE =", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotEqualTo(String value) {
            addCriterion("ERROR_CODE <>", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeGreaterThan(String value) {
            addCriterion("ERROR_CODE >", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ERROR_CODE >=", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLessThan(String value) {
            addCriterion("ERROR_CODE <", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLessThanOrEqualTo(String value) {
            addCriterion("ERROR_CODE <=", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLike(String value) {
            addCriterion("ERROR_CODE like", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotLike(String value) {
            addCriterion("ERROR_CODE not like", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeIn(List<String> values) {
            addCriterion("ERROR_CODE in", values, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotIn(List<String> values) {
            addCriterion("ERROR_CODE not in", values, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeBetween(String value1, String value2) {
            addCriterion("ERROR_CODE between", value1, value2, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotBetween(String value1, String value2) {
            addCriterion("ERROR_CODE not between", value1, value2, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorMessageIsNull() {
            addCriterion("ERROR_MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andErrorMessageIsNotNull() {
            addCriterion("ERROR_MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andErrorMessageEqualTo(String value) {
            addCriterion("ERROR_MESSAGE =", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageNotEqualTo(String value) {
            addCriterion("ERROR_MESSAGE <>", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageGreaterThan(String value) {
            addCriterion("ERROR_MESSAGE >", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageGreaterThanOrEqualTo(String value) {
            addCriterion("ERROR_MESSAGE >=", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageLessThan(String value) {
            addCriterion("ERROR_MESSAGE <", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageLessThanOrEqualTo(String value) {
            addCriterion("ERROR_MESSAGE <=", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageLike(String value) {
            addCriterion("ERROR_MESSAGE like", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageNotLike(String value) {
            addCriterion("ERROR_MESSAGE not like", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageIn(List<String> values) {
            addCriterion("ERROR_MESSAGE in", values, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageNotIn(List<String> values) {
            addCriterion("ERROR_MESSAGE not in", values, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageBetween(String value1, String value2) {
            addCriterion("ERROR_MESSAGE between", value1, value2, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageNotBetween(String value1, String value2) {
            addCriterion("ERROR_MESSAGE not between", value1, value2, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andDetailInfoIsNull() {
            addCriterion("DETAIL_INFO is null");
            return (Criteria) this;
        }

        public Criteria andDetailInfoIsNotNull() {
            addCriterion("DETAIL_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andDetailInfoEqualTo(String value) {
            addCriterion("DETAIL_INFO =", value, "detailInfo");
            return (Criteria) this;
        }

        public Criteria andDetailInfoNotEqualTo(String value) {
            addCriterion("DETAIL_INFO <>", value, "detailInfo");
            return (Criteria) this;
        }

        public Criteria andDetailInfoGreaterThan(String value) {
            addCriterion("DETAIL_INFO >", value, "detailInfo");
            return (Criteria) this;
        }

        public Criteria andDetailInfoGreaterThanOrEqualTo(String value) {
            addCriterion("DETAIL_INFO >=", value, "detailInfo");
            return (Criteria) this;
        }

        public Criteria andDetailInfoLessThan(String value) {
            addCriterion("DETAIL_INFO <", value, "detailInfo");
            return (Criteria) this;
        }

        public Criteria andDetailInfoLessThanOrEqualTo(String value) {
            addCriterion("DETAIL_INFO <=", value, "detailInfo");
            return (Criteria) this;
        }

        public Criteria andDetailInfoLike(String value) {
            addCriterion("DETAIL_INFO like", value, "detailInfo");
            return (Criteria) this;
        }

        public Criteria andDetailInfoNotLike(String value) {
            addCriterion("DETAIL_INFO not like", value, "detailInfo");
            return (Criteria) this;
        }

        public Criteria andDetailInfoIn(List<String> values) {
            addCriterion("DETAIL_INFO in", values, "detailInfo");
            return (Criteria) this;
        }

        public Criteria andDetailInfoNotIn(List<String> values) {
            addCriterion("DETAIL_INFO not in", values, "detailInfo");
            return (Criteria) this;
        }

        public Criteria andDetailInfoBetween(String value1, String value2) {
            addCriterion("DETAIL_INFO between", value1, value2, "detailInfo");
            return (Criteria) this;
        }

        public Criteria andDetailInfoNotBetween(String value1, String value2) {
            addCriterion("DETAIL_INFO not between", value1, value2, "detailInfo");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
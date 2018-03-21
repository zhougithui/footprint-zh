package com.lanmao.data.sync.dao.entity;

import java.util.ArrayList;
import java.util.List;

public class PaymentErrorCodeEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaymentErrorCodeEntityExample() {
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

        public Criteria andPayChannelIsNull() {
            addCriterion("PAY_CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andPayChannelIsNotNull() {
            addCriterion("PAY_CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andPayChannelEqualTo(String value) {
            addCriterion("PAY_CHANNEL =", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotEqualTo(String value) {
            addCriterion("PAY_CHANNEL <>", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelGreaterThan(String value) {
            addCriterion("PAY_CHANNEL >", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_CHANNEL >=", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLessThan(String value) {
            addCriterion("PAY_CHANNEL <", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLessThanOrEqualTo(String value) {
            addCriterion("PAY_CHANNEL <=", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLike(String value) {
            addCriterion("PAY_CHANNEL like", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotLike(String value) {
            addCriterion("PAY_CHANNEL not like", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelIn(List<String> values) {
            addCriterion("PAY_CHANNEL in", values, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotIn(List<String> values) {
            addCriterion("PAY_CHANNEL not in", values, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelBetween(String value1, String value2) {
            addCriterion("PAY_CHANNEL between", value1, value2, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotBetween(String value1, String value2) {
            addCriterion("PAY_CHANNEL not between", value1, value2, "payChannel");
            return (Criteria) this;
        }

        public Criteria andOriginErrorCodeIsNull() {
            addCriterion("ORIGIN_ERROR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOriginErrorCodeIsNotNull() {
            addCriterion("ORIGIN_ERROR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOriginErrorCodeEqualTo(String value) {
            addCriterion("ORIGIN_ERROR_CODE =", value, "originErrorCode");
            return (Criteria) this;
        }

        public Criteria andOriginErrorCodeNotEqualTo(String value) {
            addCriterion("ORIGIN_ERROR_CODE <>", value, "originErrorCode");
            return (Criteria) this;
        }

        public Criteria andOriginErrorCodeGreaterThan(String value) {
            addCriterion("ORIGIN_ERROR_CODE >", value, "originErrorCode");
            return (Criteria) this;
        }

        public Criteria andOriginErrorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGIN_ERROR_CODE >=", value, "originErrorCode");
            return (Criteria) this;
        }

        public Criteria andOriginErrorCodeLessThan(String value) {
            addCriterion("ORIGIN_ERROR_CODE <", value, "originErrorCode");
            return (Criteria) this;
        }

        public Criteria andOriginErrorCodeLessThanOrEqualTo(String value) {
            addCriterion("ORIGIN_ERROR_CODE <=", value, "originErrorCode");
            return (Criteria) this;
        }

        public Criteria andOriginErrorCodeLike(String value) {
            addCriterion("ORIGIN_ERROR_CODE like", value, "originErrorCode");
            return (Criteria) this;
        }

        public Criteria andOriginErrorCodeNotLike(String value) {
            addCriterion("ORIGIN_ERROR_CODE not like", value, "originErrorCode");
            return (Criteria) this;
        }

        public Criteria andOriginErrorCodeIn(List<String> values) {
            addCriterion("ORIGIN_ERROR_CODE in", values, "originErrorCode");
            return (Criteria) this;
        }

        public Criteria andOriginErrorCodeNotIn(List<String> values) {
            addCriterion("ORIGIN_ERROR_CODE not in", values, "originErrorCode");
            return (Criteria) this;
        }

        public Criteria andOriginErrorCodeBetween(String value1, String value2) {
            addCriterion("ORIGIN_ERROR_CODE between", value1, value2, "originErrorCode");
            return (Criteria) this;
        }

        public Criteria andOriginErrorCodeNotBetween(String value1, String value2) {
            addCriterion("ORIGIN_ERROR_CODE not between", value1, value2, "originErrorCode");
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

        public Criteria andOriginMessageIsNull() {
            addCriterion("ORIGIN_MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andOriginMessageIsNotNull() {
            addCriterion("ORIGIN_MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andOriginMessageEqualTo(String value) {
            addCriterion("ORIGIN_MESSAGE =", value, "originMessage");
            return (Criteria) this;
        }

        public Criteria andOriginMessageNotEqualTo(String value) {
            addCriterion("ORIGIN_MESSAGE <>", value, "originMessage");
            return (Criteria) this;
        }

        public Criteria andOriginMessageGreaterThan(String value) {
            addCriterion("ORIGIN_MESSAGE >", value, "originMessage");
            return (Criteria) this;
        }

        public Criteria andOriginMessageGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGIN_MESSAGE >=", value, "originMessage");
            return (Criteria) this;
        }

        public Criteria andOriginMessageLessThan(String value) {
            addCriterion("ORIGIN_MESSAGE <", value, "originMessage");
            return (Criteria) this;
        }

        public Criteria andOriginMessageLessThanOrEqualTo(String value) {
            addCriterion("ORIGIN_MESSAGE <=", value, "originMessage");
            return (Criteria) this;
        }

        public Criteria andOriginMessageLike(String value) {
            addCriterion("ORIGIN_MESSAGE like", value, "originMessage");
            return (Criteria) this;
        }

        public Criteria andOriginMessageNotLike(String value) {
            addCriterion("ORIGIN_MESSAGE not like", value, "originMessage");
            return (Criteria) this;
        }

        public Criteria andOriginMessageIn(List<String> values) {
            addCriterion("ORIGIN_MESSAGE in", values, "originMessage");
            return (Criteria) this;
        }

        public Criteria andOriginMessageNotIn(List<String> values) {
            addCriterion("ORIGIN_MESSAGE not in", values, "originMessage");
            return (Criteria) this;
        }

        public Criteria andOriginMessageBetween(String value1, String value2) {
            addCriterion("ORIGIN_MESSAGE between", value1, value2, "originMessage");
            return (Criteria) this;
        }

        public Criteria andOriginMessageNotBetween(String value1, String value2) {
            addCriterion("ORIGIN_MESSAGE not between", value1, value2, "originMessage");
            return (Criteria) this;
        }

        public Criteria andErrorTypeIsNull() {
            addCriterion("ERROR_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andErrorTypeIsNotNull() {
            addCriterion("ERROR_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andErrorTypeEqualTo(String value) {
            addCriterion("ERROR_TYPE =", value, "errorType");
            return (Criteria) this;
        }

        public Criteria andErrorTypeNotEqualTo(String value) {
            addCriterion("ERROR_TYPE <>", value, "errorType");
            return (Criteria) this;
        }

        public Criteria andErrorTypeGreaterThan(String value) {
            addCriterion("ERROR_TYPE >", value, "errorType");
            return (Criteria) this;
        }

        public Criteria andErrorTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ERROR_TYPE >=", value, "errorType");
            return (Criteria) this;
        }

        public Criteria andErrorTypeLessThan(String value) {
            addCriterion("ERROR_TYPE <", value, "errorType");
            return (Criteria) this;
        }

        public Criteria andErrorTypeLessThanOrEqualTo(String value) {
            addCriterion("ERROR_TYPE <=", value, "errorType");
            return (Criteria) this;
        }

        public Criteria andErrorTypeLike(String value) {
            addCriterion("ERROR_TYPE like", value, "errorType");
            return (Criteria) this;
        }

        public Criteria andErrorTypeNotLike(String value) {
            addCriterion("ERROR_TYPE not like", value, "errorType");
            return (Criteria) this;
        }

        public Criteria andErrorTypeIn(List<String> values) {
            addCriterion("ERROR_TYPE in", values, "errorType");
            return (Criteria) this;
        }

        public Criteria andErrorTypeNotIn(List<String> values) {
            addCriterion("ERROR_TYPE not in", values, "errorType");
            return (Criteria) this;
        }

        public Criteria andErrorTypeBetween(String value1, String value2) {
            addCriterion("ERROR_TYPE between", value1, value2, "errorType");
            return (Criteria) this;
        }

        public Criteria andErrorTypeNotBetween(String value1, String value2) {
            addCriterion("ERROR_TYPE not between", value1, value2, "errorType");
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
package com.lanmao.data.sync.dao.entity;

import java.util.ArrayList;
import java.util.List;

public class AuthRouterEntryEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuthRouterEntryEntityExample() {
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

        public Criteria andRouterIdIsNull() {
            addCriterion("ROUTER_ID is null");
            return (Criteria) this;
        }

        public Criteria andRouterIdIsNotNull() {
            addCriterion("ROUTER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRouterIdEqualTo(String value) {
            addCriterion("ROUTER_ID =", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdNotEqualTo(String value) {
            addCriterion("ROUTER_ID <>", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdGreaterThan(String value) {
            addCriterion("ROUTER_ID >", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdGreaterThanOrEqualTo(String value) {
            addCriterion("ROUTER_ID >=", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdLessThan(String value) {
            addCriterion("ROUTER_ID <", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdLessThanOrEqualTo(String value) {
            addCriterion("ROUTER_ID <=", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdLike(String value) {
            addCriterion("ROUTER_ID like", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdNotLike(String value) {
            addCriterion("ROUTER_ID not like", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdIn(List<String> values) {
            addCriterion("ROUTER_ID in", values, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdNotIn(List<String> values) {
            addCriterion("ROUTER_ID not in", values, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdBetween(String value1, String value2) {
            addCriterion("ROUTER_ID between", value1, value2, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdNotBetween(String value1, String value2) {
            addCriterion("ROUTER_ID not between", value1, value2, "routerId");
            return (Criteria) this;
        }

        public Criteria andAuthChannelIsNull() {
            addCriterion("AUTH_CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andAuthChannelIsNotNull() {
            addCriterion("AUTH_CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andAuthChannelEqualTo(String value) {
            addCriterion("AUTH_CHANNEL =", value, "authChannel");
            return (Criteria) this;
        }

        public Criteria andAuthChannelNotEqualTo(String value) {
            addCriterion("AUTH_CHANNEL <>", value, "authChannel");
            return (Criteria) this;
        }

        public Criteria andAuthChannelGreaterThan(String value) {
            addCriterion("AUTH_CHANNEL >", value, "authChannel");
            return (Criteria) this;
        }

        public Criteria andAuthChannelGreaterThanOrEqualTo(String value) {
            addCriterion("AUTH_CHANNEL >=", value, "authChannel");
            return (Criteria) this;
        }

        public Criteria andAuthChannelLessThan(String value) {
            addCriterion("AUTH_CHANNEL <", value, "authChannel");
            return (Criteria) this;
        }

        public Criteria andAuthChannelLessThanOrEqualTo(String value) {
            addCriterion("AUTH_CHANNEL <=", value, "authChannel");
            return (Criteria) this;
        }

        public Criteria andAuthChannelLike(String value) {
            addCriterion("AUTH_CHANNEL like", value, "authChannel");
            return (Criteria) this;
        }

        public Criteria andAuthChannelNotLike(String value) {
            addCriterion("AUTH_CHANNEL not like", value, "authChannel");
            return (Criteria) this;
        }

        public Criteria andAuthChannelIn(List<String> values) {
            addCriterion("AUTH_CHANNEL in", values, "authChannel");
            return (Criteria) this;
        }

        public Criteria andAuthChannelNotIn(List<String> values) {
            addCriterion("AUTH_CHANNEL not in", values, "authChannel");
            return (Criteria) this;
        }

        public Criteria andAuthChannelBetween(String value1, String value2) {
            addCriterion("AUTH_CHANNEL between", value1, value2, "authChannel");
            return (Criteria) this;
        }

        public Criteria andAuthChannelNotBetween(String value1, String value2) {
            addCriterion("AUTH_CHANNEL not between", value1, value2, "authChannel");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNull() {
            addCriterion("ORDER_NUM is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("ORDER_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(Long value) {
            addCriterion("ORDER_NUM =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(Long value) {
            addCriterion("ORDER_NUM <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(Long value) {
            addCriterion("ORDER_NUM >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(Long value) {
            addCriterion("ORDER_NUM >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(Long value) {
            addCriterion("ORDER_NUM <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(Long value) {
            addCriterion("ORDER_NUM <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<Long> values) {
            addCriterion("ORDER_NUM in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<Long> values) {
            addCriterion("ORDER_NUM not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(Long value1, Long value2) {
            addCriterion("ORDER_NUM between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(Long value1, Long value2) {
            addCriterion("ORDER_NUM not between", value1, value2, "orderNum");
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
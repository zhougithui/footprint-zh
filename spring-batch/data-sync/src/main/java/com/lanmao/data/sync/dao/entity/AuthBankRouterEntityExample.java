package com.lanmao.data.sync.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuthBankRouterEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuthBankRouterEntityExample() {
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

        public Criteria andSourceRouterIsNull() {
            addCriterion("SOURCE_ROUTER is null");
            return (Criteria) this;
        }

        public Criteria andSourceRouterIsNotNull() {
            addCriterion("SOURCE_ROUTER is not null");
            return (Criteria) this;
        }

        public Criteria andSourceRouterEqualTo(Long value) {
            addCriterion("SOURCE_ROUTER =", value, "sourceRouter");
            return (Criteria) this;
        }

        public Criteria andSourceRouterNotEqualTo(Long value) {
            addCriterion("SOURCE_ROUTER <>", value, "sourceRouter");
            return (Criteria) this;
        }

        public Criteria andSourceRouterGreaterThan(Long value) {
            addCriterion("SOURCE_ROUTER >", value, "sourceRouter");
            return (Criteria) this;
        }

        public Criteria andSourceRouterGreaterThanOrEqualTo(Long value) {
            addCriterion("SOURCE_ROUTER >=", value, "sourceRouter");
            return (Criteria) this;
        }

        public Criteria andSourceRouterLessThan(Long value) {
            addCriterion("SOURCE_ROUTER <", value, "sourceRouter");
            return (Criteria) this;
        }

        public Criteria andSourceRouterLessThanOrEqualTo(Long value) {
            addCriterion("SOURCE_ROUTER <=", value, "sourceRouter");
            return (Criteria) this;
        }

        public Criteria andSourceRouterLike(Long value) {
            addCriterion("SOURCE_ROUTER like", value, "sourceRouter");
            return (Criteria) this;
        }

        public Criteria andSourceRouterNotLike(Long value) {
            addCriterion("SOURCE_ROUTER not like", value, "sourceRouter");
            return (Criteria) this;
        }

        public Criteria andSourceRouterIn(List<Long> values) {
            addCriterion("SOURCE_ROUTER in", values, "sourceRouter");
            return (Criteria) this;
        }

        public Criteria andSourceRouterNotIn(List<Long> values) {
            addCriterion("SOURCE_ROUTER not in", values, "sourceRouter");
            return (Criteria) this;
        }

        public Criteria andSourceRouterBetween(Long value1, Long value2) {
            addCriterion("SOURCE_ROUTER between", value1, value2, "sourceRouter");
            return (Criteria) this;
        }

        public Criteria andSourceRouterNotBetween(Long value1, Long value2) {
            addCriterion("SOURCE_ROUTER not between", value1, value2, "sourceRouter");
            return (Criteria) this;
        }

        public Criteria andBankRouterIsNull() {
            addCriterion("BANK_ROUTER is null");
            return (Criteria) this;
        }

        public Criteria andBankRouterIsNotNull() {
            addCriterion("BANK_ROUTER is not null");
            return (Criteria) this;
        }

        public Criteria andBankRouterEqualTo(Long value) {
            addCriterion("BANK_ROUTER =", value, "bankRouter");
            return (Criteria) this;
        }

        public Criteria andBankRouterNotEqualTo(Long value) {
            addCriterion("BANK_ROUTER <>", value, "bankRouter");
            return (Criteria) this;
        }

        public Criteria andBankRouterGreaterThan(Long value) {
            addCriterion("BANK_ROUTER >", value, "bankRouter");
            return (Criteria) this;
        }

        public Criteria andBankRouterGreaterThanOrEqualTo(Long value) {
            addCriterion("BANK_ROUTER >=", value, "bankRouter");
            return (Criteria) this;
        }

        public Criteria andBankRouterLessThan(Long value) {
            addCriterion("BANK_ROUTER <", value, "bankRouter");
            return (Criteria) this;
        }

        public Criteria andBankRouterLessThanOrEqualTo(Long value) {
            addCriterion("BANK_ROUTER <=", value, "bankRouter");
            return (Criteria) this;
        }

        public Criteria andBankRouterLike(Long value) {
            addCriterion("BANK_ROUTER like", value, "bankRouter");
            return (Criteria) this;
        }

        public Criteria andBankRouterNotLike(Long value) {
            addCriterion("BANK_ROUTER not like", value, "bankRouter");
            return (Criteria) this;
        }

        public Criteria andBankRouterIn(List<Long> values) {
            addCriterion("BANK_ROUTER in", values, "bankRouter");
            return (Criteria) this;
        }

        public Criteria andBankRouterNotIn(List<Long> values) {
            addCriterion("BANK_ROUTER not in", values, "bankRouter");
            return (Criteria) this;
        }

        public Criteria andBankRouterBetween(Long value1, Long value2) {
            addCriterion("BANK_ROUTER between", value1, value2, "bankRouter");
            return (Criteria) this;
        }

        public Criteria andBankRouterNotBetween(Long value1, Long value2) {
            addCriterion("BANK_ROUTER not between", value1, value2, "bankRouter");
            return (Criteria) this;
        }

        public Criteria andBankListIsNull() {
            addCriterion("BANK_LIST is null");
            return (Criteria) this;
        }

        public Criteria andBankListIsNotNull() {
            addCriterion("BANK_LIST is not null");
            return (Criteria) this;
        }

        public Criteria andBankListEqualTo(String value) {
            addCriterion("BANK_LIST =", value, "bankList");
            return (Criteria) this;
        }

        public Criteria andBankListNotEqualTo(String value) {
            addCriterion("BANK_LIST <>", value, "bankList");
            return (Criteria) this;
        }

        public Criteria andBankListGreaterThan(String value) {
            addCriterion("BANK_LIST >", value, "bankList");
            return (Criteria) this;
        }

        public Criteria andBankListGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_LIST >=", value, "bankList");
            return (Criteria) this;
        }

        public Criteria andBankListLessThan(String value) {
            addCriterion("BANK_LIST <", value, "bankList");
            return (Criteria) this;
        }

        public Criteria andBankListLessThanOrEqualTo(String value) {
            addCriterion("BANK_LIST <=", value, "bankList");
            return (Criteria) this;
        }

        public Criteria andBankListLike(String value) {
            addCriterion("BANK_LIST like", value, "bankList");
            return (Criteria) this;
        }

        public Criteria andBankListNotLike(String value) {
            addCriterion("BANK_LIST not like", value, "bankList");
            return (Criteria) this;
        }

        public Criteria andBankListIn(List<String> values) {
            addCriterion("BANK_LIST in", values, "bankList");
            return (Criteria) this;
        }

        public Criteria andBankListNotIn(List<String> values) {
            addCriterion("BANK_LIST not in", values, "bankList");
            return (Criteria) this;
        }

        public Criteria andBankListBetween(String value1, String value2) {
            addCriterion("BANK_LIST between", value1, value2, "bankList");
            return (Criteria) this;
        }

        public Criteria andBankListNotBetween(String value1, String value2) {
            addCriterion("BANK_LIST not between", value1, value2, "bankList");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
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
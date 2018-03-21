package com.lanmao.data.sync.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuthRiskControlEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuthRiskControlEntityExample() {
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

        public Criteria andCardHolderIsNull() {
            addCriterion("CARD_HOLDER is null");
            return (Criteria) this;
        }

        public Criteria andCardHolderIsNotNull() {
            addCriterion("CARD_HOLDER is not null");
            return (Criteria) this;
        }

        public Criteria andCardHolderEqualTo(String value) {
            addCriterion("CARD_HOLDER =", value, "cardHolder");
            return (Criteria) this;
        }

        public Criteria andCardHolderNotEqualTo(String value) {
            addCriterion("CARD_HOLDER <>", value, "cardHolder");
            return (Criteria) this;
        }

        public Criteria andCardHolderGreaterThan(String value) {
            addCriterion("CARD_HOLDER >", value, "cardHolder");
            return (Criteria) this;
        }

        public Criteria andCardHolderGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_HOLDER >=", value, "cardHolder");
            return (Criteria) this;
        }

        public Criteria andCardHolderLessThan(String value) {
            addCriterion("CARD_HOLDER <", value, "cardHolder");
            return (Criteria) this;
        }

        public Criteria andCardHolderLessThanOrEqualTo(String value) {
            addCriterion("CARD_HOLDER <=", value, "cardHolder");
            return (Criteria) this;
        }

        public Criteria andCardHolderLike(String value) {
            addCriterion("CARD_HOLDER like", value, "cardHolder");
            return (Criteria) this;
        }

        public Criteria andCardHolderNotLike(String value) {
            addCriterion("CARD_HOLDER not like", value, "cardHolder");
            return (Criteria) this;
        }

        public Criteria andCardHolderIn(List<String> values) {
            addCriterion("CARD_HOLDER in", values, "cardHolder");
            return (Criteria) this;
        }

        public Criteria andCardHolderNotIn(List<String> values) {
            addCriterion("CARD_HOLDER not in", values, "cardHolder");
            return (Criteria) this;
        }

        public Criteria andCardHolderBetween(String value1, String value2) {
            addCriterion("CARD_HOLDER between", value1, value2, "cardHolder");
            return (Criteria) this;
        }

        public Criteria andCardHolderNotBetween(String value1, String value2) {
            addCriterion("CARD_HOLDER not between", value1, value2, "cardHolder");
            return (Criteria) this;
        }

        public Criteria andCredNumIsNull() {
            addCriterion("CRED_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCredNumIsNotNull() {
            addCriterion("CRED_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCredNumEqualTo(String value) {
            addCriterion("CRED_NUM =", value, "credNum");
            return (Criteria) this;
        }

        public Criteria andCredNumNotEqualTo(String value) {
            addCriterion("CRED_NUM <>", value, "credNum");
            return (Criteria) this;
        }

        public Criteria andCredNumGreaterThan(String value) {
            addCriterion("CRED_NUM >", value, "credNum");
            return (Criteria) this;
        }

        public Criteria andCredNumGreaterThanOrEqualTo(String value) {
            addCriterion("CRED_NUM >=", value, "credNum");
            return (Criteria) this;
        }

        public Criteria andCredNumLessThan(String value) {
            addCriterion("CRED_NUM <", value, "credNum");
            return (Criteria) this;
        }

        public Criteria andCredNumLessThanOrEqualTo(String value) {
            addCriterion("CRED_NUM <=", value, "credNum");
            return (Criteria) this;
        }

        public Criteria andCredNumLike(String value) {
            addCriterion("CRED_NUM like", value, "credNum");
            return (Criteria) this;
        }

        public Criteria andCredNumNotLike(String value) {
            addCriterion("CRED_NUM not like", value, "credNum");
            return (Criteria) this;
        }

        public Criteria andCredNumIn(List<String> values) {
            addCriterion("CRED_NUM in", values, "credNum");
            return (Criteria) this;
        }

        public Criteria andCredNumNotIn(List<String> values) {
            addCriterion("CRED_NUM not in", values, "credNum");
            return (Criteria) this;
        }

        public Criteria andCredNumBetween(String value1, String value2) {
            addCriterion("CRED_NUM between", value1, value2, "credNum");
            return (Criteria) this;
        }

        public Criteria andCredNumNotBetween(String value1, String value2) {
            addCriterion("CRED_NUM not between", value1, value2, "credNum");
            return (Criteria) this;
        }

        public Criteria andCredNum12IsNull() {
            addCriterion("CRED_NUM_12 is null");
            return (Criteria) this;
        }

        public Criteria andCredNum12IsNotNull() {
            addCriterion("CRED_NUM_12 is not null");
            return (Criteria) this;
        }

        public Criteria andCredNum12EqualTo(String value) {
            addCriterion("CRED_NUM_12 =", value, "credNum12");
            return (Criteria) this;
        }

        public Criteria andCredNum12NotEqualTo(String value) {
            addCriterion("CRED_NUM_12 <>", value, "credNum12");
            return (Criteria) this;
        }

        public Criteria andCredNum12GreaterThan(String value) {
            addCriterion("CRED_NUM_12 >", value, "credNum12");
            return (Criteria) this;
        }

        public Criteria andCredNum12GreaterThanOrEqualTo(String value) {
            addCriterion("CRED_NUM_12 >=", value, "credNum12");
            return (Criteria) this;
        }

        public Criteria andCredNum12LessThan(String value) {
            addCriterion("CRED_NUM_12 <", value, "credNum12");
            return (Criteria) this;
        }

        public Criteria andCredNum12LessThanOrEqualTo(String value) {
            addCriterion("CRED_NUM_12 <=", value, "credNum12");
            return (Criteria) this;
        }

        public Criteria andCredNum12Like(String value) {
            addCriterion("CRED_NUM_12 like", value, "credNum12");
            return (Criteria) this;
        }

        public Criteria andCredNum12NotLike(String value) {
            addCriterion("CRED_NUM_12 not like", value, "credNum12");
            return (Criteria) this;
        }

        public Criteria andCredNum12In(List<String> values) {
            addCriterion("CRED_NUM_12 in", values, "credNum12");
            return (Criteria) this;
        }

        public Criteria andCredNum12NotIn(List<String> values) {
            addCriterion("CRED_NUM_12 not in", values, "credNum12");
            return (Criteria) this;
        }

        public Criteria andCredNum12Between(String value1, String value2) {
            addCriterion("CRED_NUM_12 between", value1, value2, "credNum12");
            return (Criteria) this;
        }

        public Criteria andCredNum12NotBetween(String value1, String value2) {
            addCriterion("CRED_NUM_12 not between", value1, value2, "credNum12");
            return (Criteria) this;
        }

        public Criteria andCredNum6IsNull() {
            addCriterion("CRED_NUM_6 is null");
            return (Criteria) this;
        }

        public Criteria andCredNum6IsNotNull() {
            addCriterion("CRED_NUM_6 is not null");
            return (Criteria) this;
        }

        public Criteria andCredNum6EqualTo(String value) {
            addCriterion("CRED_NUM_6 =", value, "credNum6");
            return (Criteria) this;
        }

        public Criteria andCredNum6NotEqualTo(String value) {
            addCriterion("CRED_NUM_6 <>", value, "credNum6");
            return (Criteria) this;
        }

        public Criteria andCredNum6GreaterThan(String value) {
            addCriterion("CRED_NUM_6 >", value, "credNum6");
            return (Criteria) this;
        }

        public Criteria andCredNum6GreaterThanOrEqualTo(String value) {
            addCriterion("CRED_NUM_6 >=", value, "credNum6");
            return (Criteria) this;
        }

        public Criteria andCredNum6LessThan(String value) {
            addCriterion("CRED_NUM_6 <", value, "credNum6");
            return (Criteria) this;
        }

        public Criteria andCredNum6LessThanOrEqualTo(String value) {
            addCriterion("CRED_NUM_6 <=", value, "credNum6");
            return (Criteria) this;
        }

        public Criteria andCredNum6Like(String value) {
            addCriterion("CRED_NUM_6 like", value, "credNum6");
            return (Criteria) this;
        }

        public Criteria andCredNum6NotLike(String value) {
            addCriterion("CRED_NUM_6 not like", value, "credNum6");
            return (Criteria) this;
        }

        public Criteria andCredNum6In(List<String> values) {
            addCriterion("CRED_NUM_6 in", values, "credNum6");
            return (Criteria) this;
        }

        public Criteria andCredNum6NotIn(List<String> values) {
            addCriterion("CRED_NUM_6 not in", values, "credNum6");
            return (Criteria) this;
        }

        public Criteria andCredNum6Between(String value1, String value2) {
            addCriterion("CRED_NUM_6 between", value1, value2, "credNum6");
            return (Criteria) this;
        }

        public Criteria andCredNum6NotBetween(String value1, String value2) {
            addCriterion("CRED_NUM_6 not between", value1, value2, "credNum6");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNull() {
            addCriterion("CARD_NO is null");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNotNull() {
            addCriterion("CARD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCardNoEqualTo(String value) {
            addCriterion("CARD_NO =", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotEqualTo(String value) {
            addCriterion("CARD_NO <>", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThan(String value) {
            addCriterion("CARD_NO >", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_NO >=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThan(String value) {
            addCriterion("CARD_NO <", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThanOrEqualTo(String value) {
            addCriterion("CARD_NO <=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLike(String value) {
            addCriterion("CARD_NO like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotLike(String value) {
            addCriterion("CARD_NO not like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoIn(List<String> values) {
            addCriterion("CARD_NO in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotIn(List<String> values) {
            addCriterion("CARD_NO not in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoBetween(String value1, String value2) {
            addCriterion("CARD_NO between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotBetween(String value1, String value2) {
            addCriterion("CARD_NO not between", value1, value2, "cardNo");
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
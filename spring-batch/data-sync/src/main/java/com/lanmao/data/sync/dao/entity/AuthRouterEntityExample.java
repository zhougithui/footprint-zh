package com.lanmao.data.sync.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuthRouterEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuthRouterEntityExample() {
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

        public Criteria andRouterNameIsNull() {
            addCriterion("ROUTER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRouterNameIsNotNull() {
            addCriterion("ROUTER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRouterNameEqualTo(String value) {
            addCriterion("ROUTER_NAME =", value, "routerName");
            return (Criteria) this;
        }

        public Criteria andRouterNameNotEqualTo(String value) {
            addCriterion("ROUTER_NAME <>", value, "routerName");
            return (Criteria) this;
        }

        public Criteria andRouterNameGreaterThan(String value) {
            addCriterion("ROUTER_NAME >", value, "routerName");
            return (Criteria) this;
        }

        public Criteria andRouterNameGreaterThanOrEqualTo(String value) {
            addCriterion("ROUTER_NAME >=", value, "routerName");
            return (Criteria) this;
        }

        public Criteria andRouterNameLessThan(String value) {
            addCriterion("ROUTER_NAME <", value, "routerName");
            return (Criteria) this;
        }

        public Criteria andRouterNameLessThanOrEqualTo(String value) {
            addCriterion("ROUTER_NAME <=", value, "routerName");
            return (Criteria) this;
        }

        public Criteria andRouterNameLike(String value) {
            addCriterion("ROUTER_NAME like", value, "routerName");
            return (Criteria) this;
        }

        public Criteria andRouterNameNotLike(String value) {
            addCriterion("ROUTER_NAME not like", value, "routerName");
            return (Criteria) this;
        }

        public Criteria andRouterNameIn(List<String> values) {
            addCriterion("ROUTER_NAME in", values, "routerName");
            return (Criteria) this;
        }

        public Criteria andRouterNameNotIn(List<String> values) {
            addCriterion("ROUTER_NAME not in", values, "routerName");
            return (Criteria) this;
        }

        public Criteria andRouterNameBetween(String value1, String value2) {
            addCriterion("ROUTER_NAME between", value1, value2, "routerName");
            return (Criteria) this;
        }

        public Criteria andRouterNameNotBetween(String value1, String value2) {
            addCriterion("ROUTER_NAME not between", value1, value2, "routerName");
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

        public Criteria andAuthModeIsNull() {
            addCriterion("AUTH_MODE is null");
            return (Criteria) this;
        }

        public Criteria andAuthModeIsNotNull() {
            addCriterion("AUTH_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andAuthModeEqualTo(String value) {
            addCriterion("AUTH_MODE =", value, "authMode");
            return (Criteria) this;
        }

        public Criteria andAuthModeNotEqualTo(String value) {
            addCriterion("AUTH_MODE <>", value, "authMode");
            return (Criteria) this;
        }

        public Criteria andAuthModeGreaterThan(String value) {
            addCriterion("AUTH_MODE >", value, "authMode");
            return (Criteria) this;
        }

        public Criteria andAuthModeGreaterThanOrEqualTo(String value) {
            addCriterion("AUTH_MODE >=", value, "authMode");
            return (Criteria) this;
        }

        public Criteria andAuthModeLessThan(String value) {
            addCriterion("AUTH_MODE <", value, "authMode");
            return (Criteria) this;
        }

        public Criteria andAuthModeLessThanOrEqualTo(String value) {
            addCriterion("AUTH_MODE <=", value, "authMode");
            return (Criteria) this;
        }

        public Criteria andAuthModeLike(String value) {
            addCriterion("AUTH_MODE like", value, "authMode");
            return (Criteria) this;
        }

        public Criteria andAuthModeNotLike(String value) {
            addCriterion("AUTH_MODE not like", value, "authMode");
            return (Criteria) this;
        }

        public Criteria andAuthModeIn(List<String> values) {
            addCriterion("AUTH_MODE in", values, "authMode");
            return (Criteria) this;
        }

        public Criteria andAuthModeNotIn(List<String> values) {
            addCriterion("AUTH_MODE not in", values, "authMode");
            return (Criteria) this;
        }

        public Criteria andAuthModeBetween(String value1, String value2) {
            addCriterion("AUTH_MODE between", value1, value2, "authMode");
            return (Criteria) this;
        }

        public Criteria andAuthModeNotBetween(String value1, String value2) {
            addCriterion("AUTH_MODE not between", value1, value2, "authMode");
            return (Criteria) this;
        }

        public Criteria andRouterStatusIsNull() {
            addCriterion("ROUTER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andRouterStatusIsNotNull() {
            addCriterion("ROUTER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andRouterStatusEqualTo(String value) {
            addCriterion("ROUTER_STATUS =", value, "routerStatus");
            return (Criteria) this;
        }

        public Criteria andRouterStatusNotEqualTo(String value) {
            addCriterion("ROUTER_STATUS <>", value, "routerStatus");
            return (Criteria) this;
        }

        public Criteria andRouterStatusGreaterThan(String value) {
            addCriterion("ROUTER_STATUS >", value, "routerStatus");
            return (Criteria) this;
        }

        public Criteria andRouterStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ROUTER_STATUS >=", value, "routerStatus");
            return (Criteria) this;
        }

        public Criteria andRouterStatusLessThan(String value) {
            addCriterion("ROUTER_STATUS <", value, "routerStatus");
            return (Criteria) this;
        }

        public Criteria andRouterStatusLessThanOrEqualTo(String value) {
            addCriterion("ROUTER_STATUS <=", value, "routerStatus");
            return (Criteria) this;
        }

        public Criteria andRouterStatusLike(String value) {
            addCriterion("ROUTER_STATUS like", value, "routerStatus");
            return (Criteria) this;
        }

        public Criteria andRouterStatusNotLike(String value) {
            addCriterion("ROUTER_STATUS not like", value, "routerStatus");
            return (Criteria) this;
        }

        public Criteria andRouterStatusIn(List<String> values) {
            addCriterion("ROUTER_STATUS in", values, "routerStatus");
            return (Criteria) this;
        }

        public Criteria andRouterStatusNotIn(List<String> values) {
            addCriterion("ROUTER_STATUS not in", values, "routerStatus");
            return (Criteria) this;
        }

        public Criteria andRouterStatusBetween(String value1, String value2) {
            addCriterion("ROUTER_STATUS between", value1, value2, "routerStatus");
            return (Criteria) this;
        }

        public Criteria andRouterStatusNotBetween(String value1, String value2) {
            addCriterion("ROUTER_STATUS not between", value1, value2, "routerStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessSystemIsNull() {
            addCriterion("BUSINESS_SYSTEM is null");
            return (Criteria) this;
        }

        public Criteria andBusinessSystemIsNotNull() {
            addCriterion("BUSINESS_SYSTEM is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessSystemEqualTo(String value) {
            addCriterion("BUSINESS_SYSTEM =", value, "businessSystem");
            return (Criteria) this;
        }

        public Criteria andBusinessSystemNotEqualTo(String value) {
            addCriterion("BUSINESS_SYSTEM <>", value, "businessSystem");
            return (Criteria) this;
        }

        public Criteria andBusinessSystemGreaterThan(String value) {
            addCriterion("BUSINESS_SYSTEM >", value, "businessSystem");
            return (Criteria) this;
        }

        public Criteria andBusinessSystemGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_SYSTEM >=", value, "businessSystem");
            return (Criteria) this;
        }

        public Criteria andBusinessSystemLessThan(String value) {
            addCriterion("BUSINESS_SYSTEM <", value, "businessSystem");
            return (Criteria) this;
        }

        public Criteria andBusinessSystemLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_SYSTEM <=", value, "businessSystem");
            return (Criteria) this;
        }

        public Criteria andBusinessSystemLike(String value) {
            addCriterion("BUSINESS_SYSTEM like", value, "businessSystem");
            return (Criteria) this;
        }

        public Criteria andBusinessSystemNotLike(String value) {
            addCriterion("BUSINESS_SYSTEM not like", value, "businessSystem");
            return (Criteria) this;
        }

        public Criteria andBusinessSystemIn(List<String> values) {
            addCriterion("BUSINESS_SYSTEM in", values, "businessSystem");
            return (Criteria) this;
        }

        public Criteria andBusinessSystemNotIn(List<String> values) {
            addCriterion("BUSINESS_SYSTEM not in", values, "businessSystem");
            return (Criteria) this;
        }

        public Criteria andBusinessSystemBetween(String value1, String value2) {
            addCriterion("BUSINESS_SYSTEM between", value1, value2, "businessSystem");
            return (Criteria) this;
        }

        public Criteria andBusinessSystemNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_SYSTEM not between", value1, value2, "businessSystem");
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
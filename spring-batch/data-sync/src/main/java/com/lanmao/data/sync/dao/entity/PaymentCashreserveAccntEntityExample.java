package com.lanmao.data.sync.dao.entity;

import java.util.ArrayList;
import java.util.List;

public class PaymentCashreserveAccntEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaymentCashreserveAccntEntityExample() {
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

        public Criteria andPayCompanyIsNull() {
            addCriterion("PAY_COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andPayCompanyIsNotNull() {
            addCriterion("PAY_COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andPayCompanyEqualTo(String value) {
            addCriterion("PAY_COMPANY =", value, "payCompany");
            return (Criteria) this;
        }

        public Criteria andPayCompanyNotEqualTo(String value) {
            addCriterion("PAY_COMPANY <>", value, "payCompany");
            return (Criteria) this;
        }

        public Criteria andPayCompanyGreaterThan(String value) {
            addCriterion("PAY_COMPANY >", value, "payCompany");
            return (Criteria) this;
        }

        public Criteria andPayCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_COMPANY >=", value, "payCompany");
            return (Criteria) this;
        }

        public Criteria andPayCompanyLessThan(String value) {
            addCriterion("PAY_COMPANY <", value, "payCompany");
            return (Criteria) this;
        }

        public Criteria andPayCompanyLessThanOrEqualTo(String value) {
            addCriterion("PAY_COMPANY <=", value, "payCompany");
            return (Criteria) this;
        }

        public Criteria andPayCompanyLike(String value) {
            addCriterion("PAY_COMPANY like", value, "payCompany");
            return (Criteria) this;
        }

        public Criteria andPayCompanyNotLike(String value) {
            addCriterion("PAY_COMPANY not like", value, "payCompany");
            return (Criteria) this;
        }

        public Criteria andPayCompanyIn(List<String> values) {
            addCriterion("PAY_COMPANY in", values, "payCompany");
            return (Criteria) this;
        }

        public Criteria andPayCompanyNotIn(List<String> values) {
            addCriterion("PAY_COMPANY not in", values, "payCompany");
            return (Criteria) this;
        }

        public Criteria andPayCompanyBetween(String value1, String value2) {
            addCriterion("PAY_COMPANY between", value1, value2, "payCompany");
            return (Criteria) this;
        }

        public Criteria andPayCompanyNotBetween(String value1, String value2) {
            addCriterion("PAY_COMPANY not between", value1, value2, "payCompany");
            return (Criteria) this;
        }

        public Criteria andCashreserveAccntIsNull() {
            addCriterion("CASHRESERVE_ACCNT is null");
            return (Criteria) this;
        }

        public Criteria andCashreserveAccntIsNotNull() {
            addCriterion("CASHRESERVE_ACCNT is not null");
            return (Criteria) this;
        }

        public Criteria andCashreserveAccntEqualTo(String value) {
            addCriterion("CASHRESERVE_ACCNT =", value, "cashreserveAccnt");
            return (Criteria) this;
        }

        public Criteria andCashreserveAccntNotEqualTo(String value) {
            addCriterion("CASHRESERVE_ACCNT <>", value, "cashreserveAccnt");
            return (Criteria) this;
        }

        public Criteria andCashreserveAccntGreaterThan(String value) {
            addCriterion("CASHRESERVE_ACCNT >", value, "cashreserveAccnt");
            return (Criteria) this;
        }

        public Criteria andCashreserveAccntGreaterThanOrEqualTo(String value) {
            addCriterion("CASHRESERVE_ACCNT >=", value, "cashreserveAccnt");
            return (Criteria) this;
        }

        public Criteria andCashreserveAccntLessThan(String value) {
            addCriterion("CASHRESERVE_ACCNT <", value, "cashreserveAccnt");
            return (Criteria) this;
        }

        public Criteria andCashreserveAccntLessThanOrEqualTo(String value) {
            addCriterion("CASHRESERVE_ACCNT <=", value, "cashreserveAccnt");
            return (Criteria) this;
        }

        public Criteria andCashreserveAccntLike(String value) {
            addCriterion("CASHRESERVE_ACCNT like", value, "cashreserveAccnt");
            return (Criteria) this;
        }

        public Criteria andCashreserveAccntNotLike(String value) {
            addCriterion("CASHRESERVE_ACCNT not like", value, "cashreserveAccnt");
            return (Criteria) this;
        }

        public Criteria andCashreserveAccntIn(List<String> values) {
            addCriterion("CASHRESERVE_ACCNT in", values, "cashreserveAccnt");
            return (Criteria) this;
        }

        public Criteria andCashreserveAccntNotIn(List<String> values) {
            addCriterion("CASHRESERVE_ACCNT not in", values, "cashreserveAccnt");
            return (Criteria) this;
        }

        public Criteria andCashreserveAccntBetween(String value1, String value2) {
            addCriterion("CASHRESERVE_ACCNT between", value1, value2, "cashreserveAccnt");
            return (Criteria) this;
        }

        public Criteria andCashreserveAccntNotBetween(String value1, String value2) {
            addCriterion("CASHRESERVE_ACCNT not between", value1, value2, "cashreserveAccnt");
            return (Criteria) this;
        }

        public Criteria andAccntNameIsNull() {
            addCriterion("ACCNT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAccntNameIsNotNull() {
            addCriterion("ACCNT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAccntNameEqualTo(String value) {
            addCriterion("ACCNT_NAME =", value, "accntName");
            return (Criteria) this;
        }

        public Criteria andAccntNameNotEqualTo(String value) {
            addCriterion("ACCNT_NAME <>", value, "accntName");
            return (Criteria) this;
        }

        public Criteria andAccntNameGreaterThan(String value) {
            addCriterion("ACCNT_NAME >", value, "accntName");
            return (Criteria) this;
        }

        public Criteria andAccntNameGreaterThanOrEqualTo(String value) {
            addCriterion("ACCNT_NAME >=", value, "accntName");
            return (Criteria) this;
        }

        public Criteria andAccntNameLessThan(String value) {
            addCriterion("ACCNT_NAME <", value, "accntName");
            return (Criteria) this;
        }

        public Criteria andAccntNameLessThanOrEqualTo(String value) {
            addCriterion("ACCNT_NAME <=", value, "accntName");
            return (Criteria) this;
        }

        public Criteria andAccntNameLike(String value) {
            addCriterion("ACCNT_NAME like", value, "accntName");
            return (Criteria) this;
        }

        public Criteria andAccntNameNotLike(String value) {
            addCriterion("ACCNT_NAME not like", value, "accntName");
            return (Criteria) this;
        }

        public Criteria andAccntNameIn(List<String> values) {
            addCriterion("ACCNT_NAME in", values, "accntName");
            return (Criteria) this;
        }

        public Criteria andAccntNameNotIn(List<String> values) {
            addCriterion("ACCNT_NAME not in", values, "accntName");
            return (Criteria) this;
        }

        public Criteria andAccntNameBetween(String value1, String value2) {
            addCriterion("ACCNT_NAME between", value1, value2, "accntName");
            return (Criteria) this;
        }

        public Criteria andAccntNameNotBetween(String value1, String value2) {
            addCriterion("ACCNT_NAME not between", value1, value2, "accntName");
            return (Criteria) this;
        }

        public Criteria andOpenBankNameIsNull() {
            addCriterion("OPEN_BANK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOpenBankNameIsNotNull() {
            addCriterion("OPEN_BANK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOpenBankNameEqualTo(String value) {
            addCriterion("OPEN_BANK_NAME =", value, "openBankName");
            return (Criteria) this;
        }

        public Criteria andOpenBankNameNotEqualTo(String value) {
            addCriterion("OPEN_BANK_NAME <>", value, "openBankName");
            return (Criteria) this;
        }

        public Criteria andOpenBankNameGreaterThan(String value) {
            addCriterion("OPEN_BANK_NAME >", value, "openBankName");
            return (Criteria) this;
        }

        public Criteria andOpenBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("OPEN_BANK_NAME >=", value, "openBankName");
            return (Criteria) this;
        }

        public Criteria andOpenBankNameLessThan(String value) {
            addCriterion("OPEN_BANK_NAME <", value, "openBankName");
            return (Criteria) this;
        }

        public Criteria andOpenBankNameLessThanOrEqualTo(String value) {
            addCriterion("OPEN_BANK_NAME <=", value, "openBankName");
            return (Criteria) this;
        }

        public Criteria andOpenBankNameLike(String value) {
            addCriterion("OPEN_BANK_NAME like", value, "openBankName");
            return (Criteria) this;
        }

        public Criteria andOpenBankNameNotLike(String value) {
            addCriterion("OPEN_BANK_NAME not like", value, "openBankName");
            return (Criteria) this;
        }

        public Criteria andOpenBankNameIn(List<String> values) {
            addCriterion("OPEN_BANK_NAME in", values, "openBankName");
            return (Criteria) this;
        }

        public Criteria andOpenBankNameNotIn(List<String> values) {
            addCriterion("OPEN_BANK_NAME not in", values, "openBankName");
            return (Criteria) this;
        }

        public Criteria andOpenBankNameBetween(String value1, String value2) {
            addCriterion("OPEN_BANK_NAME between", value1, value2, "openBankName");
            return (Criteria) this;
        }

        public Criteria andOpenBankNameNotBetween(String value1, String value2) {
            addCriterion("OPEN_BANK_NAME not between", value1, value2, "openBankName");
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
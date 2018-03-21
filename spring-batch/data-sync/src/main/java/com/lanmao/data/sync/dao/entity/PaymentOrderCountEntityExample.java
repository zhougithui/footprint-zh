package com.lanmao.data.sync.dao.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaymentOrderCountEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaymentOrderCountEntityExample() {
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

        public Criteria andCountDateIsNull() {
            addCriterion("COUNT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCountDateIsNotNull() {
            addCriterion("COUNT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCountDateEqualTo(Date value) {
            addCriterion("COUNT_DATE =", value, "countDate");
            return (Criteria) this;
        }

        public Criteria andCountDateNotEqualTo(Date value) {
            addCriterion("COUNT_DATE <>", value, "countDate");
            return (Criteria) this;
        }

        public Criteria andCountDateGreaterThan(Date value) {
            addCriterion("COUNT_DATE >", value, "countDate");
            return (Criteria) this;
        }

        public Criteria andCountDateGreaterThanOrEqualTo(Date value) {
            addCriterion("COUNT_DATE >=", value, "countDate");
            return (Criteria) this;
        }

        public Criteria andCountDateLessThan(Date value) {
            addCriterion("COUNT_DATE <", value, "countDate");
            return (Criteria) this;
        }

        public Criteria andCountDateLessThanOrEqualTo(Date value) {
            addCriterion("COUNT_DATE <=", value, "countDate");
            return (Criteria) this;
        }

        public Criteria andCountDateIn(List<Date> values) {
            addCriterion("COUNT_DATE in", values, "countDate");
            return (Criteria) this;
        }

        public Criteria andCountDateNotIn(List<Date> values) {
            addCriterion("COUNT_DATE not in", values, "countDate");
            return (Criteria) this;
        }

        public Criteria andCountDateBetween(Date value1, Date value2) {
            addCriterion("COUNT_DATE between", value1, value2, "countDate");
            return (Criteria) this;
        }

        public Criteria andCountDateNotBetween(Date value1, Date value2) {
            addCriterion("COUNT_DATE not between", value1, value2, "countDate");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNull() {
            addCriterion("PLATFORM is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("PLATFORM is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(String value) {
            addCriterion("PLATFORM =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(String value) {
            addCriterion("PLATFORM <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(String value) {
            addCriterion("PLATFORM >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(String value) {
            addCriterion("PLATFORM >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(String value) {
            addCriterion("PLATFORM <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(String value) {
            addCriterion("PLATFORM <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLike(String value) {
            addCriterion("PLATFORM like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotLike(String value) {
            addCriterion("PLATFORM not like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<String> values) {
            addCriterion("PLATFORM in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<String> values) {
            addCriterion("PLATFORM not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(String value1, String value2) {
            addCriterion("PLATFORM between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(String value1, String value2) {
            addCriterion("PLATFORM not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andSubjectNoIsNull() {
            addCriterion("SUBJECT_NO is null");
            return (Criteria) this;
        }

        public Criteria andSubjectNoIsNotNull() {
            addCriterion("SUBJECT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectNoEqualTo(String value) {
            addCriterion("SUBJECT_NO =", value, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoNotEqualTo(String value) {
            addCriterion("SUBJECT_NO <>", value, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoGreaterThan(String value) {
            addCriterion("SUBJECT_NO >", value, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoGreaterThanOrEqualTo(String value) {
            addCriterion("SUBJECT_NO >=", value, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoLessThan(String value) {
            addCriterion("SUBJECT_NO <", value, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoLessThanOrEqualTo(String value) {
            addCriterion("SUBJECT_NO <=", value, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoLike(String value) {
            addCriterion("SUBJECT_NO like", value, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoNotLike(String value) {
            addCriterion("SUBJECT_NO not like", value, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoIn(List<String> values) {
            addCriterion("SUBJECT_NO in", values, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoNotIn(List<String> values) {
            addCriterion("SUBJECT_NO not in", values, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoBetween(String value1, String value2) {
            addCriterion("SUBJECT_NO between", value1, value2, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoNotBetween(String value1, String value2) {
            addCriterion("SUBJECT_NO not between", value1, value2, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIsNull() {
            addCriterion("MERCHANT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIsNotNull() {
            addCriterion("MERCHANT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantNameEqualTo(String value) {
            addCriterion("MERCHANT_NAME =", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotEqualTo(String value) {
            addCriterion("MERCHANT_NAME <>", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameGreaterThan(String value) {
            addCriterion("MERCHANT_NAME >", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANT_NAME >=", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLessThan(String value) {
            addCriterion("MERCHANT_NAME <", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLessThanOrEqualTo(String value) {
            addCriterion("MERCHANT_NAME <=", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLike(String value) {
            addCriterion("MERCHANT_NAME like", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotLike(String value) {
            addCriterion("MERCHANT_NAME not like", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIn(List<String> values) {
            addCriterion("MERCHANT_NAME in", values, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotIn(List<String> values) {
            addCriterion("MERCHANT_NAME not in", values, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameBetween(String value1, String value2) {
            addCriterion("MERCHANT_NAME between", value1, value2, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotBetween(String value1, String value2) {
            addCriterion("MERCHANT_NAME not between", value1, value2, "merchantName");
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

        public Criteria andPayProductIsNull() {
            addCriterion("PAY_PRODUCT is null");
            return (Criteria) this;
        }

        public Criteria andPayProductIsNotNull() {
            addCriterion("PAY_PRODUCT is not null");
            return (Criteria) this;
        }

        public Criteria andPayProductEqualTo(String value) {
            addCriterion("PAY_PRODUCT =", value, "payProduct");
            return (Criteria) this;
        }

        public Criteria andPayProductNotEqualTo(String value) {
            addCriterion("PAY_PRODUCT <>", value, "payProduct");
            return (Criteria) this;
        }

        public Criteria andPayProductGreaterThan(String value) {
            addCriterion("PAY_PRODUCT >", value, "payProduct");
            return (Criteria) this;
        }

        public Criteria andPayProductGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_PRODUCT >=", value, "payProduct");
            return (Criteria) this;
        }

        public Criteria andPayProductLessThan(String value) {
            addCriterion("PAY_PRODUCT <", value, "payProduct");
            return (Criteria) this;
        }

        public Criteria andPayProductLessThanOrEqualTo(String value) {
            addCriterion("PAY_PRODUCT <=", value, "payProduct");
            return (Criteria) this;
        }

        public Criteria andPayProductLike(String value) {
            addCriterion("PAY_PRODUCT like", value, "payProduct");
            return (Criteria) this;
        }

        public Criteria andPayProductNotLike(String value) {
            addCriterion("PAY_PRODUCT not like", value, "payProduct");
            return (Criteria) this;
        }

        public Criteria andPayProductIn(List<String> values) {
            addCriterion("PAY_PRODUCT in", values, "payProduct");
            return (Criteria) this;
        }

        public Criteria andPayProductNotIn(List<String> values) {
            addCriterion("PAY_PRODUCT not in", values, "payProduct");
            return (Criteria) this;
        }

        public Criteria andPayProductBetween(String value1, String value2) {
            addCriterion("PAY_PRODUCT between", value1, value2, "payProduct");
            return (Criteria) this;
        }

        public Criteria andPayProductNotBetween(String value1, String value2) {
            addCriterion("PAY_PRODUCT not between", value1, value2, "payProduct");
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

        public Criteria andTimeAvgIsNull() {
            addCriterion("TIME_AVG is null");
            return (Criteria) this;
        }

        public Criteria andTimeAvgIsNotNull() {
            addCriterion("TIME_AVG is not null");
            return (Criteria) this;
        }

        public Criteria andTimeAvgEqualTo(BigDecimal value) {
            addCriterion("TIME_AVG =", value, "timeAvg");
            return (Criteria) this;
        }

        public Criteria andTimeAvgNotEqualTo(BigDecimal value) {
            addCriterion("TIME_AVG <>", value, "timeAvg");
            return (Criteria) this;
        }

        public Criteria andTimeAvgGreaterThan(BigDecimal value) {
            addCriterion("TIME_AVG >", value, "timeAvg");
            return (Criteria) this;
        }

        public Criteria andTimeAvgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TIME_AVG >=", value, "timeAvg");
            return (Criteria) this;
        }

        public Criteria andTimeAvgLessThan(BigDecimal value) {
            addCriterion("TIME_AVG <", value, "timeAvg");
            return (Criteria) this;
        }

        public Criteria andTimeAvgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TIME_AVG <=", value, "timeAvg");
            return (Criteria) this;
        }

        public Criteria andTimeAvgIn(List<BigDecimal> values) {
            addCriterion("TIME_AVG in", values, "timeAvg");
            return (Criteria) this;
        }

        public Criteria andTimeAvgNotIn(List<BigDecimal> values) {
            addCriterion("TIME_AVG not in", values, "timeAvg");
            return (Criteria) this;
        }

        public Criteria andTimeAvgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TIME_AVG between", value1, value2, "timeAvg");
            return (Criteria) this;
        }

        public Criteria andTimeAvgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TIME_AVG not between", value1, value2, "timeAvg");
            return (Criteria) this;
        }

        public Criteria andTimeBelow5IsNull() {
            addCriterion("TIME_BELOW5 is null");
            return (Criteria) this;
        }

        public Criteria andTimeBelow5IsNotNull() {
            addCriterion("TIME_BELOW5 is not null");
            return (Criteria) this;
        }

        public Criteria andTimeBelow5EqualTo(Short value) {
            addCriterion("TIME_BELOW5 =", value, "timeBelow5");
            return (Criteria) this;
        }

        public Criteria andTimeBelow5NotEqualTo(Short value) {
            addCriterion("TIME_BELOW5 <>", value, "timeBelow5");
            return (Criteria) this;
        }

        public Criteria andTimeBelow5GreaterThan(Short value) {
            addCriterion("TIME_BELOW5 >", value, "timeBelow5");
            return (Criteria) this;
        }

        public Criteria andTimeBelow5GreaterThanOrEqualTo(Short value) {
            addCriterion("TIME_BELOW5 >=", value, "timeBelow5");
            return (Criteria) this;
        }

        public Criteria andTimeBelow5LessThan(Short value) {
            addCriterion("TIME_BELOW5 <", value, "timeBelow5");
            return (Criteria) this;
        }

        public Criteria andTimeBelow5LessThanOrEqualTo(Short value) {
            addCriterion("TIME_BELOW5 <=", value, "timeBelow5");
            return (Criteria) this;
        }

        public Criteria andTimeBelow5In(List<Short> values) {
            addCriterion("TIME_BELOW5 in", values, "timeBelow5");
            return (Criteria) this;
        }

        public Criteria andTimeBelow5NotIn(List<Short> values) {
            addCriterion("TIME_BELOW5 not in", values, "timeBelow5");
            return (Criteria) this;
        }

        public Criteria andTimeBelow5Between(Short value1, Short value2) {
            addCriterion("TIME_BELOW5 between", value1, value2, "timeBelow5");
            return (Criteria) this;
        }

        public Criteria andTimeBelow5NotBetween(Short value1, Short value2) {
            addCriterion("TIME_BELOW5 not between", value1, value2, "timeBelow5");
            return (Criteria) this;
        }

        public Criteria andTimeBelow10IsNull() {
            addCriterion("TIME_BELOW10 is null");
            return (Criteria) this;
        }

        public Criteria andTimeBelow10IsNotNull() {
            addCriterion("TIME_BELOW10 is not null");
            return (Criteria) this;
        }

        public Criteria andTimeBelow10EqualTo(Short value) {
            addCriterion("TIME_BELOW10 =", value, "timeBelow10");
            return (Criteria) this;
        }

        public Criteria andTimeBelow10NotEqualTo(Short value) {
            addCriterion("TIME_BELOW10 <>", value, "timeBelow10");
            return (Criteria) this;
        }

        public Criteria andTimeBelow10GreaterThan(Short value) {
            addCriterion("TIME_BELOW10 >", value, "timeBelow10");
            return (Criteria) this;
        }

        public Criteria andTimeBelow10GreaterThanOrEqualTo(Short value) {
            addCriterion("TIME_BELOW10 >=", value, "timeBelow10");
            return (Criteria) this;
        }

        public Criteria andTimeBelow10LessThan(Short value) {
            addCriterion("TIME_BELOW10 <", value, "timeBelow10");
            return (Criteria) this;
        }

        public Criteria andTimeBelow10LessThanOrEqualTo(Short value) {
            addCriterion("TIME_BELOW10 <=", value, "timeBelow10");
            return (Criteria) this;
        }

        public Criteria andTimeBelow10In(List<Short> values) {
            addCriterion("TIME_BELOW10 in", values, "timeBelow10");
            return (Criteria) this;
        }

        public Criteria andTimeBelow10NotIn(List<Short> values) {
            addCriterion("TIME_BELOW10 not in", values, "timeBelow10");
            return (Criteria) this;
        }

        public Criteria andTimeBelow10Between(Short value1, Short value2) {
            addCriterion("TIME_BELOW10 between", value1, value2, "timeBelow10");
            return (Criteria) this;
        }

        public Criteria andTimeBelow10NotBetween(Short value1, Short value2) {
            addCriterion("TIME_BELOW10 not between", value1, value2, "timeBelow10");
            return (Criteria) this;
        }

        public Criteria andTimeBelow30IsNull() {
            addCriterion("TIME_BELOW30 is null");
            return (Criteria) this;
        }

        public Criteria andTimeBelow30IsNotNull() {
            addCriterion("TIME_BELOW30 is not null");
            return (Criteria) this;
        }

        public Criteria andTimeBelow30EqualTo(Short value) {
            addCriterion("TIME_BELOW30 =", value, "timeBelow30");
            return (Criteria) this;
        }

        public Criteria andTimeBelow30NotEqualTo(Short value) {
            addCriterion("TIME_BELOW30 <>", value, "timeBelow30");
            return (Criteria) this;
        }

        public Criteria andTimeBelow30GreaterThan(Short value) {
            addCriterion("TIME_BELOW30 >", value, "timeBelow30");
            return (Criteria) this;
        }

        public Criteria andTimeBelow30GreaterThanOrEqualTo(Short value) {
            addCriterion("TIME_BELOW30 >=", value, "timeBelow30");
            return (Criteria) this;
        }

        public Criteria andTimeBelow30LessThan(Short value) {
            addCriterion("TIME_BELOW30 <", value, "timeBelow30");
            return (Criteria) this;
        }

        public Criteria andTimeBelow30LessThanOrEqualTo(Short value) {
            addCriterion("TIME_BELOW30 <=", value, "timeBelow30");
            return (Criteria) this;
        }

        public Criteria andTimeBelow30In(List<Short> values) {
            addCriterion("TIME_BELOW30 in", values, "timeBelow30");
            return (Criteria) this;
        }

        public Criteria andTimeBelow30NotIn(List<Short> values) {
            addCriterion("TIME_BELOW30 not in", values, "timeBelow30");
            return (Criteria) this;
        }

        public Criteria andTimeBelow30Between(Short value1, Short value2) {
            addCriterion("TIME_BELOW30 between", value1, value2, "timeBelow30");
            return (Criteria) this;
        }

        public Criteria andTimeBelow30NotBetween(Short value1, Short value2) {
            addCriterion("TIME_BELOW30 not between", value1, value2, "timeBelow30");
            return (Criteria) this;
        }

        public Criteria andTimeAbove30IsNull() {
            addCriterion("TIME_ABOVE30 is null");
            return (Criteria) this;
        }

        public Criteria andTimeAbove30IsNotNull() {
            addCriterion("TIME_ABOVE30 is not null");
            return (Criteria) this;
        }

        public Criteria andTimeAbove30EqualTo(Short value) {
            addCriterion("TIME_ABOVE30 =", value, "timeAbove30");
            return (Criteria) this;
        }

        public Criteria andTimeAbove30NotEqualTo(Short value) {
            addCriterion("TIME_ABOVE30 <>", value, "timeAbove30");
            return (Criteria) this;
        }

        public Criteria andTimeAbove30GreaterThan(Short value) {
            addCriterion("TIME_ABOVE30 >", value, "timeAbove30");
            return (Criteria) this;
        }

        public Criteria andTimeAbove30GreaterThanOrEqualTo(Short value) {
            addCriterion("TIME_ABOVE30 >=", value, "timeAbove30");
            return (Criteria) this;
        }

        public Criteria andTimeAbove30LessThan(Short value) {
            addCriterion("TIME_ABOVE30 <", value, "timeAbove30");
            return (Criteria) this;
        }

        public Criteria andTimeAbove30LessThanOrEqualTo(Short value) {
            addCriterion("TIME_ABOVE30 <=", value, "timeAbove30");
            return (Criteria) this;
        }

        public Criteria andTimeAbove30In(List<Short> values) {
            addCriterion("TIME_ABOVE30 in", values, "timeAbove30");
            return (Criteria) this;
        }

        public Criteria andTimeAbove30NotIn(List<Short> values) {
            addCriterion("TIME_ABOVE30 not in", values, "timeAbove30");
            return (Criteria) this;
        }

        public Criteria andTimeAbove30Between(Short value1, Short value2) {
            addCriterion("TIME_ABOVE30 between", value1, value2, "timeAbove30");
            return (Criteria) this;
        }

        public Criteria andTimeAbove30NotBetween(Short value1, Short value2) {
            addCriterion("TIME_ABOVE30 not between", value1, value2, "timeAbove30");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("TOTAL_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("TOTAL_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(BigDecimal value) {
            addCriterion("TOTAL_AMOUNT =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_AMOUNT <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_AMOUNT >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_AMOUNT >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(BigDecimal value) {
            addCriterion("TOTAL_AMOUNT <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_AMOUNT <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<BigDecimal> values) {
            addCriterion("TOTAL_AMOUNT in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_AMOUNT not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_AMOUNT between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_AMOUNT not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalCountIsNull() {
            addCriterion("TOTAL_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andTotalCountIsNotNull() {
            addCriterion("TOTAL_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCountEqualTo(Long value) {
            addCriterion("TOTAL_COUNT =", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotEqualTo(Long value) {
            addCriterion("TOTAL_COUNT <>", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThan(Long value) {
            addCriterion("TOTAL_COUNT >", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThanOrEqualTo(Long value) {
            addCriterion("TOTAL_COUNT >=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThan(Long value) {
            addCriterion("TOTAL_COUNT <", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThanOrEqualTo(Long value) {
            addCriterion("TOTAL_COUNT <=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountIn(List<Long> values) {
            addCriterion("TOTAL_COUNT in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotIn(List<Long> values) {
            addCriterion("TOTAL_COUNT not in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountBetween(Long value1, Long value2) {
            addCriterion("TOTAL_COUNT between", value1, value2, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotBetween(Long value1, Long value2) {
            addCriterion("TOTAL_COUNT not between", value1, value2, "totalCount");
            return (Criteria) this;
        }

        public Criteria andUnfinishCountIsNull() {
            addCriterion("UNFINISH_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andUnfinishCountIsNotNull() {
            addCriterion("UNFINISH_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andUnfinishCountEqualTo(Long value) {
            addCriterion("UNFINISH_COUNT =", value, "unfinishCount");
            return (Criteria) this;
        }

        public Criteria andUnfinishCountNotEqualTo(Long value) {
            addCriterion("UNFINISH_COUNT <>", value, "unfinishCount");
            return (Criteria) this;
        }

        public Criteria andUnfinishCountGreaterThan(Long value) {
            addCriterion("UNFINISH_COUNT >", value, "unfinishCount");
            return (Criteria) this;
        }

        public Criteria andUnfinishCountGreaterThanOrEqualTo(Long value) {
            addCriterion("UNFINISH_COUNT >=", value, "unfinishCount");
            return (Criteria) this;
        }

        public Criteria andUnfinishCountLessThan(Long value) {
            addCriterion("UNFINISH_COUNT <", value, "unfinishCount");
            return (Criteria) this;
        }

        public Criteria andUnfinishCountLessThanOrEqualTo(Long value) {
            addCriterion("UNFINISH_COUNT <=", value, "unfinishCount");
            return (Criteria) this;
        }

        public Criteria andUnfinishCountIn(List<Long> values) {
            addCriterion("UNFINISH_COUNT in", values, "unfinishCount");
            return (Criteria) this;
        }

        public Criteria andUnfinishCountNotIn(List<Long> values) {
            addCriterion("UNFINISH_COUNT not in", values, "unfinishCount");
            return (Criteria) this;
        }

        public Criteria andUnfinishCountBetween(Long value1, Long value2) {
            addCriterion("UNFINISH_COUNT between", value1, value2, "unfinishCount");
            return (Criteria) this;
        }

        public Criteria andUnfinishCountNotBetween(Long value1, Long value2) {
            addCriterion("UNFINISH_COUNT not between", value1, value2, "unfinishCount");
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

        public Criteria andMerchantShortNameIsNull() {
            addCriterion("MERCHANT_SHORT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMerchantShortNameIsNotNull() {
            addCriterion("MERCHANT_SHORT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantShortNameEqualTo(String value) {
            addCriterion("MERCHANT_SHORT_NAME =", value, "merchantShortName");
            return (Criteria) this;
        }

        public Criteria andMerchantShortNameNotEqualTo(String value) {
            addCriterion("MERCHANT_SHORT_NAME <>", value, "merchantShortName");
            return (Criteria) this;
        }

        public Criteria andMerchantShortNameGreaterThan(String value) {
            addCriterion("MERCHANT_SHORT_NAME >", value, "merchantShortName");
            return (Criteria) this;
        }

        public Criteria andMerchantShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANT_SHORT_NAME >=", value, "merchantShortName");
            return (Criteria) this;
        }

        public Criteria andMerchantShortNameLessThan(String value) {
            addCriterion("MERCHANT_SHORT_NAME <", value, "merchantShortName");
            return (Criteria) this;
        }

        public Criteria andMerchantShortNameLessThanOrEqualTo(String value) {
            addCriterion("MERCHANT_SHORT_NAME <=", value, "merchantShortName");
            return (Criteria) this;
        }

        public Criteria andMerchantShortNameLike(String value) {
            addCriterion("MERCHANT_SHORT_NAME like", value, "merchantShortName");
            return (Criteria) this;
        }

        public Criteria andMerchantShortNameNotLike(String value) {
            addCriterion("MERCHANT_SHORT_NAME not like", value, "merchantShortName");
            return (Criteria) this;
        }

        public Criteria andMerchantShortNameIn(List<String> values) {
            addCriterion("MERCHANT_SHORT_NAME in", values, "merchantShortName");
            return (Criteria) this;
        }

        public Criteria andMerchantShortNameNotIn(List<String> values) {
            addCriterion("MERCHANT_SHORT_NAME not in", values, "merchantShortName");
            return (Criteria) this;
        }

        public Criteria andMerchantShortNameBetween(String value1, String value2) {
            addCriterion("MERCHANT_SHORT_NAME between", value1, value2, "merchantShortName");
            return (Criteria) this;
        }

        public Criteria andMerchantShortNameNotBetween(String value1, String value2) {
            addCriterion("MERCHANT_SHORT_NAME not between", value1, value2, "merchantShortName");
            return (Criteria) this;
        }

        public Criteria andUnconfirmedCountIsNull() {
            addCriterion("UNCONFIRMED_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andUnconfirmedCountIsNotNull() {
            addCriterion("UNCONFIRMED_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andUnconfirmedCountEqualTo(Long value) {
            addCriterion("UNCONFIRMED_COUNT =", value, "unconfirmedCount");
            return (Criteria) this;
        }

        public Criteria andUnconfirmedCountNotEqualTo(Long value) {
            addCriterion("UNCONFIRMED_COUNT <>", value, "unconfirmedCount");
            return (Criteria) this;
        }

        public Criteria andUnconfirmedCountGreaterThan(Long value) {
            addCriterion("UNCONFIRMED_COUNT >", value, "unconfirmedCount");
            return (Criteria) this;
        }

        public Criteria andUnconfirmedCountGreaterThanOrEqualTo(Long value) {
            addCriterion("UNCONFIRMED_COUNT >=", value, "unconfirmedCount");
            return (Criteria) this;
        }

        public Criteria andUnconfirmedCountLessThan(Long value) {
            addCriterion("UNCONFIRMED_COUNT <", value, "unconfirmedCount");
            return (Criteria) this;
        }

        public Criteria andUnconfirmedCountLessThanOrEqualTo(Long value) {
            addCriterion("UNCONFIRMED_COUNT <=", value, "unconfirmedCount");
            return (Criteria) this;
        }

        public Criteria andUnconfirmedCountIn(List<Long> values) {
            addCriterion("UNCONFIRMED_COUNT in", values, "unconfirmedCount");
            return (Criteria) this;
        }

        public Criteria andUnconfirmedCountNotIn(List<Long> values) {
            addCriterion("UNCONFIRMED_COUNT not in", values, "unconfirmedCount");
            return (Criteria) this;
        }

        public Criteria andUnconfirmedCountBetween(Long value1, Long value2) {
            addCriterion("UNCONFIRMED_COUNT between", value1, value2, "unconfirmedCount");
            return (Criteria) this;
        }

        public Criteria andUnconfirmedCountNotBetween(Long value1, Long value2) {
            addCriterion("UNCONFIRMED_COUNT not between", value1, value2, "unconfirmedCount");
            return (Criteria) this;
        }

        public Criteria andUserRoleIsNull() {
            addCriterion("USER_ROLE is null");
            return (Criteria) this;
        }

        public Criteria andUserRoleIsNotNull() {
            addCriterion("USER_ROLE is not null");
            return (Criteria) this;
        }

        public Criteria andUserRoleEqualTo(String value) {
            addCriterion("USER_ROLE =", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotEqualTo(String value) {
            addCriterion("USER_ROLE <>", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleGreaterThan(String value) {
            addCriterion("USER_ROLE >", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ROLE >=", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleLessThan(String value) {
            addCriterion("USER_ROLE <", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleLessThanOrEqualTo(String value) {
            addCriterion("USER_ROLE <=", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleLike(String value) {
            addCriterion("USER_ROLE like", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotLike(String value) {
            addCriterion("USER_ROLE not like", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleIn(List<String> values) {
            addCriterion("USER_ROLE in", values, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotIn(List<String> values) {
            addCriterion("USER_ROLE not in", values, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleBetween(String value1, String value2) {
            addCriterion("USER_ROLE between", value1, value2, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotBetween(String value1, String value2) {
            addCriterion("USER_ROLE not between", value1, value2, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("USER_TYPE =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("USER_TYPE <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("USER_TYPE >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_TYPE >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("USER_TYPE <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("USER_TYPE <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("USER_TYPE like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("USER_TYPE not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("USER_TYPE in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("USER_TYPE not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("USER_TYPE between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("USER_TYPE not between", value1, value2, "userType");
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
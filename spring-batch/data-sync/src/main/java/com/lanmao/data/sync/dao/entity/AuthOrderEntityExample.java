package com.lanmao.data.sync.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuthOrderEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuthOrderEntityExample() {
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

        public Criteria andInitiatorIsNull() {
            addCriterion("INITIATOR is null");
            return (Criteria) this;
        }

        public Criteria andInitiatorIsNotNull() {
            addCriterion("INITIATOR is not null");
            return (Criteria) this;
        }

        public Criteria andInitiatorEqualTo(String value) {
            addCriterion("INITIATOR =", value, "initiator");
            return (Criteria) this;
        }

        public Criteria andInitiatorNotEqualTo(String value) {
            addCriterion("INITIATOR <>", value, "initiator");
            return (Criteria) this;
        }

        public Criteria andInitiatorGreaterThan(String value) {
            addCriterion("INITIATOR >", value, "initiator");
            return (Criteria) this;
        }

        public Criteria andInitiatorGreaterThanOrEqualTo(String value) {
            addCriterion("INITIATOR >=", value, "initiator");
            return (Criteria) this;
        }

        public Criteria andInitiatorLessThan(String value) {
            addCriterion("INITIATOR <", value, "initiator");
            return (Criteria) this;
        }

        public Criteria andInitiatorLessThanOrEqualTo(String value) {
            addCriterion("INITIATOR <=", value, "initiator");
            return (Criteria) this;
        }

        public Criteria andInitiatorLike(String value) {
            addCriterion("INITIATOR like", value, "initiator");
            return (Criteria) this;
        }

        public Criteria andInitiatorNotLike(String value) {
            addCriterion("INITIATOR not like", value, "initiator");
            return (Criteria) this;
        }

        public Criteria andInitiatorIn(List<String> values) {
            addCriterion("INITIATOR in", values, "initiator");
            return (Criteria) this;
        }

        public Criteria andInitiatorNotIn(List<String> values) {
            addCriterion("INITIATOR not in", values, "initiator");
            return (Criteria) this;
        }

        public Criteria andInitiatorBetween(String value1, String value2) {
            addCriterion("INITIATOR between", value1, value2, "initiator");
            return (Criteria) this;
        }

        public Criteria andInitiatorNotBetween(String value1, String value2) {
            addCriterion("INITIATOR not between", value1, value2, "initiator");
            return (Criteria) this;
        }

        public Criteria andRequestNoIsNull() {
            addCriterion("REQUEST_NO is null");
            return (Criteria) this;
        }

        public Criteria andRequestNoIsNotNull() {
            addCriterion("REQUEST_NO is not null");
            return (Criteria) this;
        }

        public Criteria andRequestNoEqualTo(String value) {
            addCriterion("REQUEST_NO =", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoNotEqualTo(String value) {
            addCriterion("REQUEST_NO <>", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoGreaterThan(String value) {
            addCriterion("REQUEST_NO >", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoGreaterThanOrEqualTo(String value) {
            addCriterion("REQUEST_NO >=", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoLessThan(String value) {
            addCriterion("REQUEST_NO <", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoLessThanOrEqualTo(String value) {
            addCriterion("REQUEST_NO <=", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoLike(String value) {
            addCriterion("REQUEST_NO like", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoNotLike(String value) {
            addCriterion("REQUEST_NO not like", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoIn(List<String> values) {
            addCriterion("REQUEST_NO in", values, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoNotIn(List<String> values) {
            addCriterion("REQUEST_NO not in", values, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoBetween(String value1, String value2) {
            addCriterion("REQUEST_NO between", value1, value2, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoNotBetween(String value1, String value2) {
            addCriterion("REQUEST_NO not between", value1, value2, "requestNo");
            return (Criteria) this;
        }

        public Criteria andAuthNoIsNull() {
            addCriterion("AUTH_NO is null");
            return (Criteria) this;
        }

        public Criteria andAuthNoIsNotNull() {
            addCriterion("AUTH_NO is not null");
            return (Criteria) this;
        }

        public Criteria andAuthNoEqualTo(String value) {
            addCriterion("AUTH_NO =", value, "authNo");
            return (Criteria) this;
        }

        public Criteria andAuthNoNotEqualTo(String value) {
            addCriterion("AUTH_NO <>", value, "authNo");
            return (Criteria) this;
        }

        public Criteria andAuthNoGreaterThan(String value) {
            addCriterion("AUTH_NO >", value, "authNo");
            return (Criteria) this;
        }

        public Criteria andAuthNoGreaterThanOrEqualTo(String value) {
            addCriterion("AUTH_NO >=", value, "authNo");
            return (Criteria) this;
        }

        public Criteria andAuthNoLessThan(String value) {
            addCriterion("AUTH_NO <", value, "authNo");
            return (Criteria) this;
        }

        public Criteria andAuthNoLessThanOrEqualTo(String value) {
            addCriterion("AUTH_NO <=", value, "authNo");
            return (Criteria) this;
        }

        public Criteria andAuthNoLike(String value) {
            addCriterion("AUTH_NO like", value, "authNo");
            return (Criteria) this;
        }

        public Criteria andAuthNoNotLike(String value) {
            addCriterion("AUTH_NO not like", value, "authNo");
            return (Criteria) this;
        }

        public Criteria andAuthNoIn(List<String> values) {
            addCriterion("AUTH_NO in", values, "authNo");
            return (Criteria) this;
        }

        public Criteria andAuthNoNotIn(List<String> values) {
            addCriterion("AUTH_NO not in", values, "authNo");
            return (Criteria) this;
        }

        public Criteria andAuthNoBetween(String value1, String value2) {
            addCriterion("AUTH_NO between", value1, value2, "authNo");
            return (Criteria) this;
        }

        public Criteria andAuthNoNotBetween(String value1, String value2) {
            addCriterion("AUTH_NO not between", value1, value2, "authNo");
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

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoIsNull() {
            addCriterion("MERCHANT_ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoIsNotNull() {
            addCriterion("MERCHANT_ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoEqualTo(String value) {
            addCriterion("MERCHANT_ORDER_NO =", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoNotEqualTo(String value) {
            addCriterion("MERCHANT_ORDER_NO <>", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoGreaterThan(String value) {
            addCriterion("MERCHANT_ORDER_NO >", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANT_ORDER_NO >=", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoLessThan(String value) {
            addCriterion("MERCHANT_ORDER_NO <", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoLessThanOrEqualTo(String value) {
            addCriterion("MERCHANT_ORDER_NO <=", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoLike(String value) {
            addCriterion("MERCHANT_ORDER_NO like", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoNotLike(String value) {
            addCriterion("MERCHANT_ORDER_NO not like", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoIn(List<String> values) {
            addCriterion("MERCHANT_ORDER_NO in", values, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoNotIn(List<String> values) {
            addCriterion("MERCHANT_ORDER_NO not in", values, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoBetween(String value1, String value2) {
            addCriterion("MERCHANT_ORDER_NO between", value1, value2, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoNotBetween(String value1, String value2) {
            addCriterion("MERCHANT_ORDER_NO not between", value1, value2, "merchantOrderNo");
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

        public Criteria andBankIsNull() {
            addCriterion("BANK is null");
            return (Criteria) this;
        }

        public Criteria andBankIsNotNull() {
            addCriterion("BANK is not null");
            return (Criteria) this;
        }

        public Criteria andBankEqualTo(String value) {
            addCriterion("BANK =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(String value) {
            addCriterion("BANK <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(String value) {
            addCriterion("BANK >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(String value) {
            addCriterion("BANK >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(String value) {
            addCriterion("BANK <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(String value) {
            addCriterion("BANK <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLike(String value) {
            addCriterion("BANK like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotLike(String value) {
            addCriterion("BANK not like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<String> values) {
            addCriterion("BANK in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<String> values) {
            addCriterion("BANK not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(String value1, String value2) {
            addCriterion("BANK between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(String value1, String value2) {
            addCriterion("BANK not between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andAuthFactorIsNull() {
            addCriterion("AUTH_FACTOR is null");
            return (Criteria) this;
        }

        public Criteria andAuthFactorIsNotNull() {
            addCriterion("AUTH_FACTOR is not null");
            return (Criteria) this;
        }

        public Criteria andAuthFactorEqualTo(String value) {
            addCriterion("AUTH_FACTOR =", value, "authFactor");
            return (Criteria) this;
        }

        public Criteria andAuthFactorNotEqualTo(String value) {
            addCriterion("AUTH_FACTOR <>", value, "authFactor");
            return (Criteria) this;
        }

        public Criteria andAuthFactorGreaterThan(String value) {
            addCriterion("AUTH_FACTOR >", value, "authFactor");
            return (Criteria) this;
        }

        public Criteria andAuthFactorGreaterThanOrEqualTo(String value) {
            addCriterion("AUTH_FACTOR >=", value, "authFactor");
            return (Criteria) this;
        }

        public Criteria andAuthFactorLessThan(String value) {
            addCriterion("AUTH_FACTOR <", value, "authFactor");
            return (Criteria) this;
        }

        public Criteria andAuthFactorLessThanOrEqualTo(String value) {
            addCriterion("AUTH_FACTOR <=", value, "authFactor");
            return (Criteria) this;
        }

        public Criteria andAuthFactorLike(String value) {
            addCriterion("AUTH_FACTOR like", value, "authFactor");
            return (Criteria) this;
        }

        public Criteria andAuthFactorNotLike(String value) {
            addCriterion("AUTH_FACTOR not like", value, "authFactor");
            return (Criteria) this;
        }

        public Criteria andAuthFactorIn(List<String> values) {
            addCriterion("AUTH_FACTOR in", values, "authFactor");
            return (Criteria) this;
        }

        public Criteria andAuthFactorNotIn(List<String> values) {
            addCriterion("AUTH_FACTOR not in", values, "authFactor");
            return (Criteria) this;
        }

        public Criteria andAuthFactorBetween(String value1, String value2) {
            addCriterion("AUTH_FACTOR between", value1, value2, "authFactor");
            return (Criteria) this;
        }

        public Criteria andAuthFactorNotBetween(String value1, String value2) {
            addCriterion("AUTH_FACTOR not between", value1, value2, "authFactor");
            return (Criteria) this;
        }

        public Criteria andCnapsIsNull() {
            addCriterion("CNAPS is null");
            return (Criteria) this;
        }

        public Criteria andCnapsIsNotNull() {
            addCriterion("CNAPS is not null");
            return (Criteria) this;
        }

        public Criteria andCnapsEqualTo(String value) {
            addCriterion("CNAPS =", value, "cnaps");
            return (Criteria) this;
        }

        public Criteria andCnapsNotEqualTo(String value) {
            addCriterion("CNAPS <>", value, "cnaps");
            return (Criteria) this;
        }

        public Criteria andCnapsGreaterThan(String value) {
            addCriterion("CNAPS >", value, "cnaps");
            return (Criteria) this;
        }

        public Criteria andCnapsGreaterThanOrEqualTo(String value) {
            addCriterion("CNAPS >=", value, "cnaps");
            return (Criteria) this;
        }

        public Criteria andCnapsLessThan(String value) {
            addCriterion("CNAPS <", value, "cnaps");
            return (Criteria) this;
        }

        public Criteria andCnapsLessThanOrEqualTo(String value) {
            addCriterion("CNAPS <=", value, "cnaps");
            return (Criteria) this;
        }

        public Criteria andCnapsLike(String value) {
            addCriterion("CNAPS like", value, "cnaps");
            return (Criteria) this;
        }

        public Criteria andCnapsNotLike(String value) {
            addCriterion("CNAPS not like", value, "cnaps");
            return (Criteria) this;
        }

        public Criteria andCnapsIn(List<String> values) {
            addCriterion("CNAPS in", values, "cnaps");
            return (Criteria) this;
        }

        public Criteria andCnapsNotIn(List<String> values) {
            addCriterion("CNAPS not in", values, "cnaps");
            return (Criteria) this;
        }

        public Criteria andCnapsBetween(String value1, String value2) {
            addCriterion("CNAPS between", value1, value2, "cnaps");
            return (Criteria) this;
        }

        public Criteria andCnapsNotBetween(String value1, String value2) {
            addCriterion("CNAPS not between", value1, value2, "cnaps");
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

        public Criteria andBizTypeIsNull() {
            addCriterion("BIZ_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBizTypeIsNotNull() {
            addCriterion("BIZ_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBizTypeEqualTo(String value) {
            addCriterion("BIZ_TYPE =", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotEqualTo(String value) {
            addCriterion("BIZ_TYPE <>", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThan(String value) {
            addCriterion("BIZ_TYPE >", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BIZ_TYPE >=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThan(String value) {
            addCriterion("BIZ_TYPE <", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThanOrEqualTo(String value) {
            addCriterion("BIZ_TYPE <=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLike(String value) {
            addCriterion("BIZ_TYPE like", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotLike(String value) {
            addCriterion("BIZ_TYPE not like", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeIn(List<String> values) {
            addCriterion("BIZ_TYPE in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotIn(List<String> values) {
            addCriterion("BIZ_TYPE not in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeBetween(String value1, String value2) {
            addCriterion("BIZ_TYPE between", value1, value2, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotBetween(String value1, String value2) {
            addCriterion("BIZ_TYPE not between", value1, value2, "bizType");
            return (Criteria) this;
        }

        public Criteria andMerchantNoIsNull() {
            addCriterion("MERCHANT_NO is null");
            return (Criteria) this;
        }

        public Criteria andMerchantNoIsNotNull() {
            addCriterion("MERCHANT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantNoEqualTo(String value) {
            addCriterion("MERCHANT_NO =", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotEqualTo(String value) {
            addCriterion("MERCHANT_NO <>", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoGreaterThan(String value) {
            addCriterion("MERCHANT_NO >", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANT_NO >=", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLessThan(String value) {
            addCriterion("MERCHANT_NO <", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLessThanOrEqualTo(String value) {
            addCriterion("MERCHANT_NO <=", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLike(String value) {
            addCriterion("MERCHANT_NO like", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotLike(String value) {
            addCriterion("MERCHANT_NO not like", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoIn(List<String> values) {
            addCriterion("MERCHANT_NO in", values, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotIn(List<String> values) {
            addCriterion("MERCHANT_NO not in", values, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoBetween(String value1, String value2) {
            addCriterion("MERCHANT_NO between", value1, value2, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotBetween(String value1, String value2) {
            addCriterion("MERCHANT_NO not between", value1, value2, "merchantNo");
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

        public Criteria andTranslateErrorCodeIsNull() {
            addCriterion("TRANSLATE_ERROR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTranslateErrorCodeIsNotNull() {
            addCriterion("TRANSLATE_ERROR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTranslateErrorCodeEqualTo(String value) {
            addCriterion("TRANSLATE_ERROR_CODE =", value, "translateErrorCode");
            return (Criteria) this;
        }

        public Criteria andTranslateErrorCodeNotEqualTo(String value) {
            addCriterion("TRANSLATE_ERROR_CODE <>", value, "translateErrorCode");
            return (Criteria) this;
        }

        public Criteria andTranslateErrorCodeGreaterThan(String value) {
            addCriterion("TRANSLATE_ERROR_CODE >", value, "translateErrorCode");
            return (Criteria) this;
        }

        public Criteria andTranslateErrorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSLATE_ERROR_CODE >=", value, "translateErrorCode");
            return (Criteria) this;
        }

        public Criteria andTranslateErrorCodeLessThan(String value) {
            addCriterion("TRANSLATE_ERROR_CODE <", value, "translateErrorCode");
            return (Criteria) this;
        }

        public Criteria andTranslateErrorCodeLessThanOrEqualTo(String value) {
            addCriterion("TRANSLATE_ERROR_CODE <=", value, "translateErrorCode");
            return (Criteria) this;
        }

        public Criteria andTranslateErrorCodeLike(String value) {
            addCriterion("TRANSLATE_ERROR_CODE like", value, "translateErrorCode");
            return (Criteria) this;
        }

        public Criteria andTranslateErrorCodeNotLike(String value) {
            addCriterion("TRANSLATE_ERROR_CODE not like", value, "translateErrorCode");
            return (Criteria) this;
        }

        public Criteria andTranslateErrorCodeIn(List<String> values) {
            addCriterion("TRANSLATE_ERROR_CODE in", values, "translateErrorCode");
            return (Criteria) this;
        }

        public Criteria andTranslateErrorCodeNotIn(List<String> values) {
            addCriterion("TRANSLATE_ERROR_CODE not in", values, "translateErrorCode");
            return (Criteria) this;
        }

        public Criteria andTranslateErrorCodeBetween(String value1, String value2) {
            addCriterion("TRANSLATE_ERROR_CODE between", value1, value2, "translateErrorCode");
            return (Criteria) this;
        }

        public Criteria andTranslateErrorCodeNotBetween(String value1, String value2) {
            addCriterion("TRANSLATE_ERROR_CODE not between", value1, value2, "translateErrorCode");
            return (Criteria) this;
        }

        public Criteria andTranslateErrorMessageIsNull() {
            addCriterion("TRANSLATE_ERROR_MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andTranslateErrorMessageIsNotNull() {
            addCriterion("TRANSLATE_ERROR_MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andTranslateErrorMessageEqualTo(String value) {
            addCriterion("TRANSLATE_ERROR_MESSAGE =", value, "translateErrorMessage");
            return (Criteria) this;
        }

        public Criteria andTranslateErrorMessageNotEqualTo(String value) {
            addCriterion("TRANSLATE_ERROR_MESSAGE <>", value, "translateErrorMessage");
            return (Criteria) this;
        }

        public Criteria andTranslateErrorMessageGreaterThan(String value) {
            addCriterion("TRANSLATE_ERROR_MESSAGE >", value, "translateErrorMessage");
            return (Criteria) this;
        }

        public Criteria andTranslateErrorMessageGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSLATE_ERROR_MESSAGE >=", value, "translateErrorMessage");
            return (Criteria) this;
        }

        public Criteria andTranslateErrorMessageLessThan(String value) {
            addCriterion("TRANSLATE_ERROR_MESSAGE <", value, "translateErrorMessage");
            return (Criteria) this;
        }

        public Criteria andTranslateErrorMessageLessThanOrEqualTo(String value) {
            addCriterion("TRANSLATE_ERROR_MESSAGE <=", value, "translateErrorMessage");
            return (Criteria) this;
        }

        public Criteria andTranslateErrorMessageLike(String value) {
            addCriterion("TRANSLATE_ERROR_MESSAGE like", value, "translateErrorMessage");
            return (Criteria) this;
        }

        public Criteria andTranslateErrorMessageNotLike(String value) {
            addCriterion("TRANSLATE_ERROR_MESSAGE not like", value, "translateErrorMessage");
            return (Criteria) this;
        }

        public Criteria andTranslateErrorMessageIn(List<String> values) {
            addCriterion("TRANSLATE_ERROR_MESSAGE in", values, "translateErrorMessage");
            return (Criteria) this;
        }

        public Criteria andTranslateErrorMessageNotIn(List<String> values) {
            addCriterion("TRANSLATE_ERROR_MESSAGE not in", values, "translateErrorMessage");
            return (Criteria) this;
        }

        public Criteria andTranslateErrorMessageBetween(String value1, String value2) {
            addCriterion("TRANSLATE_ERROR_MESSAGE between", value1, value2, "translateErrorMessage");
            return (Criteria) this;
        }

        public Criteria andTranslateErrorMessageNotBetween(String value1, String value2) {
            addCriterion("TRANSLATE_ERROR_MESSAGE not between", value1, value2, "translateErrorMessage");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeIsNull() {
            addCriterion("CONSUME_TIME is null");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeIsNotNull() {
            addCriterion("CONSUME_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeEqualTo(Long value) {
            addCriterion("CONSUME_TIME =", value, "consumeTime");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeNotEqualTo(Long value) {
            addCriterion("CONSUME_TIME <>", value, "consumeTime");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeGreaterThan(Long value) {
            addCriterion("CONSUME_TIME >", value, "consumeTime");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("CONSUME_TIME >=", value, "consumeTime");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeLessThan(Long value) {
            addCriterion("CONSUME_TIME <", value, "consumeTime");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeLessThanOrEqualTo(Long value) {
            addCriterion("CONSUME_TIME <=", value, "consumeTime");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeIn(List<Long> values) {
            addCriterion("CONSUME_TIME in", values, "consumeTime");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeNotIn(List<Long> values) {
            addCriterion("CONSUME_TIME not in", values, "consumeTime");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeBetween(Long value1, Long value2) {
            addCriterion("CONSUME_TIME between", value1, value2, "consumeTime");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeNotBetween(Long value1, Long value2) {
            addCriterion("CONSUME_TIME not between", value1, value2, "consumeTime");
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
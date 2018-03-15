package com.lanmao.data.sync.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaymentAuthorizationEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaymentAuthorizationEntityExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andAuthorizationNoIsNull() {
            addCriterion("AUTHORIZATION_NO is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizationNoIsNotNull() {
            addCriterion("AUTHORIZATION_NO is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizationNoEqualTo(String value) {
            addCriterion("AUTHORIZATION_NO =", value, "authorizationNo");
            return (Criteria) this;
        }

        public Criteria andAuthorizationNoNotEqualTo(String value) {
            addCriterion("AUTHORIZATION_NO <>", value, "authorizationNo");
            return (Criteria) this;
        }

        public Criteria andAuthorizationNoGreaterThan(String value) {
            addCriterion("AUTHORIZATION_NO >", value, "authorizationNo");
            return (Criteria) this;
        }

        public Criteria andAuthorizationNoGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHORIZATION_NO >=", value, "authorizationNo");
            return (Criteria) this;
        }

        public Criteria andAuthorizationNoLessThan(String value) {
            addCriterion("AUTHORIZATION_NO <", value, "authorizationNo");
            return (Criteria) this;
        }

        public Criteria andAuthorizationNoLessThanOrEqualTo(String value) {
            addCriterion("AUTHORIZATION_NO <=", value, "authorizationNo");
            return (Criteria) this;
        }

        public Criteria andAuthorizationNoLike(String value) {
            addCriterion("AUTHORIZATION_NO like", value, "authorizationNo");
            return (Criteria) this;
        }

        public Criteria andAuthorizationNoNotLike(String value) {
            addCriterion("AUTHORIZATION_NO not like", value, "authorizationNo");
            return (Criteria) this;
        }

        public Criteria andAuthorizationNoIn(List<String> values) {
            addCriterion("AUTHORIZATION_NO in", values, "authorizationNo");
            return (Criteria) this;
        }

        public Criteria andAuthorizationNoNotIn(List<String> values) {
            addCriterion("AUTHORIZATION_NO not in", values, "authorizationNo");
            return (Criteria) this;
        }

        public Criteria andAuthorizationNoBetween(String value1, String value2) {
            addCriterion("AUTHORIZATION_NO between", value1, value2, "authorizationNo");
            return (Criteria) this;
        }

        public Criteria andAuthorizationNoNotBetween(String value1, String value2) {
            addCriterion("AUTHORIZATION_NO not between", value1, value2, "authorizationNo");
            return (Criteria) this;
        }

        public Criteria andPayAccountIsNull() {
            addCriterion("PAY_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPayAccountIsNotNull() {
            addCriterion("PAY_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPayAccountEqualTo(String value) {
            addCriterion("PAY_ACCOUNT =", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountNotEqualTo(String value) {
            addCriterion("PAY_ACCOUNT <>", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountGreaterThan(String value) {
            addCriterion("PAY_ACCOUNT >", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_ACCOUNT >=", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountLessThan(String value) {
            addCriterion("PAY_ACCOUNT <", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountLessThanOrEqualTo(String value) {
            addCriterion("PAY_ACCOUNT <=", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountLike(String value) {
            addCriterion("PAY_ACCOUNT like", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountNotLike(String value) {
            addCriterion("PAY_ACCOUNT not like", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountIn(List<String> values) {
            addCriterion("PAY_ACCOUNT in", values, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountNotIn(List<String> values) {
            addCriterion("PAY_ACCOUNT not in", values, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountBetween(String value1, String value2) {
            addCriterion("PAY_ACCOUNT between", value1, value2, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountNotBetween(String value1, String value2) {
            addCriterion("PAY_ACCOUNT not between", value1, value2, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayerNameIsNull() {
            addCriterion("PAYER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPayerNameIsNotNull() {
            addCriterion("PAYER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPayerNameEqualTo(String value) {
            addCriterion("PAYER_NAME =", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameNotEqualTo(String value) {
            addCriterion("PAYER_NAME <>", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameGreaterThan(String value) {
            addCriterion("PAYER_NAME >", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameGreaterThanOrEqualTo(String value) {
            addCriterion("PAYER_NAME >=", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameLessThan(String value) {
            addCriterion("PAYER_NAME <", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameLessThanOrEqualTo(String value) {
            addCriterion("PAYER_NAME <=", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameLike(String value) {
            addCriterion("PAYER_NAME like", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameNotLike(String value) {
            addCriterion("PAYER_NAME not like", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameIn(List<String> values) {
            addCriterion("PAYER_NAME in", values, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameNotIn(List<String> values) {
            addCriterion("PAYER_NAME not in", values, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameBetween(String value1, String value2) {
            addCriterion("PAYER_NAME between", value1, value2, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameNotBetween(String value1, String value2) {
            addCriterion("PAYER_NAME not between", value1, value2, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerMobileIsNull() {
            addCriterion("PAYER_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andPayerMobileIsNotNull() {
            addCriterion("PAYER_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andPayerMobileEqualTo(String value) {
            addCriterion("PAYER_MOBILE =", value, "payerMobile");
            return (Criteria) this;
        }

        public Criteria andPayerMobileNotEqualTo(String value) {
            addCriterion("PAYER_MOBILE <>", value, "payerMobile");
            return (Criteria) this;
        }

        public Criteria andPayerMobileGreaterThan(String value) {
            addCriterion("PAYER_MOBILE >", value, "payerMobile");
            return (Criteria) this;
        }

        public Criteria andPayerMobileGreaterThanOrEqualTo(String value) {
            addCriterion("PAYER_MOBILE >=", value, "payerMobile");
            return (Criteria) this;
        }

        public Criteria andPayerMobileLessThan(String value) {
            addCriterion("PAYER_MOBILE <", value, "payerMobile");
            return (Criteria) this;
        }

        public Criteria andPayerMobileLessThanOrEqualTo(String value) {
            addCriterion("PAYER_MOBILE <=", value, "payerMobile");
            return (Criteria) this;
        }

        public Criteria andPayerMobileLike(String value) {
            addCriterion("PAYER_MOBILE like", value, "payerMobile");
            return (Criteria) this;
        }

        public Criteria andPayerMobileNotLike(String value) {
            addCriterion("PAYER_MOBILE not like", value, "payerMobile");
            return (Criteria) this;
        }

        public Criteria andPayerMobileIn(List<String> values) {
            addCriterion("PAYER_MOBILE in", values, "payerMobile");
            return (Criteria) this;
        }

        public Criteria andPayerMobileNotIn(List<String> values) {
            addCriterion("PAYER_MOBILE not in", values, "payerMobile");
            return (Criteria) this;
        }

        public Criteria andPayerMobileBetween(String value1, String value2) {
            addCriterion("PAYER_MOBILE between", value1, value2, "payerMobile");
            return (Criteria) this;
        }

        public Criteria andPayerMobileNotBetween(String value1, String value2) {
            addCriterion("PAYER_MOBILE not between", value1, value2, "payerMobile");
            return (Criteria) this;
        }

        public Criteria andPayerCredNumIsNull() {
            addCriterion("PAYER_CRED_NUM is null");
            return (Criteria) this;
        }

        public Criteria andPayerCredNumIsNotNull() {
            addCriterion("PAYER_CRED_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andPayerCredNumEqualTo(String value) {
            addCriterion("PAYER_CRED_NUM =", value, "payerCredNum");
            return (Criteria) this;
        }

        public Criteria andPayerCredNumNotEqualTo(String value) {
            addCriterion("PAYER_CRED_NUM <>", value, "payerCredNum");
            return (Criteria) this;
        }

        public Criteria andPayerCredNumGreaterThan(String value) {
            addCriterion("PAYER_CRED_NUM >", value, "payerCredNum");
            return (Criteria) this;
        }

        public Criteria andPayerCredNumGreaterThanOrEqualTo(String value) {
            addCriterion("PAYER_CRED_NUM >=", value, "payerCredNum");
            return (Criteria) this;
        }

        public Criteria andPayerCredNumLessThan(String value) {
            addCriterion("PAYER_CRED_NUM <", value, "payerCredNum");
            return (Criteria) this;
        }

        public Criteria andPayerCredNumLessThanOrEqualTo(String value) {
            addCriterion("PAYER_CRED_NUM <=", value, "payerCredNum");
            return (Criteria) this;
        }

        public Criteria andPayerCredNumLike(String value) {
            addCriterion("PAYER_CRED_NUM like", value, "payerCredNum");
            return (Criteria) this;
        }

        public Criteria andPayerCredNumNotLike(String value) {
            addCriterion("PAYER_CRED_NUM not like", value, "payerCredNum");
            return (Criteria) this;
        }

        public Criteria andPayerCredNumIn(List<String> values) {
            addCriterion("PAYER_CRED_NUM in", values, "payerCredNum");
            return (Criteria) this;
        }

        public Criteria andPayerCredNumNotIn(List<String> values) {
            addCriterion("PAYER_CRED_NUM not in", values, "payerCredNum");
            return (Criteria) this;
        }

        public Criteria andPayerCredNumBetween(String value1, String value2) {
            addCriterion("PAYER_CRED_NUM between", value1, value2, "payerCredNum");
            return (Criteria) this;
        }

        public Criteria andPayerCredNumNotBetween(String value1, String value2) {
            addCriterion("PAYER_CRED_NUM not between", value1, value2, "payerCredNum");
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

        public Criteria andBindNoIsNull() {
            addCriterion("BIND_NO is null");
            return (Criteria) this;
        }

        public Criteria andBindNoIsNotNull() {
            addCriterion("BIND_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBindNoEqualTo(String value) {
            addCriterion("BIND_NO =", value, "bindNo");
            return (Criteria) this;
        }

        public Criteria andBindNoNotEqualTo(String value) {
            addCriterion("BIND_NO <>", value, "bindNo");
            return (Criteria) this;
        }

        public Criteria andBindNoGreaterThan(String value) {
            addCriterion("BIND_NO >", value, "bindNo");
            return (Criteria) this;
        }

        public Criteria andBindNoGreaterThanOrEqualTo(String value) {
            addCriterion("BIND_NO >=", value, "bindNo");
            return (Criteria) this;
        }

        public Criteria andBindNoLessThan(String value) {
            addCriterion("BIND_NO <", value, "bindNo");
            return (Criteria) this;
        }

        public Criteria andBindNoLessThanOrEqualTo(String value) {
            addCriterion("BIND_NO <=", value, "bindNo");
            return (Criteria) this;
        }

        public Criteria andBindNoLike(String value) {
            addCriterion("BIND_NO like", value, "bindNo");
            return (Criteria) this;
        }

        public Criteria andBindNoNotLike(String value) {
            addCriterion("BIND_NO not like", value, "bindNo");
            return (Criteria) this;
        }

        public Criteria andBindNoIn(List<String> values) {
            addCriterion("BIND_NO in", values, "bindNo");
            return (Criteria) this;
        }

        public Criteria andBindNoNotIn(List<String> values) {
            addCriterion("BIND_NO not in", values, "bindNo");
            return (Criteria) this;
        }

        public Criteria andBindNoBetween(String value1, String value2) {
            addCriterion("BIND_NO between", value1, value2, "bindNo");
            return (Criteria) this;
        }

        public Criteria andBindNoNotBetween(String value1, String value2) {
            addCriterion("BIND_NO not between", value1, value2, "bindNo");
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
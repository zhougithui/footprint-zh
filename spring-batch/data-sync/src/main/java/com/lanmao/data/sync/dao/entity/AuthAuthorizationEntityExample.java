package com.lanmao.data.sync.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuthAuthorizationEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuthAuthorizationEntityExample() {
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

        public Criteria andExpiryDateIsNull() {
            addCriterion("EXPIRY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andExpiryDateIsNotNull() {
            addCriterion("EXPIRY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andExpiryDateEqualTo(Date value) {
            addCriterion("EXPIRY_DATE =", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateNotEqualTo(Date value) {
            addCriterion("EXPIRY_DATE <>", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateGreaterThan(Date value) {
            addCriterion("EXPIRY_DATE >", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateGreaterThanOrEqualTo(Date value) {
            addCriterion("EXPIRY_DATE >=", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateLessThan(Date value) {
            addCriterion("EXPIRY_DATE <", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateLessThanOrEqualTo(Date value) {
            addCriterion("EXPIRY_DATE <=", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateIn(List<Date> values) {
            addCriterion("EXPIRY_DATE in", values, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateNotIn(List<Date> values) {
            addCriterion("EXPIRY_DATE not in", values, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateBetween(Date value1, Date value2) {
            addCriterion("EXPIRY_DATE between", value1, value2, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateNotBetween(Date value1, Date value2) {
            addCriterion("EXPIRY_DATE not between", value1, value2, "expiryDate");
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
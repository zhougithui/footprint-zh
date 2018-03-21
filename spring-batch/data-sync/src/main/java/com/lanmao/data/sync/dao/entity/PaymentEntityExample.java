package com.lanmao.data.sync.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaymentEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaymentEntityExample() {
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

        public Criteria andPaymentOrderIdIsNull() {
            addCriterion("PAYMENT_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderIdIsNotNull() {
            addCriterion("PAYMENT_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderIdEqualTo(Long value) {
            addCriterion("PAYMENT_ORDER_ID =", value, "paymentOrderId");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderIdNotEqualTo(Long value) {
            addCriterion("PAYMENT_ORDER_ID <>", value, "paymentOrderId");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderIdGreaterThan(Long value) {
            addCriterion("PAYMENT_ORDER_ID >", value, "paymentOrderId");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PAYMENT_ORDER_ID >=", value, "paymentOrderId");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderIdLessThan(Long value) {
            addCriterion("PAYMENT_ORDER_ID <", value, "paymentOrderId");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("PAYMENT_ORDER_ID <=", value, "paymentOrderId");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderIdIn(List<Long> values) {
            addCriterion("PAYMENT_ORDER_ID in", values, "paymentOrderId");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderIdNotIn(List<Long> values) {
            addCriterion("PAYMENT_ORDER_ID not in", values, "paymentOrderId");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderIdBetween(Long value1, Long value2) {
            addCriterion("PAYMENT_ORDER_ID between", value1, value2, "paymentOrderId");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("PAYMENT_ORDER_ID not between", value1, value2, "paymentOrderId");
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

        public Criteria andOrderAmountIsNull() {
            addCriterion("ORDER_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNotNull() {
            addCriterion("ORDER_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountEqualTo(Long value) {
            addCriterion("ORDER_AMOUNT =", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotEqualTo(Long value) {
            addCriterion("ORDER_AMOUNT <>", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThan(Long value) {
            addCriterion("ORDER_AMOUNT >", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("ORDER_AMOUNT >=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThan(Long value) {
            addCriterion("ORDER_AMOUNT <", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThanOrEqualTo(Long value) {
            addCriterion("ORDER_AMOUNT <=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIn(List<Long> values) {
            addCriterion("ORDER_AMOUNT in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotIn(List<Long> values) {
            addCriterion("ORDER_AMOUNT not in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountBetween(Long value1, Long value2) {
            addCriterion("ORDER_AMOUNT between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotBetween(Long value1, Long value2) {
            addCriterion("ORDER_AMOUNT not between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("CURRENCY is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("CURRENCY is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("CURRENCY =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("CURRENCY <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("CURRENCY >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCY >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("CURRENCY <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("CURRENCY <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("CURRENCY like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("CURRENCY not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("CURRENCY in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("CURRENCY not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("CURRENCY between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("CURRENCY not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNull() {
            addCriterion("PAY_WAY is null");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNotNull() {
            addCriterion("PAY_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andPayWayEqualTo(String value) {
            addCriterion("PAY_WAY =", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotEqualTo(String value) {
            addCriterion("PAY_WAY <>", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThan(String value) {
            addCriterion("PAY_WAY >", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_WAY >=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThan(String value) {
            addCriterion("PAY_WAY <", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThanOrEqualTo(String value) {
            addCriterion("PAY_WAY <=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLike(String value) {
            addCriterion("PAY_WAY like", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotLike(String value) {
            addCriterion("PAY_WAY not like", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayIn(List<String> values) {
            addCriterion("PAY_WAY in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotIn(List<String> values) {
            addCriterion("PAY_WAY not in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayBetween(String value1, String value2) {
            addCriterion("PAY_WAY between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotBetween(String value1, String value2) {
            addCriterion("PAY_WAY not between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andPaySourceIsNull() {
            addCriterion("PAY_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andPaySourceIsNotNull() {
            addCriterion("PAY_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andPaySourceEqualTo(String value) {
            addCriterion("PAY_SOURCE =", value, "paySource");
            return (Criteria) this;
        }

        public Criteria andPaySourceNotEqualTo(String value) {
            addCriterion("PAY_SOURCE <>", value, "paySource");
            return (Criteria) this;
        }

        public Criteria andPaySourceGreaterThan(String value) {
            addCriterion("PAY_SOURCE >", value, "paySource");
            return (Criteria) this;
        }

        public Criteria andPaySourceGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_SOURCE >=", value, "paySource");
            return (Criteria) this;
        }

        public Criteria andPaySourceLessThan(String value) {
            addCriterion("PAY_SOURCE <", value, "paySource");
            return (Criteria) this;
        }

        public Criteria andPaySourceLessThanOrEqualTo(String value) {
            addCriterion("PAY_SOURCE <=", value, "paySource");
            return (Criteria) this;
        }

        public Criteria andPaySourceLike(String value) {
            addCriterion("PAY_SOURCE like", value, "paySource");
            return (Criteria) this;
        }

        public Criteria andPaySourceNotLike(String value) {
            addCriterion("PAY_SOURCE not like", value, "paySource");
            return (Criteria) this;
        }

        public Criteria andPaySourceIn(List<String> values) {
            addCriterion("PAY_SOURCE in", values, "paySource");
            return (Criteria) this;
        }

        public Criteria andPaySourceNotIn(List<String> values) {
            addCriterion("PAY_SOURCE not in", values, "paySource");
            return (Criteria) this;
        }

        public Criteria andPaySourceBetween(String value1, String value2) {
            addCriterion("PAY_SOURCE between", value1, value2, "paySource");
            return (Criteria) this;
        }

        public Criteria andPaySourceNotBetween(String value1, String value2) {
            addCriterion("PAY_SOURCE not between", value1, value2, "paySource");
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

        public Criteria andPayChannelNoIsNull() {
            addCriterion("PAY_CHANNEL_NO is null");
            return (Criteria) this;
        }

        public Criteria andPayChannelNoIsNotNull() {
            addCriterion("PAY_CHANNEL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPayChannelNoEqualTo(String value) {
            addCriterion("PAY_CHANNEL_NO =", value, "payChannelNo");
            return (Criteria) this;
        }

        public Criteria andPayChannelNoNotEqualTo(String value) {
            addCriterion("PAY_CHANNEL_NO <>", value, "payChannelNo");
            return (Criteria) this;
        }

        public Criteria andPayChannelNoGreaterThan(String value) {
            addCriterion("PAY_CHANNEL_NO >", value, "payChannelNo");
            return (Criteria) this;
        }

        public Criteria andPayChannelNoGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_CHANNEL_NO >=", value, "payChannelNo");
            return (Criteria) this;
        }

        public Criteria andPayChannelNoLessThan(String value) {
            addCriterion("PAY_CHANNEL_NO <", value, "payChannelNo");
            return (Criteria) this;
        }

        public Criteria andPayChannelNoLessThanOrEqualTo(String value) {
            addCriterion("PAY_CHANNEL_NO <=", value, "payChannelNo");
            return (Criteria) this;
        }

        public Criteria andPayChannelNoLike(String value) {
            addCriterion("PAY_CHANNEL_NO like", value, "payChannelNo");
            return (Criteria) this;
        }

        public Criteria andPayChannelNoNotLike(String value) {
            addCriterion("PAY_CHANNEL_NO not like", value, "payChannelNo");
            return (Criteria) this;
        }

        public Criteria andPayChannelNoIn(List<String> values) {
            addCriterion("PAY_CHANNEL_NO in", values, "payChannelNo");
            return (Criteria) this;
        }

        public Criteria andPayChannelNoNotIn(List<String> values) {
            addCriterion("PAY_CHANNEL_NO not in", values, "payChannelNo");
            return (Criteria) this;
        }

        public Criteria andPayChannelNoBetween(String value1, String value2) {
            addCriterion("PAY_CHANNEL_NO between", value1, value2, "payChannelNo");
            return (Criteria) this;
        }

        public Criteria andPayChannelNoNotBetween(String value1, String value2) {
            addCriterion("PAY_CHANNEL_NO not between", value1, value2, "payChannelNo");
            return (Criteria) this;
        }

        public Criteria andPayWayTypeIsNull() {
            addCriterion("PAY_WAY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPayWayTypeIsNotNull() {
            addCriterion("PAY_WAY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPayWayTypeEqualTo(String value) {
            addCriterion("PAY_WAY_TYPE =", value, "payWayType");
            return (Criteria) this;
        }

        public Criteria andPayWayTypeNotEqualTo(String value) {
            addCriterion("PAY_WAY_TYPE <>", value, "payWayType");
            return (Criteria) this;
        }

        public Criteria andPayWayTypeGreaterThan(String value) {
            addCriterion("PAY_WAY_TYPE >", value, "payWayType");
            return (Criteria) this;
        }

        public Criteria andPayWayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_WAY_TYPE >=", value, "payWayType");
            return (Criteria) this;
        }

        public Criteria andPayWayTypeLessThan(String value) {
            addCriterion("PAY_WAY_TYPE <", value, "payWayType");
            return (Criteria) this;
        }

        public Criteria andPayWayTypeLessThanOrEqualTo(String value) {
            addCriterion("PAY_WAY_TYPE <=", value, "payWayType");
            return (Criteria) this;
        }

        public Criteria andPayWayTypeLike(String value) {
            addCriterion("PAY_WAY_TYPE like", value, "payWayType");
            return (Criteria) this;
        }

        public Criteria andPayWayTypeNotLike(String value) {
            addCriterion("PAY_WAY_TYPE not like", value, "payWayType");
            return (Criteria) this;
        }

        public Criteria andPayWayTypeIn(List<String> values) {
            addCriterion("PAY_WAY_TYPE in", values, "payWayType");
            return (Criteria) this;
        }

        public Criteria andPayWayTypeNotIn(List<String> values) {
            addCriterion("PAY_WAY_TYPE not in", values, "payWayType");
            return (Criteria) this;
        }

        public Criteria andPayWayTypeBetween(String value1, String value2) {
            addCriterion("PAY_WAY_TYPE between", value1, value2, "payWayType");
            return (Criteria) this;
        }

        public Criteria andPayWayTypeNotBetween(String value1, String value2) {
            addCriterion("PAY_WAY_TYPE not between", value1, value2, "payWayType");
            return (Criteria) this;
        }

        public Criteria andPayTradeFlowNoIsNull() {
            addCriterion("PAY_TRADE_FLOW_NO is null");
            return (Criteria) this;
        }

        public Criteria andPayTradeFlowNoIsNotNull() {
            addCriterion("PAY_TRADE_FLOW_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPayTradeFlowNoEqualTo(String value) {
            addCriterion("PAY_TRADE_FLOW_NO =", value, "payTradeFlowNo");
            return (Criteria) this;
        }

        public Criteria andPayTradeFlowNoNotEqualTo(String value) {
            addCriterion("PAY_TRADE_FLOW_NO <>", value, "payTradeFlowNo");
            return (Criteria) this;
        }

        public Criteria andPayTradeFlowNoGreaterThan(String value) {
            addCriterion("PAY_TRADE_FLOW_NO >", value, "payTradeFlowNo");
            return (Criteria) this;
        }

        public Criteria andPayTradeFlowNoGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_TRADE_FLOW_NO >=", value, "payTradeFlowNo");
            return (Criteria) this;
        }

        public Criteria andPayTradeFlowNoLessThan(String value) {
            addCriterion("PAY_TRADE_FLOW_NO <", value, "payTradeFlowNo");
            return (Criteria) this;
        }

        public Criteria andPayTradeFlowNoLessThanOrEqualTo(String value) {
            addCriterion("PAY_TRADE_FLOW_NO <=", value, "payTradeFlowNo");
            return (Criteria) this;
        }

        public Criteria andPayTradeFlowNoLike(String value) {
            addCriterion("PAY_TRADE_FLOW_NO like", value, "payTradeFlowNo");
            return (Criteria) this;
        }

        public Criteria andPayTradeFlowNoNotLike(String value) {
            addCriterion("PAY_TRADE_FLOW_NO not like", value, "payTradeFlowNo");
            return (Criteria) this;
        }

        public Criteria andPayTradeFlowNoIn(List<String> values) {
            addCriterion("PAY_TRADE_FLOW_NO in", values, "payTradeFlowNo");
            return (Criteria) this;
        }

        public Criteria andPayTradeFlowNoNotIn(List<String> values) {
            addCriterion("PAY_TRADE_FLOW_NO not in", values, "payTradeFlowNo");
            return (Criteria) this;
        }

        public Criteria andPayTradeFlowNoBetween(String value1, String value2) {
            addCriterion("PAY_TRADE_FLOW_NO between", value1, value2, "payTradeFlowNo");
            return (Criteria) this;
        }

        public Criteria andPayTradeFlowNoNotBetween(String value1, String value2) {
            addCriterion("PAY_TRADE_FLOW_NO not between", value1, value2, "payTradeFlowNo");
            return (Criteria) this;
        }

        public Criteria andBankTradeFlowNoIsNull() {
            addCriterion("BANK_TRADE_FLOW_NO is null");
            return (Criteria) this;
        }

        public Criteria andBankTradeFlowNoIsNotNull() {
            addCriterion("BANK_TRADE_FLOW_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBankTradeFlowNoEqualTo(String value) {
            addCriterion("BANK_TRADE_FLOW_NO =", value, "bankTradeFlowNo");
            return (Criteria) this;
        }

        public Criteria andBankTradeFlowNoNotEqualTo(String value) {
            addCriterion("BANK_TRADE_FLOW_NO <>", value, "bankTradeFlowNo");
            return (Criteria) this;
        }

        public Criteria andBankTradeFlowNoGreaterThan(String value) {
            addCriterion("BANK_TRADE_FLOW_NO >", value, "bankTradeFlowNo");
            return (Criteria) this;
        }

        public Criteria andBankTradeFlowNoGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_TRADE_FLOW_NO >=", value, "bankTradeFlowNo");
            return (Criteria) this;
        }

        public Criteria andBankTradeFlowNoLessThan(String value) {
            addCriterion("BANK_TRADE_FLOW_NO <", value, "bankTradeFlowNo");
            return (Criteria) this;
        }

        public Criteria andBankTradeFlowNoLessThanOrEqualTo(String value) {
            addCriterion("BANK_TRADE_FLOW_NO <=", value, "bankTradeFlowNo");
            return (Criteria) this;
        }

        public Criteria andBankTradeFlowNoLike(String value) {
            addCriterion("BANK_TRADE_FLOW_NO like", value, "bankTradeFlowNo");
            return (Criteria) this;
        }

        public Criteria andBankTradeFlowNoNotLike(String value) {
            addCriterion("BANK_TRADE_FLOW_NO not like", value, "bankTradeFlowNo");
            return (Criteria) this;
        }

        public Criteria andBankTradeFlowNoIn(List<String> values) {
            addCriterion("BANK_TRADE_FLOW_NO in", values, "bankTradeFlowNo");
            return (Criteria) this;
        }

        public Criteria andBankTradeFlowNoNotIn(List<String> values) {
            addCriterion("BANK_TRADE_FLOW_NO not in", values, "bankTradeFlowNo");
            return (Criteria) this;
        }

        public Criteria andBankTradeFlowNoBetween(String value1, String value2) {
            addCriterion("BANK_TRADE_FLOW_NO between", value1, value2, "bankTradeFlowNo");
            return (Criteria) this;
        }

        public Criteria andBankTradeFlowNoNotBetween(String value1, String value2) {
            addCriterion("BANK_TRADE_FLOW_NO not between", value1, value2, "bankTradeFlowNo");
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

        public Criteria andPaySuccessTimeIsNull() {
            addCriterion("PAY_SUCCESS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeIsNotNull() {
            addCriterion("PAY_SUCCESS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeEqualTo(Date value) {
            addCriterion("PAY_SUCCESS_TIME =", value, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeNotEqualTo(Date value) {
            addCriterion("PAY_SUCCESS_TIME <>", value, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeGreaterThan(Date value) {
            addCriterion("PAY_SUCCESS_TIME >", value, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PAY_SUCCESS_TIME >=", value, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeLessThan(Date value) {
            addCriterion("PAY_SUCCESS_TIME <", value, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeLessThanOrEqualTo(Date value) {
            addCriterion("PAY_SUCCESS_TIME <=", value, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeIn(List<Date> values) {
            addCriterion("PAY_SUCCESS_TIME in", values, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeNotIn(List<Date> values) {
            addCriterion("PAY_SUCCESS_TIME not in", values, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeBetween(Date value1, Date value2) {
            addCriterion("PAY_SUCCESS_TIME between", value1, value2, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeNotBetween(Date value1, Date value2) {
            addCriterion("PAY_SUCCESS_TIME not between", value1, value2, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNull() {
            addCriterion("CANCEL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNotNull() {
            addCriterion("CANCEL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeEqualTo(Date value) {
            addCriterion("CANCEL_TIME =", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotEqualTo(Date value) {
            addCriterion("CANCEL_TIME <>", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThan(Date value) {
            addCriterion("CANCEL_TIME >", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CANCEL_TIME >=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThan(Date value) {
            addCriterion("CANCEL_TIME <", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThanOrEqualTo(Date value) {
            addCriterion("CANCEL_TIME <=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIn(List<Date> values) {
            addCriterion("CANCEL_TIME in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotIn(List<Date> values) {
            addCriterion("CANCEL_TIME not in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeBetween(Date value1, Date value2) {
            addCriterion("CANCEL_TIME between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotBetween(Date value1, Date value2) {
            addCriterion("CANCEL_TIME not between", value1, value2, "cancelTime");
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

        public Criteria andLastModifyTimeIsNull() {
            addCriterion("LAST_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIsNotNull() {
            addCriterion("LAST_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeEqualTo(Date value) {
            addCriterion("LAST_MODIFY_TIME =", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotEqualTo(Date value) {
            addCriterion("LAST_MODIFY_TIME <>", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThan(Date value) {
            addCriterion("LAST_MODIFY_TIME >", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFY_TIME >=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThan(Date value) {
            addCriterion("LAST_MODIFY_TIME <", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFY_TIME <=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIn(List<Date> values) {
            addCriterion("LAST_MODIFY_TIME in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotIn(List<Date> values) {
            addCriterion("LAST_MODIFY_TIME not in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFY_TIME between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFY_TIME not between", value1, value2, "lastModifyTime");
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

        public Criteria andSubMerchantNoIsNull() {
            addCriterion("SUB_MERCHANT_NO is null");
            return (Criteria) this;
        }

        public Criteria andSubMerchantNoIsNotNull() {
            addCriterion("SUB_MERCHANT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSubMerchantNoEqualTo(String value) {
            addCriterion("SUB_MERCHANT_NO =", value, "subMerchantNo");
            return (Criteria) this;
        }

        public Criteria andSubMerchantNoNotEqualTo(String value) {
            addCriterion("SUB_MERCHANT_NO <>", value, "subMerchantNo");
            return (Criteria) this;
        }

        public Criteria andSubMerchantNoGreaterThan(String value) {
            addCriterion("SUB_MERCHANT_NO >", value, "subMerchantNo");
            return (Criteria) this;
        }

        public Criteria andSubMerchantNoGreaterThanOrEqualTo(String value) {
            addCriterion("SUB_MERCHANT_NO >=", value, "subMerchantNo");
            return (Criteria) this;
        }

        public Criteria andSubMerchantNoLessThan(String value) {
            addCriterion("SUB_MERCHANT_NO <", value, "subMerchantNo");
            return (Criteria) this;
        }

        public Criteria andSubMerchantNoLessThanOrEqualTo(String value) {
            addCriterion("SUB_MERCHANT_NO <=", value, "subMerchantNo");
            return (Criteria) this;
        }

        public Criteria andSubMerchantNoLike(String value) {
            addCriterion("SUB_MERCHANT_NO like", value, "subMerchantNo");
            return (Criteria) this;
        }

        public Criteria andSubMerchantNoNotLike(String value) {
            addCriterion("SUB_MERCHANT_NO not like", value, "subMerchantNo");
            return (Criteria) this;
        }

        public Criteria andSubMerchantNoIn(List<String> values) {
            addCriterion("SUB_MERCHANT_NO in", values, "subMerchantNo");
            return (Criteria) this;
        }

        public Criteria andSubMerchantNoNotIn(List<String> values) {
            addCriterion("SUB_MERCHANT_NO not in", values, "subMerchantNo");
            return (Criteria) this;
        }

        public Criteria andSubMerchantNoBetween(String value1, String value2) {
            addCriterion("SUB_MERCHANT_NO between", value1, value2, "subMerchantNo");
            return (Criteria) this;
        }

        public Criteria andSubMerchantNoNotBetween(String value1, String value2) {
            addCriterion("SUB_MERCHANT_NO not between", value1, value2, "subMerchantNo");
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

        public Criteria andIpIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("IP =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("IP <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("IP >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("IP <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("IP like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("IP not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("IP in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("IP not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andSettledayIsNull() {
            addCriterion("SETTLEDAY is null");
            return (Criteria) this;
        }

        public Criteria andSettledayIsNotNull() {
            addCriterion("SETTLEDAY is not null");
            return (Criteria) this;
        }

        public Criteria andSettledayEqualTo(String value) {
            addCriterion("SETTLEDAY =", value, "settleday");
            return (Criteria) this;
        }

        public Criteria andSettledayNotEqualTo(String value) {
            addCriterion("SETTLEDAY <>", value, "settleday");
            return (Criteria) this;
        }

        public Criteria andSettledayGreaterThan(String value) {
            addCriterion("SETTLEDAY >", value, "settleday");
            return (Criteria) this;
        }

        public Criteria andSettledayGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLEDAY >=", value, "settleday");
            return (Criteria) this;
        }

        public Criteria andSettledayLessThan(String value) {
            addCriterion("SETTLEDAY <", value, "settleday");
            return (Criteria) this;
        }

        public Criteria andSettledayLessThanOrEqualTo(String value) {
            addCriterion("SETTLEDAY <=", value, "settleday");
            return (Criteria) this;
        }

        public Criteria andSettledayLike(String value) {
            addCriterion("SETTLEDAY like", value, "settleday");
            return (Criteria) this;
        }

        public Criteria andSettledayNotLike(String value) {
            addCriterion("SETTLEDAY not like", value, "settleday");
            return (Criteria) this;
        }

        public Criteria andSettledayIn(List<String> values) {
            addCriterion("SETTLEDAY in", values, "settleday");
            return (Criteria) this;
        }

        public Criteria andSettledayNotIn(List<String> values) {
            addCriterion("SETTLEDAY not in", values, "settleday");
            return (Criteria) this;
        }

        public Criteria andSettledayBetween(String value1, String value2) {
            addCriterion("SETTLEDAY between", value1, value2, "settleday");
            return (Criteria) this;
        }

        public Criteria andSettledayNotBetween(String value1, String value2) {
            addCriterion("SETTLEDAY not between", value1, value2, "settleday");
            return (Criteria) this;
        }

        public Criteria andSettleDayIsNull() {
            addCriterion("SETTLE_DAY is null");
            return (Criteria) this;
        }

        public Criteria andSettleDayIsNotNull() {
            addCriterion("SETTLE_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andSettleDayEqualTo(Date value) {
            addCriterion("SETTLE_DAY =", value, "settleDay");
            return (Criteria) this;
        }

        public Criteria andSettleDayNotEqualTo(Date value) {
            addCriterion("SETTLE_DAY <>", value, "settleDay");
            return (Criteria) this;
        }

        public Criteria andSettleDayGreaterThan(Date value) {
            addCriterion("SETTLE_DAY >", value, "settleDay");
            return (Criteria) this;
        }

        public Criteria andSettleDayGreaterThanOrEqualTo(Date value) {
            addCriterion("SETTLE_DAY >=", value, "settleDay");
            return (Criteria) this;
        }

        public Criteria andSettleDayLessThan(Date value) {
            addCriterion("SETTLE_DAY <", value, "settleDay");
            return (Criteria) this;
        }

        public Criteria andSettleDayLessThanOrEqualTo(Date value) {
            addCriterion("SETTLE_DAY <=", value, "settleDay");
            return (Criteria) this;
        }

        public Criteria andSettleDayIn(List<Date> values) {
            addCriterion("SETTLE_DAY in", values, "settleDay");
            return (Criteria) this;
        }

        public Criteria andSettleDayNotIn(List<Date> values) {
            addCriterion("SETTLE_DAY not in", values, "settleDay");
            return (Criteria) this;
        }

        public Criteria andSettleDayBetween(Date value1, Date value2) {
            addCriterion("SETTLE_DAY between", value1, value2, "settleDay");
            return (Criteria) this;
        }

        public Criteria andSettleDayNotBetween(Date value1, Date value2) {
            addCriterion("SETTLE_DAY not between", value1, value2, "settleDay");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNull() {
            addCriterion("CONFIRM_TIME is null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNotNull() {
            addCriterion("CONFIRM_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeEqualTo(Date value) {
            addCriterion("CONFIRM_TIME =", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotEqualTo(Date value) {
            addCriterion("CONFIRM_TIME <>", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThan(Date value) {
            addCriterion("CONFIRM_TIME >", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CONFIRM_TIME >=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThan(Date value) {
            addCriterion("CONFIRM_TIME <", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThanOrEqualTo(Date value) {
            addCriterion("CONFIRM_TIME <=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIn(List<Date> values) {
            addCriterion("CONFIRM_TIME in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotIn(List<Date> values) {
            addCriterion("CONFIRM_TIME not in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeBetween(Date value1, Date value2) {
            addCriterion("CONFIRM_TIME between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotBetween(Date value1, Date value2) {
            addCriterion("CONFIRM_TIME not between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andPendingStatusIsNull() {
            addCriterion("PENDING_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andPendingStatusIsNotNull() {
            addCriterion("PENDING_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPendingStatusEqualTo(String value) {
            addCriterion("PENDING_STATUS =", value, "pendingStatus");
            return (Criteria) this;
        }

        public Criteria andPendingStatusNotEqualTo(String value) {
            addCriterion("PENDING_STATUS <>", value, "pendingStatus");
            return (Criteria) this;
        }

        public Criteria andPendingStatusGreaterThan(String value) {
            addCriterion("PENDING_STATUS >", value, "pendingStatus");
            return (Criteria) this;
        }

        public Criteria andPendingStatusGreaterThanOrEqualTo(String value) {
            addCriterion("PENDING_STATUS >=", value, "pendingStatus");
            return (Criteria) this;
        }

        public Criteria andPendingStatusLessThan(String value) {
            addCriterion("PENDING_STATUS <", value, "pendingStatus");
            return (Criteria) this;
        }

        public Criteria andPendingStatusLessThanOrEqualTo(String value) {
            addCriterion("PENDING_STATUS <=", value, "pendingStatus");
            return (Criteria) this;
        }

        public Criteria andPendingStatusLike(String value) {
            addCriterion("PENDING_STATUS like", value, "pendingStatus");
            return (Criteria) this;
        }

        public Criteria andPendingStatusNotLike(String value) {
            addCriterion("PENDING_STATUS not like", value, "pendingStatus");
            return (Criteria) this;
        }

        public Criteria andPendingStatusIn(List<String> values) {
            addCriterion("PENDING_STATUS in", values, "pendingStatus");
            return (Criteria) this;
        }

        public Criteria andPendingStatusNotIn(List<String> values) {
            addCriterion("PENDING_STATUS not in", values, "pendingStatus");
            return (Criteria) this;
        }

        public Criteria andPendingStatusBetween(String value1, String value2) {
            addCriterion("PENDING_STATUS between", value1, value2, "pendingStatus");
            return (Criteria) this;
        }

        public Criteria andPendingStatusNotBetween(String value1, String value2) {
            addCriterion("PENDING_STATUS not between", value1, value2, "pendingStatus");
            return (Criteria) this;
        }

        public Criteria andTranslatedErrorCodeIsNull() {
            addCriterion("TRANSLATED_ERROR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTranslatedErrorCodeIsNotNull() {
            addCriterion("TRANSLATED_ERROR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTranslatedErrorCodeEqualTo(String value) {
            addCriterion("TRANSLATED_ERROR_CODE =", value, "translatedErrorCode");
            return (Criteria) this;
        }

        public Criteria andTranslatedErrorCodeNotEqualTo(String value) {
            addCriterion("TRANSLATED_ERROR_CODE <>", value, "translatedErrorCode");
            return (Criteria) this;
        }

        public Criteria andTranslatedErrorCodeGreaterThan(String value) {
            addCriterion("TRANSLATED_ERROR_CODE >", value, "translatedErrorCode");
            return (Criteria) this;
        }

        public Criteria andTranslatedErrorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSLATED_ERROR_CODE >=", value, "translatedErrorCode");
            return (Criteria) this;
        }

        public Criteria andTranslatedErrorCodeLessThan(String value) {
            addCriterion("TRANSLATED_ERROR_CODE <", value, "translatedErrorCode");
            return (Criteria) this;
        }

        public Criteria andTranslatedErrorCodeLessThanOrEqualTo(String value) {
            addCriterion("TRANSLATED_ERROR_CODE <=", value, "translatedErrorCode");
            return (Criteria) this;
        }

        public Criteria andTranslatedErrorCodeLike(String value) {
            addCriterion("TRANSLATED_ERROR_CODE like", value, "translatedErrorCode");
            return (Criteria) this;
        }

        public Criteria andTranslatedErrorCodeNotLike(String value) {
            addCriterion("TRANSLATED_ERROR_CODE not like", value, "translatedErrorCode");
            return (Criteria) this;
        }

        public Criteria andTranslatedErrorCodeIn(List<String> values) {
            addCriterion("TRANSLATED_ERROR_CODE in", values, "translatedErrorCode");
            return (Criteria) this;
        }

        public Criteria andTranslatedErrorCodeNotIn(List<String> values) {
            addCriterion("TRANSLATED_ERROR_CODE not in", values, "translatedErrorCode");
            return (Criteria) this;
        }

        public Criteria andTranslatedErrorCodeBetween(String value1, String value2) {
            addCriterion("TRANSLATED_ERROR_CODE between", value1, value2, "translatedErrorCode");
            return (Criteria) this;
        }

        public Criteria andTranslatedErrorCodeNotBetween(String value1, String value2) {
            addCriterion("TRANSLATED_ERROR_CODE not between", value1, value2, "translatedErrorCode");
            return (Criteria) this;
        }

        public Criteria andTranslatedErrorMessageIsNull() {
            addCriterion("TRANSLATED_ERROR_MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andTranslatedErrorMessageIsNotNull() {
            addCriterion("TRANSLATED_ERROR_MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andTranslatedErrorMessageEqualTo(String value) {
            addCriterion("TRANSLATED_ERROR_MESSAGE =", value, "translatedErrorMessage");
            return (Criteria) this;
        }

        public Criteria andTranslatedErrorMessageNotEqualTo(String value) {
            addCriterion("TRANSLATED_ERROR_MESSAGE <>", value, "translatedErrorMessage");
            return (Criteria) this;
        }

        public Criteria andTranslatedErrorMessageGreaterThan(String value) {
            addCriterion("TRANSLATED_ERROR_MESSAGE >", value, "translatedErrorMessage");
            return (Criteria) this;
        }

        public Criteria andTranslatedErrorMessageGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSLATED_ERROR_MESSAGE >=", value, "translatedErrorMessage");
            return (Criteria) this;
        }

        public Criteria andTranslatedErrorMessageLessThan(String value) {
            addCriterion("TRANSLATED_ERROR_MESSAGE <", value, "translatedErrorMessage");
            return (Criteria) this;
        }

        public Criteria andTranslatedErrorMessageLessThanOrEqualTo(String value) {
            addCriterion("TRANSLATED_ERROR_MESSAGE <=", value, "translatedErrorMessage");
            return (Criteria) this;
        }

        public Criteria andTranslatedErrorMessageLike(String value) {
            addCriterion("TRANSLATED_ERROR_MESSAGE like", value, "translatedErrorMessage");
            return (Criteria) this;
        }

        public Criteria andTranslatedErrorMessageNotLike(String value) {
            addCriterion("TRANSLATED_ERROR_MESSAGE not like", value, "translatedErrorMessage");
            return (Criteria) this;
        }

        public Criteria andTranslatedErrorMessageIn(List<String> values) {
            addCriterion("TRANSLATED_ERROR_MESSAGE in", values, "translatedErrorMessage");
            return (Criteria) this;
        }

        public Criteria andTranslatedErrorMessageNotIn(List<String> values) {
            addCriterion("TRANSLATED_ERROR_MESSAGE not in", values, "translatedErrorMessage");
            return (Criteria) this;
        }

        public Criteria andTranslatedErrorMessageBetween(String value1, String value2) {
            addCriterion("TRANSLATED_ERROR_MESSAGE between", value1, value2, "translatedErrorMessage");
            return (Criteria) this;
        }

        public Criteria andTranslatedErrorMessageNotBetween(String value1, String value2) {
            addCriterion("TRANSLATED_ERROR_MESSAGE not between", value1, value2, "translatedErrorMessage");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNull() {
            addCriterion("CHECK_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNotNull() {
            addCriterion("CHECK_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusEqualTo(String value) {
            addCriterion("CHECK_STATUS =", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotEqualTo(String value) {
            addCriterion("CHECK_STATUS <>", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThan(String value) {
            addCriterion("CHECK_STATUS >", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_STATUS >=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThan(String value) {
            addCriterion("CHECK_STATUS <", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThanOrEqualTo(String value) {
            addCriterion("CHECK_STATUS <=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLike(String value) {
            addCriterion("CHECK_STATUS like", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotLike(String value) {
            addCriterion("CHECK_STATUS not like", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIn(List<String> values) {
            addCriterion("CHECK_STATUS in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotIn(List<String> values) {
            addCriterion("CHECK_STATUS not in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusBetween(String value1, String value2) {
            addCriterion("CHECK_STATUS between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotBetween(String value1, String value2) {
            addCriterion("CHECK_STATUS not between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNull() {
            addCriterion("CHECK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNotNull() {
            addCriterion("CHECK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEqualTo(Date value) {
            addCriterion("CHECK_TIME =", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotEqualTo(Date value) {
            addCriterion("CHECK_TIME <>", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThan(Date value) {
            addCriterion("CHECK_TIME >", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CHECK_TIME >=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThan(Date value) {
            addCriterion("CHECK_TIME <", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("CHECK_TIME <=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIn(List<Date> values) {
            addCriterion("CHECK_TIME in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotIn(List<Date> values) {
            addCriterion("CHECK_TIME not in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeBetween(Date value1, Date value2) {
            addCriterion("CHECK_TIME between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("CHECK_TIME not between", value1, value2, "checkTime");
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

        public Criteria andCallTypeIsNull() {
            addCriterion("CALL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCallTypeIsNotNull() {
            addCriterion("CALL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCallTypeEqualTo(String value) {
            addCriterion("CALL_TYPE =", value, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeNotEqualTo(String value) {
            addCriterion("CALL_TYPE <>", value, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeGreaterThan(String value) {
            addCriterion("CALL_TYPE >", value, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CALL_TYPE >=", value, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeLessThan(String value) {
            addCriterion("CALL_TYPE <", value, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeLessThanOrEqualTo(String value) {
            addCriterion("CALL_TYPE <=", value, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeLike(String value) {
            addCriterion("CALL_TYPE like", value, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeNotLike(String value) {
            addCriterion("CALL_TYPE not like", value, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeIn(List<String> values) {
            addCriterion("CALL_TYPE in", values, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeNotIn(List<String> values) {
            addCriterion("CALL_TYPE not in", values, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeBetween(String value1, String value2) {
            addCriterion("CALL_TYPE between", value1, value2, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeNotBetween(String value1, String value2) {
            addCriterion("CALL_TYPE not between", value1, value2, "callType");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Long value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Long value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Long value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Long value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Long value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Long> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Long> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Long value1, Long value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Long value1, Long value2) {
            addCriterion("VERSION not between", value1, value2, "version");
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
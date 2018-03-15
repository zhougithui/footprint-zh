package com.lanmao.data.sync.dao.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaymentOrderEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaymentOrderEntityExample() {
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

        public Criteria andOrderAmountEqualTo(BigDecimal value) {
            addCriterion("ORDER_AMOUNT =", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("ORDER_AMOUNT <>", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("ORDER_AMOUNT >", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_AMOUNT >=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThan(BigDecimal value) {
            addCriterion("ORDER_AMOUNT <", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_AMOUNT <=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIn(List<BigDecimal> values) {
            addCriterion("ORDER_AMOUNT in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("ORDER_AMOUNT not in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_AMOUNT between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_AMOUNT not between", value1, value2, "orderAmount");
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

        public Criteria andReceiverNoIsNull() {
            addCriterion("RECEIVER_NO is null");
            return (Criteria) this;
        }

        public Criteria andReceiverNoIsNotNull() {
            addCriterion("RECEIVER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverNoEqualTo(String value) {
            addCriterion("RECEIVER_NO =", value, "receiverNo");
            return (Criteria) this;
        }

        public Criteria andReceiverNoNotEqualTo(String value) {
            addCriterion("RECEIVER_NO <>", value, "receiverNo");
            return (Criteria) this;
        }

        public Criteria andReceiverNoGreaterThan(String value) {
            addCriterion("RECEIVER_NO >", value, "receiverNo");
            return (Criteria) this;
        }

        public Criteria andReceiverNoGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVER_NO >=", value, "receiverNo");
            return (Criteria) this;
        }

        public Criteria andReceiverNoLessThan(String value) {
            addCriterion("RECEIVER_NO <", value, "receiverNo");
            return (Criteria) this;
        }

        public Criteria andReceiverNoLessThanOrEqualTo(String value) {
            addCriterion("RECEIVER_NO <=", value, "receiverNo");
            return (Criteria) this;
        }

        public Criteria andReceiverNoLike(String value) {
            addCriterion("RECEIVER_NO like", value, "receiverNo");
            return (Criteria) this;
        }

        public Criteria andReceiverNoNotLike(String value) {
            addCriterion("RECEIVER_NO not like", value, "receiverNo");
            return (Criteria) this;
        }

        public Criteria andReceiverNoIn(List<String> values) {
            addCriterion("RECEIVER_NO in", values, "receiverNo");
            return (Criteria) this;
        }

        public Criteria andReceiverNoNotIn(List<String> values) {
            addCriterion("RECEIVER_NO not in", values, "receiverNo");
            return (Criteria) this;
        }

        public Criteria andReceiverNoBetween(String value1, String value2) {
            addCriterion("RECEIVER_NO between", value1, value2, "receiverNo");
            return (Criteria) this;
        }

        public Criteria andReceiverNoNotBetween(String value1, String value2) {
            addCriterion("RECEIVER_NO not between", value1, value2, "receiverNo");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIsNull() {
            addCriterion("COMMODITY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIsNotNull() {
            addCriterion("COMMODITY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityNameEqualTo(String value) {
            addCriterion("COMMODITY_NAME =", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotEqualTo(String value) {
            addCriterion("COMMODITY_NAME <>", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameGreaterThan(String value) {
            addCriterion("COMMODITY_NAME >", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameGreaterThanOrEqualTo(String value) {
            addCriterion("COMMODITY_NAME >=", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLessThan(String value) {
            addCriterion("COMMODITY_NAME <", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLessThanOrEqualTo(String value) {
            addCriterion("COMMODITY_NAME <=", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLike(String value) {
            addCriterion("COMMODITY_NAME like", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotLike(String value) {
            addCriterion("COMMODITY_NAME not like", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIn(List<String> values) {
            addCriterion("COMMODITY_NAME in", values, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotIn(List<String> values) {
            addCriterion("COMMODITY_NAME not in", values, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameBetween(String value1, String value2) {
            addCriterion("COMMODITY_NAME between", value1, value2, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotBetween(String value1, String value2) {
            addCriterion("COMMODITY_NAME not between", value1, value2, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityDescIsNull() {
            addCriterion("COMMODITY_DESC is null");
            return (Criteria) this;
        }

        public Criteria andCommodityDescIsNotNull() {
            addCriterion("COMMODITY_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityDescEqualTo(String value) {
            addCriterion("COMMODITY_DESC =", value, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescNotEqualTo(String value) {
            addCriterion("COMMODITY_DESC <>", value, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescGreaterThan(String value) {
            addCriterion("COMMODITY_DESC >", value, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescGreaterThanOrEqualTo(String value) {
            addCriterion("COMMODITY_DESC >=", value, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescLessThan(String value) {
            addCriterion("COMMODITY_DESC <", value, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescLessThanOrEqualTo(String value) {
            addCriterion("COMMODITY_DESC <=", value, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescLike(String value) {
            addCriterion("COMMODITY_DESC like", value, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescNotLike(String value) {
            addCriterion("COMMODITY_DESC not like", value, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescIn(List<String> values) {
            addCriterion("COMMODITY_DESC in", values, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescNotIn(List<String> values) {
            addCriterion("COMMODITY_DESC not in", values, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescBetween(String value1, String value2) {
            addCriterion("COMMODITY_DESC between", value1, value2, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescNotBetween(String value1, String value2) {
            addCriterion("COMMODITY_DESC not between", value1, value2, "commodityDesc");
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

        public Criteria andTradeTypeIsNull() {
            addCriterion("TRADE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNotNull() {
            addCriterion("TRADE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeEqualTo(String value) {
            addCriterion("TRADE_TYPE =", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotEqualTo(String value) {
            addCriterion("TRADE_TYPE <>", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThan(String value) {
            addCriterion("TRADE_TYPE >", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_TYPE >=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThan(String value) {
            addCriterion("TRADE_TYPE <", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThanOrEqualTo(String value) {
            addCriterion("TRADE_TYPE <=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLike(String value) {
            addCriterion("TRADE_TYPE like", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotLike(String value) {
            addCriterion("TRADE_TYPE not like", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIn(List<String> values) {
            addCriterion("TRADE_TYPE in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotIn(List<String> values) {
            addCriterion("TRADE_TYPE not in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeBetween(String value1, String value2) {
            addCriterion("TRADE_TYPE between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotBetween(String value1, String value2) {
            addCriterion("TRADE_TYPE not between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNull() {
            addCriterion("BAR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNotNull() {
            addCriterion("BAR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBarCodeEqualTo(String value) {
            addCriterion("BAR_CODE =", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotEqualTo(String value) {
            addCriterion("BAR_CODE <>", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThan(String value) {
            addCriterion("BAR_CODE >", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BAR_CODE >=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThan(String value) {
            addCriterion("BAR_CODE <", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThanOrEqualTo(String value) {
            addCriterion("BAR_CODE <=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLike(String value) {
            addCriterion("BAR_CODE like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotLike(String value) {
            addCriterion("BAR_CODE not like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeIn(List<String> values) {
            addCriterion("BAR_CODE in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotIn(List<String> values) {
            addCriterion("BAR_CODE not in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeBetween(String value1, String value2) {
            addCriterion("BAR_CODE between", value1, value2, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotBetween(String value1, String value2) {
            addCriterion("BAR_CODE not between", value1, value2, "barCode");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNull() {
            addCriterion("EXPIRE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNotNull() {
            addCriterion("EXPIRE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeEqualTo(Date value) {
            addCriterion("EXPIRE_TIME =", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotEqualTo(Date value) {
            addCriterion("EXPIRE_TIME <>", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThan(Date value) {
            addCriterion("EXPIRE_TIME >", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EXPIRE_TIME >=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThan(Date value) {
            addCriterion("EXPIRE_TIME <", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThanOrEqualTo(Date value) {
            addCriterion("EXPIRE_TIME <=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIn(List<Date> values) {
            addCriterion("EXPIRE_TIME in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotIn(List<Date> values) {
            addCriterion("EXPIRE_TIME not in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeBetween(Date value1, Date value2) {
            addCriterion("EXPIRE_TIME between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotBetween(Date value1, Date value2) {
            addCriterion("EXPIRE_TIME not between", value1, value2, "expireTime");
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

        public Criteria andPayerNoIsNull() {
            addCriterion("PAYER_NO is null");
            return (Criteria) this;
        }

        public Criteria andPayerNoIsNotNull() {
            addCriterion("PAYER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPayerNoEqualTo(String value) {
            addCriterion("PAYER_NO =", value, "payerNo");
            return (Criteria) this;
        }

        public Criteria andPayerNoNotEqualTo(String value) {
            addCriterion("PAYER_NO <>", value, "payerNo");
            return (Criteria) this;
        }

        public Criteria andPayerNoGreaterThan(String value) {
            addCriterion("PAYER_NO >", value, "payerNo");
            return (Criteria) this;
        }

        public Criteria andPayerNoGreaterThanOrEqualTo(String value) {
            addCriterion("PAYER_NO >=", value, "payerNo");
            return (Criteria) this;
        }

        public Criteria andPayerNoLessThan(String value) {
            addCriterion("PAYER_NO <", value, "payerNo");
            return (Criteria) this;
        }

        public Criteria andPayerNoLessThanOrEqualTo(String value) {
            addCriterion("PAYER_NO <=", value, "payerNo");
            return (Criteria) this;
        }

        public Criteria andPayerNoLike(String value) {
            addCriterion("PAYER_NO like", value, "payerNo");
            return (Criteria) this;
        }

        public Criteria andPayerNoNotLike(String value) {
            addCriterion("PAYER_NO not like", value, "payerNo");
            return (Criteria) this;
        }

        public Criteria andPayerNoIn(List<String> values) {
            addCriterion("PAYER_NO in", values, "payerNo");
            return (Criteria) this;
        }

        public Criteria andPayerNoNotIn(List<String> values) {
            addCriterion("PAYER_NO not in", values, "payerNo");
            return (Criteria) this;
        }

        public Criteria andPayerNoBetween(String value1, String value2) {
            addCriterion("PAYER_NO between", value1, value2, "payerNo");
            return (Criteria) this;
        }

        public Criteria andPayerNoNotBetween(String value1, String value2) {
            addCriterion("PAYER_NO not between", value1, value2, "payerNo");
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

        public Criteria andExpectPayCompanyIsNull() {
            addCriterion("EXPECT_PAY_COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andExpectPayCompanyIsNotNull() {
            addCriterion("EXPECT_PAY_COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andExpectPayCompanyEqualTo(String value) {
            addCriterion("EXPECT_PAY_COMPANY =", value, "expectPayCompany");
            return (Criteria) this;
        }

        public Criteria andExpectPayCompanyNotEqualTo(String value) {
            addCriterion("EXPECT_PAY_COMPANY <>", value, "expectPayCompany");
            return (Criteria) this;
        }

        public Criteria andExpectPayCompanyGreaterThan(String value) {
            addCriterion("EXPECT_PAY_COMPANY >", value, "expectPayCompany");
            return (Criteria) this;
        }

        public Criteria andExpectPayCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("EXPECT_PAY_COMPANY >=", value, "expectPayCompany");
            return (Criteria) this;
        }

        public Criteria andExpectPayCompanyLessThan(String value) {
            addCriterion("EXPECT_PAY_COMPANY <", value, "expectPayCompany");
            return (Criteria) this;
        }

        public Criteria andExpectPayCompanyLessThanOrEqualTo(String value) {
            addCriterion("EXPECT_PAY_COMPANY <=", value, "expectPayCompany");
            return (Criteria) this;
        }

        public Criteria andExpectPayCompanyLike(String value) {
            addCriterion("EXPECT_PAY_COMPANY like", value, "expectPayCompany");
            return (Criteria) this;
        }

        public Criteria andExpectPayCompanyNotLike(String value) {
            addCriterion("EXPECT_PAY_COMPANY not like", value, "expectPayCompany");
            return (Criteria) this;
        }

        public Criteria andExpectPayCompanyIn(List<String> values) {
            addCriterion("EXPECT_PAY_COMPANY in", values, "expectPayCompany");
            return (Criteria) this;
        }

        public Criteria andExpectPayCompanyNotIn(List<String> values) {
            addCriterion("EXPECT_PAY_COMPANY not in", values, "expectPayCompany");
            return (Criteria) this;
        }

        public Criteria andExpectPayCompanyBetween(String value1, String value2) {
            addCriterion("EXPECT_PAY_COMPANY between", value1, value2, "expectPayCompany");
            return (Criteria) this;
        }

        public Criteria andExpectPayCompanyNotBetween(String value1, String value2) {
            addCriterion("EXPECT_PAY_COMPANY not between", value1, value2, "expectPayCompany");
            return (Criteria) this;
        }

        public Criteria andPayAccountBankIsNull() {
            addCriterion("PAY_ACCOUNT_BANK is null");
            return (Criteria) this;
        }

        public Criteria andPayAccountBankIsNotNull() {
            addCriterion("PAY_ACCOUNT_BANK is not null");
            return (Criteria) this;
        }

        public Criteria andPayAccountBankEqualTo(String value) {
            addCriterion("PAY_ACCOUNT_BANK =", value, "payAccountBank");
            return (Criteria) this;
        }

        public Criteria andPayAccountBankNotEqualTo(String value) {
            addCriterion("PAY_ACCOUNT_BANK <>", value, "payAccountBank");
            return (Criteria) this;
        }

        public Criteria andPayAccountBankGreaterThan(String value) {
            addCriterion("PAY_ACCOUNT_BANK >", value, "payAccountBank");
            return (Criteria) this;
        }

        public Criteria andPayAccountBankGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_ACCOUNT_BANK >=", value, "payAccountBank");
            return (Criteria) this;
        }

        public Criteria andPayAccountBankLessThan(String value) {
            addCriterion("PAY_ACCOUNT_BANK <", value, "payAccountBank");
            return (Criteria) this;
        }

        public Criteria andPayAccountBankLessThanOrEqualTo(String value) {
            addCriterion("PAY_ACCOUNT_BANK <=", value, "payAccountBank");
            return (Criteria) this;
        }

        public Criteria andPayAccountBankLike(String value) {
            addCriterion("PAY_ACCOUNT_BANK like", value, "payAccountBank");
            return (Criteria) this;
        }

        public Criteria andPayAccountBankNotLike(String value) {
            addCriterion("PAY_ACCOUNT_BANK not like", value, "payAccountBank");
            return (Criteria) this;
        }

        public Criteria andPayAccountBankIn(List<String> values) {
            addCriterion("PAY_ACCOUNT_BANK in", values, "payAccountBank");
            return (Criteria) this;
        }

        public Criteria andPayAccountBankNotIn(List<String> values) {
            addCriterion("PAY_ACCOUNT_BANK not in", values, "payAccountBank");
            return (Criteria) this;
        }

        public Criteria andPayAccountBankBetween(String value1, String value2) {
            addCriterion("PAY_ACCOUNT_BANK between", value1, value2, "payAccountBank");
            return (Criteria) this;
        }

        public Criteria andPayAccountBankNotBetween(String value1, String value2) {
            addCriterion("PAY_ACCOUNT_BANK not between", value1, value2, "payAccountBank");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("PAY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("PAY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(String value) {
            addCriterion("PAY_TYPE =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(String value) {
            addCriterion("PAY_TYPE <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(String value) {
            addCriterion("PAY_TYPE >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_TYPE >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(String value) {
            addCriterion("PAY_TYPE <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(String value) {
            addCriterion("PAY_TYPE <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLike(String value) {
            addCriterion("PAY_TYPE like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotLike(String value) {
            addCriterion("PAY_TYPE not like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<String> values) {
            addCriterion("PAY_TYPE in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<String> values) {
            addCriterion("PAY_TYPE not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(String value1, String value2) {
            addCriterion("PAY_TYPE between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(String value1, String value2) {
            addCriterion("PAY_TYPE not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeIsNull() {
            addCriterion("INTERFACE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeIsNotNull() {
            addCriterion("INTERFACE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeEqualTo(String value) {
            addCriterion("INTERFACE_TYPE =", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeNotEqualTo(String value) {
            addCriterion("INTERFACE_TYPE <>", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeGreaterThan(String value) {
            addCriterion("INTERFACE_TYPE >", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("INTERFACE_TYPE >=", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeLessThan(String value) {
            addCriterion("INTERFACE_TYPE <", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeLessThanOrEqualTo(String value) {
            addCriterion("INTERFACE_TYPE <=", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeLike(String value) {
            addCriterion("INTERFACE_TYPE like", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeNotLike(String value) {
            addCriterion("INTERFACE_TYPE not like", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeIn(List<String> values) {
            addCriterion("INTERFACE_TYPE in", values, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeNotIn(List<String> values) {
            addCriterion("INTERFACE_TYPE not in", values, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeBetween(String value1, String value2) {
            addCriterion("INTERFACE_TYPE between", value1, value2, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeNotBetween(String value1, String value2) {
            addCriterion("INTERFACE_TYPE not between", value1, value2, "interfaceType");
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

        public Criteria andRequestCompleteTimeIsNull() {
            addCriterion("REQUEST_COMPLETE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRequestCompleteTimeIsNotNull() {
            addCriterion("REQUEST_COMPLETE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRequestCompleteTimeEqualTo(Date value) {
            addCriterion("REQUEST_COMPLETE_TIME =", value, "requestCompleteTime");
            return (Criteria) this;
        }

        public Criteria andRequestCompleteTimeNotEqualTo(Date value) {
            addCriterion("REQUEST_COMPLETE_TIME <>", value, "requestCompleteTime");
            return (Criteria) this;
        }

        public Criteria andRequestCompleteTimeGreaterThan(Date value) {
            addCriterion("REQUEST_COMPLETE_TIME >", value, "requestCompleteTime");
            return (Criteria) this;
        }

        public Criteria andRequestCompleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REQUEST_COMPLETE_TIME >=", value, "requestCompleteTime");
            return (Criteria) this;
        }

        public Criteria andRequestCompleteTimeLessThan(Date value) {
            addCriterion("REQUEST_COMPLETE_TIME <", value, "requestCompleteTime");
            return (Criteria) this;
        }

        public Criteria andRequestCompleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("REQUEST_COMPLETE_TIME <=", value, "requestCompleteTime");
            return (Criteria) this;
        }

        public Criteria andRequestCompleteTimeIn(List<Date> values) {
            addCriterion("REQUEST_COMPLETE_TIME in", values, "requestCompleteTime");
            return (Criteria) this;
        }

        public Criteria andRequestCompleteTimeNotIn(List<Date> values) {
            addCriterion("REQUEST_COMPLETE_TIME not in", values, "requestCompleteTime");
            return (Criteria) this;
        }

        public Criteria andRequestCompleteTimeBetween(Date value1, Date value2) {
            addCriterion("REQUEST_COMPLETE_TIME between", value1, value2, "requestCompleteTime");
            return (Criteria) this;
        }

        public Criteria andRequestCompleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("REQUEST_COMPLETE_TIME not between", value1, value2, "requestCompleteTime");
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
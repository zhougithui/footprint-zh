package com.lanmao.data.sync.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuthOrderCountEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuthOrderCountEntityExample() {
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
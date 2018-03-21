package com.lanmao.data.sync.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaymentCompanyEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaymentCompanyEntityExample() {
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

        public Criteria andPayCompanyNameIsNull() {
            addCriterion("PAY_COMPANY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPayCompanyNameIsNotNull() {
            addCriterion("PAY_COMPANY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPayCompanyNameEqualTo(String value) {
            addCriterion("PAY_COMPANY_NAME =", value, "payCompanyName");
            return (Criteria) this;
        }

        public Criteria andPayCompanyNameNotEqualTo(String value) {
            addCriterion("PAY_COMPANY_NAME <>", value, "payCompanyName");
            return (Criteria) this;
        }

        public Criteria andPayCompanyNameGreaterThan(String value) {
            addCriterion("PAY_COMPANY_NAME >", value, "payCompanyName");
            return (Criteria) this;
        }

        public Criteria andPayCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_COMPANY_NAME >=", value, "payCompanyName");
            return (Criteria) this;
        }

        public Criteria andPayCompanyNameLessThan(String value) {
            addCriterion("PAY_COMPANY_NAME <", value, "payCompanyName");
            return (Criteria) this;
        }

        public Criteria andPayCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("PAY_COMPANY_NAME <=", value, "payCompanyName");
            return (Criteria) this;
        }

        public Criteria andPayCompanyNameLike(String value) {
            addCriterion("PAY_COMPANY_NAME like", value, "payCompanyName");
            return (Criteria) this;
        }

        public Criteria andPayCompanyNameNotLike(String value) {
            addCriterion("PAY_COMPANY_NAME not like", value, "payCompanyName");
            return (Criteria) this;
        }

        public Criteria andPayCompanyNameIn(List<String> values) {
            addCriterion("PAY_COMPANY_NAME in", values, "payCompanyName");
            return (Criteria) this;
        }

        public Criteria andPayCompanyNameNotIn(List<String> values) {
            addCriterion("PAY_COMPANY_NAME not in", values, "payCompanyName");
            return (Criteria) this;
        }

        public Criteria andPayCompanyNameBetween(String value1, String value2) {
            addCriterion("PAY_COMPANY_NAME between", value1, value2, "payCompanyName");
            return (Criteria) this;
        }

        public Criteria andPayCompanyNameNotBetween(String value1, String value2) {
            addCriterion("PAY_COMPANY_NAME not between", value1, value2, "payCompanyName");
            return (Criteria) this;
        }

        public Criteria andShortNameIsNull() {
            addCriterion("SHORT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andShortNameIsNotNull() {
            addCriterion("SHORT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andShortNameEqualTo(String value) {
            addCriterion("SHORT_NAME =", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotEqualTo(String value) {
            addCriterion("SHORT_NAME <>", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameGreaterThan(String value) {
            addCriterion("SHORT_NAME >", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("SHORT_NAME >=", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLessThan(String value) {
            addCriterion("SHORT_NAME <", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLessThanOrEqualTo(String value) {
            addCriterion("SHORT_NAME <=", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLike(String value) {
            addCriterion("SHORT_NAME like", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotLike(String value) {
            addCriterion("SHORT_NAME not like", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameIn(List<String> values) {
            addCriterion("SHORT_NAME in", values, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotIn(List<String> values) {
            addCriterion("SHORT_NAME not in", values, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameBetween(String value1, String value2) {
            addCriterion("SHORT_NAME between", value1, value2, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotBetween(String value1, String value2) {
            addCriterion("SHORT_NAME not between", value1, value2, "shortName");
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

        public Criteria andProfitTypeIsNull() {
            addCriterion("PROFIT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andProfitTypeIsNotNull() {
            addCriterion("PROFIT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProfitTypeEqualTo(String value) {
            addCriterion("PROFIT_TYPE =", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeNotEqualTo(String value) {
            addCriterion("PROFIT_TYPE <>", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeGreaterThan(String value) {
            addCriterion("PROFIT_TYPE >", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PROFIT_TYPE >=", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeLessThan(String value) {
            addCriterion("PROFIT_TYPE <", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeLessThanOrEqualTo(String value) {
            addCriterion("PROFIT_TYPE <=", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeLike(String value) {
            addCriterion("PROFIT_TYPE like", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeNotLike(String value) {
            addCriterion("PROFIT_TYPE not like", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeIn(List<String> values) {
            addCriterion("PROFIT_TYPE in", values, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeNotIn(List<String> values) {
            addCriterion("PROFIT_TYPE not in", values, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeBetween(String value1, String value2) {
            addCriterion("PROFIT_TYPE between", value1, value2, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeNotBetween(String value1, String value2) {
            addCriterion("PROFIT_TYPE not between", value1, value2, "profitType");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andSystemTypeIsNull() {
            addCriterion("SYSTEM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSystemTypeIsNotNull() {
            addCriterion("SYSTEM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSystemTypeEqualTo(String value) {
            addCriterion("SYSTEM_TYPE =", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeNotEqualTo(String value) {
            addCriterion("SYSTEM_TYPE <>", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeGreaterThan(String value) {
            addCriterion("SYSTEM_TYPE >", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SYSTEM_TYPE >=", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeLessThan(String value) {
            addCriterion("SYSTEM_TYPE <", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeLessThanOrEqualTo(String value) {
            addCriterion("SYSTEM_TYPE <=", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeLike(String value) {
            addCriterion("SYSTEM_TYPE like", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeNotLike(String value) {
            addCriterion("SYSTEM_TYPE not like", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeIn(List<String> values) {
            addCriterion("SYSTEM_TYPE in", values, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeNotIn(List<String> values) {
            addCriterion("SYSTEM_TYPE not in", values, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeBetween(String value1, String value2) {
            addCriterion("SYSTEM_TYPE between", value1, value2, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeNotBetween(String value1, String value2) {
            addCriterion("SYSTEM_TYPE not between", value1, value2, "systemType");
            return (Criteria) this;
        }

        public Criteria andWhiteListIsNull() {
            addCriterion("WHITE_LIST is null");
            return (Criteria) this;
        }

        public Criteria andWhiteListIsNotNull() {
            addCriterion("WHITE_LIST is not null");
            return (Criteria) this;
        }

        public Criteria andWhiteListEqualTo(String value) {
            addCriterion("WHITE_LIST =", value, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListNotEqualTo(String value) {
            addCriterion("WHITE_LIST <>", value, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListGreaterThan(String value) {
            addCriterion("WHITE_LIST >", value, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListGreaterThanOrEqualTo(String value) {
            addCriterion("WHITE_LIST >=", value, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListLessThan(String value) {
            addCriterion("WHITE_LIST <", value, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListLessThanOrEqualTo(String value) {
            addCriterion("WHITE_LIST <=", value, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListLike(String value) {
            addCriterion("WHITE_LIST like", value, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListNotLike(String value) {
            addCriterion("WHITE_LIST not like", value, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListIn(List<String> values) {
            addCriterion("WHITE_LIST in", values, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListNotIn(List<String> values) {
            addCriterion("WHITE_LIST not in", values, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListBetween(String value1, String value2) {
            addCriterion("WHITE_LIST between", value1, value2, "whiteList");
            return (Criteria) this;
        }

        public Criteria andWhiteListNotBetween(String value1, String value2) {
            addCriterion("WHITE_LIST not between", value1, value2, "whiteList");
            return (Criteria) this;
        }

        public Criteria andSupportSystemIsNull() {
            addCriterion("SUPPORT_SYSTEM is null");
            return (Criteria) this;
        }

        public Criteria andSupportSystemIsNotNull() {
            addCriterion("SUPPORT_SYSTEM is not null");
            return (Criteria) this;
        }

        public Criteria andSupportSystemEqualTo(String value) {
            addCriterion("SUPPORT_SYSTEM =", value, "supportSystem");
            return (Criteria) this;
        }

        public Criteria andSupportSystemNotEqualTo(String value) {
            addCriterion("SUPPORT_SYSTEM <>", value, "supportSystem");
            return (Criteria) this;
        }

        public Criteria andSupportSystemGreaterThan(String value) {
            addCriterion("SUPPORT_SYSTEM >", value, "supportSystem");
            return (Criteria) this;
        }

        public Criteria andSupportSystemGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPORT_SYSTEM >=", value, "supportSystem");
            return (Criteria) this;
        }

        public Criteria andSupportSystemLessThan(String value) {
            addCriterion("SUPPORT_SYSTEM <", value, "supportSystem");
            return (Criteria) this;
        }

        public Criteria andSupportSystemLessThanOrEqualTo(String value) {
            addCriterion("SUPPORT_SYSTEM <=", value, "supportSystem");
            return (Criteria) this;
        }

        public Criteria andSupportSystemLike(String value) {
            addCriterion("SUPPORT_SYSTEM like", value, "supportSystem");
            return (Criteria) this;
        }

        public Criteria andSupportSystemNotLike(String value) {
            addCriterion("SUPPORT_SYSTEM not like", value, "supportSystem");
            return (Criteria) this;
        }

        public Criteria andSupportSystemIn(List<String> values) {
            addCriterion("SUPPORT_SYSTEM in", values, "supportSystem");
            return (Criteria) this;
        }

        public Criteria andSupportSystemNotIn(List<String> values) {
            addCriterion("SUPPORT_SYSTEM not in", values, "supportSystem");
            return (Criteria) this;
        }

        public Criteria andSupportSystemBetween(String value1, String value2) {
            addCriterion("SUPPORT_SYSTEM between", value1, value2, "supportSystem");
            return (Criteria) this;
        }

        public Criteria andSupportSystemNotBetween(String value1, String value2) {
            addCriterion("SUPPORT_SYSTEM not between", value1, value2, "supportSystem");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("CONTACT is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("CONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("CONTACT =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("CONTACT <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("CONTACT >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("CONTACT <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("CONTACT <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("CONTACT like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("CONTACT not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("CONTACT in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("CONTACT not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("CONTACT between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("CONTACT not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andCheckFileIsNull() {
            addCriterion("CHECK_FILE is null");
            return (Criteria) this;
        }

        public Criteria andCheckFileIsNotNull() {
            addCriterion("CHECK_FILE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckFileEqualTo(String value) {
            addCriterion("CHECK_FILE =", value, "checkFile");
            return (Criteria) this;
        }

        public Criteria andCheckFileNotEqualTo(String value) {
            addCriterion("CHECK_FILE <>", value, "checkFile");
            return (Criteria) this;
        }

        public Criteria andCheckFileGreaterThan(String value) {
            addCriterion("CHECK_FILE >", value, "checkFile");
            return (Criteria) this;
        }

        public Criteria andCheckFileGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_FILE >=", value, "checkFile");
            return (Criteria) this;
        }

        public Criteria andCheckFileLessThan(String value) {
            addCriterion("CHECK_FILE <", value, "checkFile");
            return (Criteria) this;
        }

        public Criteria andCheckFileLessThanOrEqualTo(String value) {
            addCriterion("CHECK_FILE <=", value, "checkFile");
            return (Criteria) this;
        }

        public Criteria andCheckFileLike(String value) {
            addCriterion("CHECK_FILE like", value, "checkFile");
            return (Criteria) this;
        }

        public Criteria andCheckFileNotLike(String value) {
            addCriterion("CHECK_FILE not like", value, "checkFile");
            return (Criteria) this;
        }

        public Criteria andCheckFileIn(List<String> values) {
            addCriterion("CHECK_FILE in", values, "checkFile");
            return (Criteria) this;
        }

        public Criteria andCheckFileNotIn(List<String> values) {
            addCriterion("CHECK_FILE not in", values, "checkFile");
            return (Criteria) this;
        }

        public Criteria andCheckFileBetween(String value1, String value2) {
            addCriterion("CHECK_FILE between", value1, value2, "checkFile");
            return (Criteria) this;
        }

        public Criteria andCheckFileNotBetween(String value1, String value2) {
            addCriterion("CHECK_FILE not between", value1, value2, "checkFile");
            return (Criteria) this;
        }

        public Criteria andSmsRuleIsNull() {
            addCriterion("SMS_RULE is null");
            return (Criteria) this;
        }

        public Criteria andSmsRuleIsNotNull() {
            addCriterion("SMS_RULE is not null");
            return (Criteria) this;
        }

        public Criteria andSmsRuleEqualTo(String value) {
            addCriterion("SMS_RULE =", value, "smsRule");
            return (Criteria) this;
        }

        public Criteria andSmsRuleNotEqualTo(String value) {
            addCriterion("SMS_RULE <>", value, "smsRule");
            return (Criteria) this;
        }

        public Criteria andSmsRuleGreaterThan(String value) {
            addCriterion("SMS_RULE >", value, "smsRule");
            return (Criteria) this;
        }

        public Criteria andSmsRuleGreaterThanOrEqualTo(String value) {
            addCriterion("SMS_RULE >=", value, "smsRule");
            return (Criteria) this;
        }

        public Criteria andSmsRuleLessThan(String value) {
            addCriterion("SMS_RULE <", value, "smsRule");
            return (Criteria) this;
        }

        public Criteria andSmsRuleLessThanOrEqualTo(String value) {
            addCriterion("SMS_RULE <=", value, "smsRule");
            return (Criteria) this;
        }

        public Criteria andSmsRuleLike(String value) {
            addCriterion("SMS_RULE like", value, "smsRule");
            return (Criteria) this;
        }

        public Criteria andSmsRuleNotLike(String value) {
            addCriterion("SMS_RULE not like", value, "smsRule");
            return (Criteria) this;
        }

        public Criteria andSmsRuleIn(List<String> values) {
            addCriterion("SMS_RULE in", values, "smsRule");
            return (Criteria) this;
        }

        public Criteria andSmsRuleNotIn(List<String> values) {
            addCriterion("SMS_RULE not in", values, "smsRule");
            return (Criteria) this;
        }

        public Criteria andSmsRuleBetween(String value1, String value2) {
            addCriterion("SMS_RULE between", value1, value2, "smsRule");
            return (Criteria) this;
        }

        public Criteria andSmsRuleNotBetween(String value1, String value2) {
            addCriterion("SMS_RULE not between", value1, value2, "smsRule");
            return (Criteria) this;
        }

        public Criteria andSupportBankIsNull() {
            addCriterion("SUPPORT_BANK is null");
            return (Criteria) this;
        }

        public Criteria andSupportBankIsNotNull() {
            addCriterion("SUPPORT_BANK is not null");
            return (Criteria) this;
        }

        public Criteria andSupportBankEqualTo(String value) {
            addCriterion("SUPPORT_BANK =", value, "supportBank");
            return (Criteria) this;
        }

        public Criteria andSupportBankNotEqualTo(String value) {
            addCriterion("SUPPORT_BANK <>", value, "supportBank");
            return (Criteria) this;
        }

        public Criteria andSupportBankGreaterThan(String value) {
            addCriterion("SUPPORT_BANK >", value, "supportBank");
            return (Criteria) this;
        }

        public Criteria andSupportBankGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPORT_BANK >=", value, "supportBank");
            return (Criteria) this;
        }

        public Criteria andSupportBankLessThan(String value) {
            addCriterion("SUPPORT_BANK <", value, "supportBank");
            return (Criteria) this;
        }

        public Criteria andSupportBankLessThanOrEqualTo(String value) {
            addCriterion("SUPPORT_BANK <=", value, "supportBank");
            return (Criteria) this;
        }

        public Criteria andSupportBankLike(String value) {
            addCriterion("SUPPORT_BANK like", value, "supportBank");
            return (Criteria) this;
        }

        public Criteria andSupportBankNotLike(String value) {
            addCriterion("SUPPORT_BANK not like", value, "supportBank");
            return (Criteria) this;
        }

        public Criteria andSupportBankIn(List<String> values) {
            addCriterion("SUPPORT_BANK in", values, "supportBank");
            return (Criteria) this;
        }

        public Criteria andSupportBankNotIn(List<String> values) {
            addCriterion("SUPPORT_BANK not in", values, "supportBank");
            return (Criteria) this;
        }

        public Criteria andSupportBankBetween(String value1, String value2) {
            addCriterion("SUPPORT_BANK between", value1, value2, "supportBank");
            return (Criteria) this;
        }

        public Criteria andSupportBankNotBetween(String value1, String value2) {
            addCriterion("SUPPORT_BANK not between", value1, value2, "supportBank");
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
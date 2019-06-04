package com.lwt.springboot.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class outernetBundlingUserBeanExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table OUTERNET_BUNDLING_USER
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table OUTERNET_BUNDLING_USER
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table OUTERNET_BUNDLING_USER
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OUTERNET_BUNDLING_USER
     *
     * @mbggenerated
     */
    public outernetBundlingUserBeanExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OUTERNET_BUNDLING_USER
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OUTERNET_BUNDLING_USER
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OUTERNET_BUNDLING_USER
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OUTERNET_BUNDLING_USER
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OUTERNET_BUNDLING_USER
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OUTERNET_BUNDLING_USER
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OUTERNET_BUNDLING_USER
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OUTERNET_BUNDLING_USER
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OUTERNET_BUNDLING_USER
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OUTERNET_BUNDLING_USER
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table OUTERNET_BUNDLING_USER
     *
     * @mbggenerated
     */
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andBundlingIdIsNull() {
            addCriterion("BUNDLING_ID is null");
            return (Criteria) this;
        }

        public Criteria andBundlingIdIsNotNull() {
            addCriterion("BUNDLING_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBundlingIdEqualTo(String value) {
            addCriterion("BUNDLING_ID =", value, "bundlingId");
            return (Criteria) this;
        }

        public Criteria andBundlingIdNotEqualTo(String value) {
            addCriterion("BUNDLING_ID <>", value, "bundlingId");
            return (Criteria) this;
        }

        public Criteria andBundlingIdGreaterThan(String value) {
            addCriterion("BUNDLING_ID >", value, "bundlingId");
            return (Criteria) this;
        }

        public Criteria andBundlingIdGreaterThanOrEqualTo(String value) {
            addCriterion("BUNDLING_ID >=", value, "bundlingId");
            return (Criteria) this;
        }

        public Criteria andBundlingIdLessThan(String value) {
            addCriterion("BUNDLING_ID <", value, "bundlingId");
            return (Criteria) this;
        }

        public Criteria andBundlingIdLessThanOrEqualTo(String value) {
            addCriterion("BUNDLING_ID <=", value, "bundlingId");
            return (Criteria) this;
        }

        public Criteria andBundlingIdLike(String value) {
            addCriterion("BUNDLING_ID like", value, "bundlingId");
            return (Criteria) this;
        }

        public Criteria andBundlingIdNotLike(String value) {
            addCriterion("BUNDLING_ID not like", value, "bundlingId");
            return (Criteria) this;
        }

        public Criteria andBundlingIdIn(List<String> values) {
            addCriterion("BUNDLING_ID in", values, "bundlingId");
            return (Criteria) this;
        }

        public Criteria andBundlingIdNotIn(List<String> values) {
            addCriterion("BUNDLING_ID not in", values, "bundlingId");
            return (Criteria) this;
        }

        public Criteria andBundlingIdBetween(String value1, String value2) {
            addCriterion("BUNDLING_ID between", value1, value2, "bundlingId");
            return (Criteria) this;
        }

        public Criteria andBundlingIdNotBetween(String value1, String value2) {
            addCriterion("BUNDLING_ID not between", value1, value2, "bundlingId");
            return (Criteria) this;
        }

        public Criteria andLoginIdIsNull() {
            addCriterion("LOGIN_ID is null");
            return (Criteria) this;
        }

        public Criteria andLoginIdIsNotNull() {
            addCriterion("LOGIN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIdEqualTo(String value) {
            addCriterion("LOGIN_ID =", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotEqualTo(String value) {
            addCriterion("LOGIN_ID <>", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdGreaterThan(String value) {
            addCriterion("LOGIN_ID >", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_ID >=", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLessThan(String value) {
            addCriterion("LOGIN_ID <", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_ID <=", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLike(String value) {
            addCriterion("LOGIN_ID like", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotLike(String value) {
            addCriterion("LOGIN_ID not like", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdIn(List<String> values) {
            addCriterion("LOGIN_ID in", values, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotIn(List<String> values) {
            addCriterion("LOGIN_ID not in", values, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdBetween(String value1, String value2) {
            addCriterion("LOGIN_ID between", value1, value2, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotBetween(String value1, String value2) {
            addCriterion("LOGIN_ID not between", value1, value2, "loginId");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNull() {
            addCriterion("USER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNotNull() {
            addCriterion("USER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUserCodeEqualTo(String value) {
            addCriterion("USER_CODE =", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotEqualTo(String value) {
            addCriterion("USER_CODE <>", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThan(String value) {
            addCriterion("USER_CODE >", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_CODE >=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThan(String value) {
            addCriterion("USER_CODE <", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThanOrEqualTo(String value) {
            addCriterion("USER_CODE <=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLike(String value) {
            addCriterion("USER_CODE like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotLike(String value) {
            addCriterion("USER_CODE not like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeIn(List<String> values) {
            addCriterion("USER_CODE in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotIn(List<String> values) {
            addCriterion("USER_CODE not in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeBetween(String value1, String value2) {
            addCriterion("USER_CODE between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotBetween(String value1, String value2) {
            addCriterion("USER_CODE not between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNull() {
            addCriterion("IS_VALID is null");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNotNull() {
            addCriterion("IS_VALID is not null");
            return (Criteria) this;
        }

        public Criteria andIsValidEqualTo(Short value) {
            addCriterion("IS_VALID =", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotEqualTo(Short value) {
            addCriterion("IS_VALID <>", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThan(Short value) {
            addCriterion("IS_VALID >", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_VALID >=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThan(Short value) {
            addCriterion("IS_VALID <", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThanOrEqualTo(Short value) {
            addCriterion("IS_VALID <=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidIn(List<Short> values) {
            addCriterion("IS_VALID in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotIn(List<Short> values) {
            addCriterion("IS_VALID not in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidBetween(Short value1, Short value2) {
            addCriterion("IS_VALID between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotBetween(Short value1, Short value2) {
            addCriterion("IS_VALID not between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andIspNameIsNull() {
            addCriterion("ISP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andIspNameIsNotNull() {
            addCriterion("ISP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andIspNameEqualTo(String value) {
            addCriterion("ISP_NAME =", value, "ispName");
            return (Criteria) this;
        }

        public Criteria andIspNameNotEqualTo(String value) {
            addCriterion("ISP_NAME <>", value, "ispName");
            return (Criteria) this;
        }

        public Criteria andIspNameGreaterThan(String value) {
            addCriterion("ISP_NAME >", value, "ispName");
            return (Criteria) this;
        }

        public Criteria andIspNameGreaterThanOrEqualTo(String value) {
            addCriterion("ISP_NAME >=", value, "ispName");
            return (Criteria) this;
        }

        public Criteria andIspNameLessThan(String value) {
            addCriterion("ISP_NAME <", value, "ispName");
            return (Criteria) this;
        }

        public Criteria andIspNameLessThanOrEqualTo(String value) {
            addCriterion("ISP_NAME <=", value, "ispName");
            return (Criteria) this;
        }

        public Criteria andIspNameLike(String value) {
            addCriterion("ISP_NAME like", value, "ispName");
            return (Criteria) this;
        }

        public Criteria andIspNameNotLike(String value) {
            addCriterion("ISP_NAME not like", value, "ispName");
            return (Criteria) this;
        }

        public Criteria andIspNameIn(List<String> values) {
            addCriterion("ISP_NAME in", values, "ispName");
            return (Criteria) this;
        }

        public Criteria andIspNameNotIn(List<String> values) {
            addCriterion("ISP_NAME not in", values, "ispName");
            return (Criteria) this;
        }

        public Criteria andIspNameBetween(String value1, String value2) {
            addCriterion("ISP_NAME between", value1, value2, "ispName");
            return (Criteria) this;
        }

        public Criteria andIspNameNotBetween(String value1, String value2) {
            addCriterion("ISP_NAME not between", value1, value2, "ispName");
            return (Criteria) this;
        }

        public Criteria andIspCodeIsNull() {
            addCriterion("ISP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andIspCodeIsNotNull() {
            addCriterion("ISP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andIspCodeEqualTo(String value) {
            addCriterion("ISP_CODE =", value, "ispCode");
            return (Criteria) this;
        }

        public Criteria andIspCodeNotEqualTo(String value) {
            addCriterion("ISP_CODE <>", value, "ispCode");
            return (Criteria) this;
        }

        public Criteria andIspCodeGreaterThan(String value) {
            addCriterion("ISP_CODE >", value, "ispCode");
            return (Criteria) this;
        }

        public Criteria andIspCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ISP_CODE >=", value, "ispCode");
            return (Criteria) this;
        }

        public Criteria andIspCodeLessThan(String value) {
            addCriterion("ISP_CODE <", value, "ispCode");
            return (Criteria) this;
        }

        public Criteria andIspCodeLessThanOrEqualTo(String value) {
            addCriterion("ISP_CODE <=", value, "ispCode");
            return (Criteria) this;
        }

        public Criteria andIspCodeLike(String value) {
            addCriterion("ISP_CODE like", value, "ispCode");
            return (Criteria) this;
        }

        public Criteria andIspCodeNotLike(String value) {
            addCriterion("ISP_CODE not like", value, "ispCode");
            return (Criteria) this;
        }

        public Criteria andIspCodeIn(List<String> values) {
            addCriterion("ISP_CODE in", values, "ispCode");
            return (Criteria) this;
        }

        public Criteria andIspCodeNotIn(List<String> values) {
            addCriterion("ISP_CODE not in", values, "ispCode");
            return (Criteria) this;
        }

        public Criteria andIspCodeBetween(String value1, String value2) {
            addCriterion("ISP_CODE between", value1, value2, "ispCode");
            return (Criteria) this;
        }

        public Criteria andIspCodeNotBetween(String value1, String value2) {
            addCriterion("ISP_CODE not between", value1, value2, "ispCode");
            return (Criteria) this;
        }

        public Criteria andLocalUserIsNull() {
            addCriterion("LOCAL_USER is null");
            return (Criteria) this;
        }

        public Criteria andLocalUserIsNotNull() {
            addCriterion("LOCAL_USER is not null");
            return (Criteria) this;
        }

        public Criteria andLocalUserEqualTo(String value) {
            addCriterion("LOCAL_USER =", value, "localUser");
            return (Criteria) this;
        }

        public Criteria andLocalUserNotEqualTo(String value) {
            addCriterion("LOCAL_USER <>", value, "localUser");
            return (Criteria) this;
        }

        public Criteria andLocalUserGreaterThan(String value) {
            addCriterion("LOCAL_USER >", value, "localUser");
            return (Criteria) this;
        }

        public Criteria andLocalUserGreaterThanOrEqualTo(String value) {
            addCriterion("LOCAL_USER >=", value, "localUser");
            return (Criteria) this;
        }

        public Criteria andLocalUserLessThan(String value) {
            addCriterion("LOCAL_USER <", value, "localUser");
            return (Criteria) this;
        }

        public Criteria andLocalUserLessThanOrEqualTo(String value) {
            addCriterion("LOCAL_USER <=", value, "localUser");
            return (Criteria) this;
        }

        public Criteria andLocalUserLike(String value) {
            addCriterion("LOCAL_USER like", value, "localUser");
            return (Criteria) this;
        }

        public Criteria andLocalUserNotLike(String value) {
            addCriterion("LOCAL_USER not like", value, "localUser");
            return (Criteria) this;
        }

        public Criteria andLocalUserIn(List<String> values) {
            addCriterion("LOCAL_USER in", values, "localUser");
            return (Criteria) this;
        }

        public Criteria andLocalUserNotIn(List<String> values) {
            addCriterion("LOCAL_USER not in", values, "localUser");
            return (Criteria) this;
        }

        public Criteria andLocalUserBetween(String value1, String value2) {
            addCriterion("LOCAL_USER between", value1, value2, "localUser");
            return (Criteria) this;
        }

        public Criteria andLocalUserNotBetween(String value1, String value2) {
            addCriterion("LOCAL_USER not between", value1, value2, "localUser");
            return (Criteria) this;
        }

        public Criteria andBundlingUseridCodeIsNull() {
            addCriterion("BUNDLING_USERID_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBundlingUseridCodeIsNotNull() {
            addCriterion("BUNDLING_USERID_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBundlingUseridCodeEqualTo(String value) {
            addCriterion("BUNDLING_USERID_CODE =", value, "bundlingUseridCode");
            return (Criteria) this;
        }

        public Criteria andBundlingUseridCodeNotEqualTo(String value) {
            addCriterion("BUNDLING_USERID_CODE <>", value, "bundlingUseridCode");
            return (Criteria) this;
        }

        public Criteria andBundlingUseridCodeGreaterThan(String value) {
            addCriterion("BUNDLING_USERID_CODE >", value, "bundlingUseridCode");
            return (Criteria) this;
        }

        public Criteria andBundlingUseridCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BUNDLING_USERID_CODE >=", value, "bundlingUseridCode");
            return (Criteria) this;
        }

        public Criteria andBundlingUseridCodeLessThan(String value) {
            addCriterion("BUNDLING_USERID_CODE <", value, "bundlingUseridCode");
            return (Criteria) this;
        }

        public Criteria andBundlingUseridCodeLessThanOrEqualTo(String value) {
            addCriterion("BUNDLING_USERID_CODE <=", value, "bundlingUseridCode");
            return (Criteria) this;
        }

        public Criteria andBundlingUseridCodeLike(String value) {
            addCriterion("BUNDLING_USERID_CODE like", value, "bundlingUseridCode");
            return (Criteria) this;
        }

        public Criteria andBundlingUseridCodeNotLike(String value) {
            addCriterion("BUNDLING_USERID_CODE not like", value, "bundlingUseridCode");
            return (Criteria) this;
        }

        public Criteria andBundlingUseridCodeIn(List<String> values) {
            addCriterion("BUNDLING_USERID_CODE in", values, "bundlingUseridCode");
            return (Criteria) this;
        }

        public Criteria andBundlingUseridCodeNotIn(List<String> values) {
            addCriterion("BUNDLING_USERID_CODE not in", values, "bundlingUseridCode");
            return (Criteria) this;
        }

        public Criteria andBundlingUseridCodeBetween(String value1, String value2) {
            addCriterion("BUNDLING_USERID_CODE between", value1, value2, "bundlingUseridCode");
            return (Criteria) this;
        }

        public Criteria andBundlingUseridCodeNotBetween(String value1, String value2) {
            addCriterion("BUNDLING_USERID_CODE not between", value1, value2, "bundlingUseridCode");
            return (Criteria) this;
        }

        public Criteria andBundlingIsRealIsNull() {
            addCriterion("BUNDLING_IS_REAL is null");
            return (Criteria) this;
        }

        public Criteria andBundlingIsRealIsNotNull() {
            addCriterion("BUNDLING_IS_REAL is not null");
            return (Criteria) this;
        }

        public Criteria andBundlingIsRealEqualTo(String value) {
            addCriterion("BUNDLING_IS_REAL =", value, "bundlingIsReal");
            return (Criteria) this;
        }

        public Criteria andBundlingIsRealNotEqualTo(String value) {
            addCriterion("BUNDLING_IS_REAL <>", value, "bundlingIsReal");
            return (Criteria) this;
        }

        public Criteria andBundlingIsRealGreaterThan(String value) {
            addCriterion("BUNDLING_IS_REAL >", value, "bundlingIsReal");
            return (Criteria) this;
        }

        public Criteria andBundlingIsRealGreaterThanOrEqualTo(String value) {
            addCriterion("BUNDLING_IS_REAL >=", value, "bundlingIsReal");
            return (Criteria) this;
        }

        public Criteria andBundlingIsRealLessThan(String value) {
            addCriterion("BUNDLING_IS_REAL <", value, "bundlingIsReal");
            return (Criteria) this;
        }

        public Criteria andBundlingIsRealLessThanOrEqualTo(String value) {
            addCriterion("BUNDLING_IS_REAL <=", value, "bundlingIsReal");
            return (Criteria) this;
        }

        public Criteria andBundlingIsRealLike(String value) {
            addCriterion("BUNDLING_IS_REAL like", value, "bundlingIsReal");
            return (Criteria) this;
        }

        public Criteria andBundlingIsRealNotLike(String value) {
            addCriterion("BUNDLING_IS_REAL not like", value, "bundlingIsReal");
            return (Criteria) this;
        }

        public Criteria andBundlingIsRealIn(List<String> values) {
            addCriterion("BUNDLING_IS_REAL in", values, "bundlingIsReal");
            return (Criteria) this;
        }

        public Criteria andBundlingIsRealNotIn(List<String> values) {
            addCriterion("BUNDLING_IS_REAL not in", values, "bundlingIsReal");
            return (Criteria) this;
        }

        public Criteria andBundlingIsRealBetween(String value1, String value2) {
            addCriterion("BUNDLING_IS_REAL between", value1, value2, "bundlingIsReal");
            return (Criteria) this;
        }

        public Criteria andBundlingIsRealNotBetween(String value1, String value2) {
            addCriterion("BUNDLING_IS_REAL not between", value1, value2, "bundlingIsReal");
            return (Criteria) this;
        }

        public Criteria andBundlingUpdateTimeIsNull() {
            addCriterion("BUNDLING_UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBundlingUpdateTimeIsNotNull() {
            addCriterion("BUNDLING_UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBundlingUpdateTimeEqualTo(String value) {
            addCriterion("BUNDLING_UPDATE_TIME =", value, "bundlingUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBundlingUpdateTimeNotEqualTo(String value) {
            addCriterion("BUNDLING_UPDATE_TIME <>", value, "bundlingUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBundlingUpdateTimeGreaterThan(String value) {
            addCriterion("BUNDLING_UPDATE_TIME >", value, "bundlingUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBundlingUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("BUNDLING_UPDATE_TIME >=", value, "bundlingUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBundlingUpdateTimeLessThan(String value) {
            addCriterion("BUNDLING_UPDATE_TIME <", value, "bundlingUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBundlingUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("BUNDLING_UPDATE_TIME <=", value, "bundlingUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBundlingUpdateTimeLike(String value) {
            addCriterion("BUNDLING_UPDATE_TIME like", value, "bundlingUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBundlingUpdateTimeNotLike(String value) {
            addCriterion("BUNDLING_UPDATE_TIME not like", value, "bundlingUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBundlingUpdateTimeIn(List<String> values) {
            addCriterion("BUNDLING_UPDATE_TIME in", values, "bundlingUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBundlingUpdateTimeNotIn(List<String> values) {
            addCriterion("BUNDLING_UPDATE_TIME not in", values, "bundlingUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBundlingUpdateTimeBetween(String value1, String value2) {
            addCriterion("BUNDLING_UPDATE_TIME between", value1, value2, "bundlingUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBundlingUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("BUNDLING_UPDATE_TIME not between", value1, value2, "bundlingUpdateTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table OUTERNET_BUNDLING_USER
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table OUTERNET_BUNDLING_USER
     *
     * @mbggenerated
     */
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
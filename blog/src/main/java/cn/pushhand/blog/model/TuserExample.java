package cn.pushhand.blog.model;

import java.util.ArrayList;
import java.util.List;

public class TuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TuserExample() {
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

        public Criteria andVcUseridIsNull() {
            addCriterion("vc_userid is null");
            return (Criteria) this;
        }

        public Criteria andVcUseridIsNotNull() {
            addCriterion("vc_userid is not null");
            return (Criteria) this;
        }

        public Criteria andVcUseridEqualTo(String value) {
            addCriterion("vc_userid =", value, "vcUserid");
            return (Criteria) this;
        }

        public Criteria andVcUseridNotEqualTo(String value) {
            addCriterion("vc_userid <>", value, "vcUserid");
            return (Criteria) this;
        }

        public Criteria andVcUseridGreaterThan(String value) {
            addCriterion("vc_userid >", value, "vcUserid");
            return (Criteria) this;
        }

        public Criteria andVcUseridGreaterThanOrEqualTo(String value) {
            addCriterion("vc_userid >=", value, "vcUserid");
            return (Criteria) this;
        }

        public Criteria andVcUseridLessThan(String value) {
            addCriterion("vc_userid <", value, "vcUserid");
            return (Criteria) this;
        }

        public Criteria andVcUseridLessThanOrEqualTo(String value) {
            addCriterion("vc_userid <=", value, "vcUserid");
            return (Criteria) this;
        }

        public Criteria andVcUseridLike(String value) {
            addCriterion("vc_userid like", value, "vcUserid");
            return (Criteria) this;
        }

        public Criteria andVcUseridNotLike(String value) {
            addCriterion("vc_userid not like", value, "vcUserid");
            return (Criteria) this;
        }

        public Criteria andVcUseridIn(List<String> values) {
            addCriterion("vc_userid in", values, "vcUserid");
            return (Criteria) this;
        }

        public Criteria andVcUseridNotIn(List<String> values) {
            addCriterion("vc_userid not in", values, "vcUserid");
            return (Criteria) this;
        }

        public Criteria andVcUseridBetween(String value1, String value2) {
            addCriterion("vc_userid between", value1, value2, "vcUserid");
            return (Criteria) this;
        }

        public Criteria andVcUseridNotBetween(String value1, String value2) {
            addCriterion("vc_userid not between", value1, value2, "vcUserid");
            return (Criteria) this;
        }

        public Criteria andVcUsernameIsNull() {
            addCriterion("vc_username is null");
            return (Criteria) this;
        }

        public Criteria andVcUsernameIsNotNull() {
            addCriterion("vc_username is not null");
            return (Criteria) this;
        }

        public Criteria andVcUsernameEqualTo(String value) {
            addCriterion("vc_username =", value, "vcUsername");
            return (Criteria) this;
        }

        public Criteria andVcUsernameNotEqualTo(String value) {
            addCriterion("vc_username <>", value, "vcUsername");
            return (Criteria) this;
        }

        public Criteria andVcUsernameGreaterThan(String value) {
            addCriterion("vc_username >", value, "vcUsername");
            return (Criteria) this;
        }

        public Criteria andVcUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("vc_username >=", value, "vcUsername");
            return (Criteria) this;
        }

        public Criteria andVcUsernameLessThan(String value) {
            addCriterion("vc_username <", value, "vcUsername");
            return (Criteria) this;
        }

        public Criteria andVcUsernameLessThanOrEqualTo(String value) {
            addCriterion("vc_username <=", value, "vcUsername");
            return (Criteria) this;
        }

        public Criteria andVcUsernameLike(String value) {
            addCriterion("vc_username like", value, "vcUsername");
            return (Criteria) this;
        }

        public Criteria andVcUsernameNotLike(String value) {
            addCriterion("vc_username not like", value, "vcUsername");
            return (Criteria) this;
        }

        public Criteria andVcUsernameIn(List<String> values) {
            addCriterion("vc_username in", values, "vcUsername");
            return (Criteria) this;
        }

        public Criteria andVcUsernameNotIn(List<String> values) {
            addCriterion("vc_username not in", values, "vcUsername");
            return (Criteria) this;
        }

        public Criteria andVcUsernameBetween(String value1, String value2) {
            addCriterion("vc_username between", value1, value2, "vcUsername");
            return (Criteria) this;
        }

        public Criteria andVcUsernameNotBetween(String value1, String value2) {
            addCriterion("vc_username not between", value1, value2, "vcUsername");
            return (Criteria) this;
        }

        public Criteria andVcPasswordIsNull() {
            addCriterion("vc_password is null");
            return (Criteria) this;
        }

        public Criteria andVcPasswordIsNotNull() {
            addCriterion("vc_password is not null");
            return (Criteria) this;
        }

        public Criteria andVcPasswordEqualTo(String value) {
            addCriterion("vc_password =", value, "vcPassword");
            return (Criteria) this;
        }

        public Criteria andVcPasswordNotEqualTo(String value) {
            addCriterion("vc_password <>", value, "vcPassword");
            return (Criteria) this;
        }

        public Criteria andVcPasswordGreaterThan(String value) {
            addCriterion("vc_password >", value, "vcPassword");
            return (Criteria) this;
        }

        public Criteria andVcPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("vc_password >=", value, "vcPassword");
            return (Criteria) this;
        }

        public Criteria andVcPasswordLessThan(String value) {
            addCriterion("vc_password <", value, "vcPassword");
            return (Criteria) this;
        }

        public Criteria andVcPasswordLessThanOrEqualTo(String value) {
            addCriterion("vc_password <=", value, "vcPassword");
            return (Criteria) this;
        }

        public Criteria andVcPasswordLike(String value) {
            addCriterion("vc_password like", value, "vcPassword");
            return (Criteria) this;
        }

        public Criteria andVcPasswordNotLike(String value) {
            addCriterion("vc_password not like", value, "vcPassword");
            return (Criteria) this;
        }

        public Criteria andVcPasswordIn(List<String> values) {
            addCriterion("vc_password in", values, "vcPassword");
            return (Criteria) this;
        }

        public Criteria andVcPasswordNotIn(List<String> values) {
            addCriterion("vc_password not in", values, "vcPassword");
            return (Criteria) this;
        }

        public Criteria andVcPasswordBetween(String value1, String value2) {
            addCriterion("vc_password between", value1, value2, "vcPassword");
            return (Criteria) this;
        }

        public Criteria andVcPasswordNotBetween(String value1, String value2) {
            addCriterion("vc_password not between", value1, value2, "vcPassword");
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
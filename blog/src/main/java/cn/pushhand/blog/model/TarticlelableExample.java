package cn.pushhand.blog.model;

import java.util.ArrayList;
import java.util.List;

public class TarticlelableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TarticlelableExample() {
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

        public Criteria andVcArticleidIsNull() {
            addCriterion("vc_articleid is null");
            return (Criteria) this;
        }

        public Criteria andVcArticleidIsNotNull() {
            addCriterion("vc_articleid is not null");
            return (Criteria) this;
        }

        public Criteria andVcArticleidEqualTo(String value) {
            addCriterion("vc_articleid =", value, "vcArticleid");
            return (Criteria) this;
        }

        public Criteria andVcArticleidNotEqualTo(String value) {
            addCriterion("vc_articleid <>", value, "vcArticleid");
            return (Criteria) this;
        }

        public Criteria andVcArticleidGreaterThan(String value) {
            addCriterion("vc_articleid >", value, "vcArticleid");
            return (Criteria) this;
        }

        public Criteria andVcArticleidGreaterThanOrEqualTo(String value) {
            addCriterion("vc_articleid >=", value, "vcArticleid");
            return (Criteria) this;
        }

        public Criteria andVcArticleidLessThan(String value) {
            addCriterion("vc_articleid <", value, "vcArticleid");
            return (Criteria) this;
        }

        public Criteria andVcArticleidLessThanOrEqualTo(String value) {
            addCriterion("vc_articleid <=", value, "vcArticleid");
            return (Criteria) this;
        }

        public Criteria andVcArticleidLike(String value) {
            addCriterion("vc_articleid like", value, "vcArticleid");
            return (Criteria) this;
        }

        public Criteria andVcArticleidNotLike(String value) {
            addCriterion("vc_articleid not like", value, "vcArticleid");
            return (Criteria) this;
        }

        public Criteria andVcArticleidIn(List<String> values) {
            addCriterion("vc_articleid in", values, "vcArticleid");
            return (Criteria) this;
        }

        public Criteria andVcArticleidNotIn(List<String> values) {
            addCriterion("vc_articleid not in", values, "vcArticleid");
            return (Criteria) this;
        }

        public Criteria andVcArticleidBetween(String value1, String value2) {
            addCriterion("vc_articleid between", value1, value2, "vcArticleid");
            return (Criteria) this;
        }

        public Criteria andVcArticleidNotBetween(String value1, String value2) {
            addCriterion("vc_articleid not between", value1, value2, "vcArticleid");
            return (Criteria) this;
        }

        public Criteria andVcLableidIsNull() {
            addCriterion("vc_lableid is null");
            return (Criteria) this;
        }

        public Criteria andVcLableidIsNotNull() {
            addCriterion("vc_lableid is not null");
            return (Criteria) this;
        }

        public Criteria andVcLableidEqualTo(String value) {
            addCriterion("vc_lableid =", value, "vcLableid");
            return (Criteria) this;
        }

        public Criteria andVcLableidNotEqualTo(String value) {
            addCriterion("vc_lableid <>", value, "vcLableid");
            return (Criteria) this;
        }

        public Criteria andVcLableidGreaterThan(String value) {
            addCriterion("vc_lableid >", value, "vcLableid");
            return (Criteria) this;
        }

        public Criteria andVcLableidGreaterThanOrEqualTo(String value) {
            addCriterion("vc_lableid >=", value, "vcLableid");
            return (Criteria) this;
        }

        public Criteria andVcLableidLessThan(String value) {
            addCriterion("vc_lableid <", value, "vcLableid");
            return (Criteria) this;
        }

        public Criteria andVcLableidLessThanOrEqualTo(String value) {
            addCriterion("vc_lableid <=", value, "vcLableid");
            return (Criteria) this;
        }

        public Criteria andVcLableidLike(String value) {
            addCriterion("vc_lableid like", value, "vcLableid");
            return (Criteria) this;
        }

        public Criteria andVcLableidNotLike(String value) {
            addCriterion("vc_lableid not like", value, "vcLableid");
            return (Criteria) this;
        }

        public Criteria andVcLableidIn(List<String> values) {
            addCriterion("vc_lableid in", values, "vcLableid");
            return (Criteria) this;
        }

        public Criteria andVcLableidNotIn(List<String> values) {
            addCriterion("vc_lableid not in", values, "vcLableid");
            return (Criteria) this;
        }

        public Criteria andVcLableidBetween(String value1, String value2) {
            addCriterion("vc_lableid between", value1, value2, "vcLableid");
            return (Criteria) this;
        }

        public Criteria andVcLableidNotBetween(String value1, String value2) {
            addCriterion("vc_lableid not between", value1, value2, "vcLableid");
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
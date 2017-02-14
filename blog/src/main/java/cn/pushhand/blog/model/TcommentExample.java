package cn.pushhand.blog.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TcommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TcommentExample() {
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

        public Criteria andVcCommentidIsNull() {
            addCriterion("vc_commentid is null");
            return (Criteria) this;
        }

        public Criteria andVcCommentidIsNotNull() {
            addCriterion("vc_commentid is not null");
            return (Criteria) this;
        }

        public Criteria andVcCommentidEqualTo(String value) {
            addCriterion("vc_commentid =", value, "vcCommentid");
            return (Criteria) this;
        }

        public Criteria andVcCommentidNotEqualTo(String value) {
            addCriterion("vc_commentid <>", value, "vcCommentid");
            return (Criteria) this;
        }

        public Criteria andVcCommentidGreaterThan(String value) {
            addCriterion("vc_commentid >", value, "vcCommentid");
            return (Criteria) this;
        }

        public Criteria andVcCommentidGreaterThanOrEqualTo(String value) {
            addCriterion("vc_commentid >=", value, "vcCommentid");
            return (Criteria) this;
        }

        public Criteria andVcCommentidLessThan(String value) {
            addCriterion("vc_commentid <", value, "vcCommentid");
            return (Criteria) this;
        }

        public Criteria andVcCommentidLessThanOrEqualTo(String value) {
            addCriterion("vc_commentid <=", value, "vcCommentid");
            return (Criteria) this;
        }

        public Criteria andVcCommentidLike(String value) {
            addCriterion("vc_commentid like", value, "vcCommentid");
            return (Criteria) this;
        }

        public Criteria andVcCommentidNotLike(String value) {
            addCriterion("vc_commentid not like", value, "vcCommentid");
            return (Criteria) this;
        }

        public Criteria andVcCommentidIn(List<String> values) {
            addCriterion("vc_commentid in", values, "vcCommentid");
            return (Criteria) this;
        }

        public Criteria andVcCommentidNotIn(List<String> values) {
            addCriterion("vc_commentid not in", values, "vcCommentid");
            return (Criteria) this;
        }

        public Criteria andVcCommentidBetween(String value1, String value2) {
            addCriterion("vc_commentid between", value1, value2, "vcCommentid");
            return (Criteria) this;
        }

        public Criteria andVcCommentidNotBetween(String value1, String value2) {
            addCriterion("vc_commentid not between", value1, value2, "vcCommentid");
            return (Criteria) this;
        }

        public Criteria andVcCommentcontentIsNull() {
            addCriterion("vc_commentcontent is null");
            return (Criteria) this;
        }

        public Criteria andVcCommentcontentIsNotNull() {
            addCriterion("vc_commentcontent is not null");
            return (Criteria) this;
        }

        public Criteria andVcCommentcontentEqualTo(String value) {
            addCriterion("vc_commentcontent =", value, "vcCommentcontent");
            return (Criteria) this;
        }

        public Criteria andVcCommentcontentNotEqualTo(String value) {
            addCriterion("vc_commentcontent <>", value, "vcCommentcontent");
            return (Criteria) this;
        }

        public Criteria andVcCommentcontentGreaterThan(String value) {
            addCriterion("vc_commentcontent >", value, "vcCommentcontent");
            return (Criteria) this;
        }

        public Criteria andVcCommentcontentGreaterThanOrEqualTo(String value) {
            addCriterion("vc_commentcontent >=", value, "vcCommentcontent");
            return (Criteria) this;
        }

        public Criteria andVcCommentcontentLessThan(String value) {
            addCriterion("vc_commentcontent <", value, "vcCommentcontent");
            return (Criteria) this;
        }

        public Criteria andVcCommentcontentLessThanOrEqualTo(String value) {
            addCriterion("vc_commentcontent <=", value, "vcCommentcontent");
            return (Criteria) this;
        }

        public Criteria andVcCommentcontentLike(String value) {
            addCriterion("vc_commentcontent like", value, "vcCommentcontent");
            return (Criteria) this;
        }

        public Criteria andVcCommentcontentNotLike(String value) {
            addCriterion("vc_commentcontent not like", value, "vcCommentcontent");
            return (Criteria) this;
        }

        public Criteria andVcCommentcontentIn(List<String> values) {
            addCriterion("vc_commentcontent in", values, "vcCommentcontent");
            return (Criteria) this;
        }

        public Criteria andVcCommentcontentNotIn(List<String> values) {
            addCriterion("vc_commentcontent not in", values, "vcCommentcontent");
            return (Criteria) this;
        }

        public Criteria andVcCommentcontentBetween(String value1, String value2) {
            addCriterion("vc_commentcontent between", value1, value2, "vcCommentcontent");
            return (Criteria) this;
        }

        public Criteria andVcCommentcontentNotBetween(String value1, String value2) {
            addCriterion("vc_commentcontent not between", value1, value2, "vcCommentcontent");
            return (Criteria) this;
        }

        public Criteria andDtComenttimeIsNull() {
            addCriterion("dt_comenttime is null");
            return (Criteria) this;
        }

        public Criteria andDtComenttimeIsNotNull() {
            addCriterion("dt_comenttime is not null");
            return (Criteria) this;
        }

        public Criteria andDtComenttimeEqualTo(Date value) {
            addCriterion("dt_comenttime =", value, "dtComenttime");
            return (Criteria) this;
        }

        public Criteria andDtComenttimeNotEqualTo(Date value) {
            addCriterion("dt_comenttime <>", value, "dtComenttime");
            return (Criteria) this;
        }

        public Criteria andDtComenttimeGreaterThan(Date value) {
            addCriterion("dt_comenttime >", value, "dtComenttime");
            return (Criteria) this;
        }

        public Criteria andDtComenttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dt_comenttime >=", value, "dtComenttime");
            return (Criteria) this;
        }

        public Criteria andDtComenttimeLessThan(Date value) {
            addCriterion("dt_comenttime <", value, "dtComenttime");
            return (Criteria) this;
        }

        public Criteria andDtComenttimeLessThanOrEqualTo(Date value) {
            addCriterion("dt_comenttime <=", value, "dtComenttime");
            return (Criteria) this;
        }

        public Criteria andDtComenttimeIn(List<Date> values) {
            addCriterion("dt_comenttime in", values, "dtComenttime");
            return (Criteria) this;
        }

        public Criteria andDtComenttimeNotIn(List<Date> values) {
            addCriterion("dt_comenttime not in", values, "dtComenttime");
            return (Criteria) this;
        }

        public Criteria andDtComenttimeBetween(Date value1, Date value2) {
            addCriterion("dt_comenttime between", value1, value2, "dtComenttime");
            return (Criteria) this;
        }

        public Criteria andDtComenttimeNotBetween(Date value1, Date value2) {
            addCriterion("dt_comenttime not between", value1, value2, "dtComenttime");
            return (Criteria) this;
        }

        public Criteria andVcVisitorIsNull() {
            addCriterion("vc_visitor is null");
            return (Criteria) this;
        }

        public Criteria andVcVisitorIsNotNull() {
            addCriterion("vc_visitor is not null");
            return (Criteria) this;
        }

        public Criteria andVcVisitorEqualTo(String value) {
            addCriterion("vc_visitor =", value, "vcVisitor");
            return (Criteria) this;
        }

        public Criteria andVcVisitorNotEqualTo(String value) {
            addCriterion("vc_visitor <>", value, "vcVisitor");
            return (Criteria) this;
        }

        public Criteria andVcVisitorGreaterThan(String value) {
            addCriterion("vc_visitor >", value, "vcVisitor");
            return (Criteria) this;
        }

        public Criteria andVcVisitorGreaterThanOrEqualTo(String value) {
            addCriterion("vc_visitor >=", value, "vcVisitor");
            return (Criteria) this;
        }

        public Criteria andVcVisitorLessThan(String value) {
            addCriterion("vc_visitor <", value, "vcVisitor");
            return (Criteria) this;
        }

        public Criteria andVcVisitorLessThanOrEqualTo(String value) {
            addCriterion("vc_visitor <=", value, "vcVisitor");
            return (Criteria) this;
        }

        public Criteria andVcVisitorLike(String value) {
            addCriterion("vc_visitor like", value, "vcVisitor");
            return (Criteria) this;
        }

        public Criteria andVcVisitorNotLike(String value) {
            addCriterion("vc_visitor not like", value, "vcVisitor");
            return (Criteria) this;
        }

        public Criteria andVcVisitorIn(List<String> values) {
            addCriterion("vc_visitor in", values, "vcVisitor");
            return (Criteria) this;
        }

        public Criteria andVcVisitorNotIn(List<String> values) {
            addCriterion("vc_visitor not in", values, "vcVisitor");
            return (Criteria) this;
        }

        public Criteria andVcVisitorBetween(String value1, String value2) {
            addCriterion("vc_visitor between", value1, value2, "vcVisitor");
            return (Criteria) this;
        }

        public Criteria andVcVisitorNotBetween(String value1, String value2) {
            addCriterion("vc_visitor not between", value1, value2, "vcVisitor");
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
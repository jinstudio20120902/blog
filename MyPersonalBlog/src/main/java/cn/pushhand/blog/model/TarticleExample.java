package cn.pushhand.blog.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TarticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TarticleExample() {
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

        public Criteria andVcArticletitleIsNull() {
            addCriterion("vc_articletitle is null");
            return (Criteria) this;
        }

        public Criteria andVcArticletitleIsNotNull() {
            addCriterion("vc_articletitle is not null");
            return (Criteria) this;
        }

        public Criteria andVcArticletitleEqualTo(String value) {
            addCriterion("vc_articletitle =", value, "vcArticletitle");
            return (Criteria) this;
        }

        public Criteria andVcArticletitleNotEqualTo(String value) {
            addCriterion("vc_articletitle <>", value, "vcArticletitle");
            return (Criteria) this;
        }

        public Criteria andVcArticletitleGreaterThan(String value) {
            addCriterion("vc_articletitle >", value, "vcArticletitle");
            return (Criteria) this;
        }

        public Criteria andVcArticletitleGreaterThanOrEqualTo(String value) {
            addCriterion("vc_articletitle >=", value, "vcArticletitle");
            return (Criteria) this;
        }

        public Criteria andVcArticletitleLessThan(String value) {
            addCriterion("vc_articletitle <", value, "vcArticletitle");
            return (Criteria) this;
        }

        public Criteria andVcArticletitleLessThanOrEqualTo(String value) {
            addCriterion("vc_articletitle <=", value, "vcArticletitle");
            return (Criteria) this;
        }

        public Criteria andVcArticletitleLike(String value) {
            addCriterion("vc_articletitle like", value, "vcArticletitle");
            return (Criteria) this;
        }

        public Criteria andVcArticletitleNotLike(String value) {
            addCriterion("vc_articletitle not like", value, "vcArticletitle");
            return (Criteria) this;
        }

        public Criteria andVcArticletitleIn(List<String> values) {
            addCriterion("vc_articletitle in", values, "vcArticletitle");
            return (Criteria) this;
        }

        public Criteria andVcArticletitleNotIn(List<String> values) {
            addCriterion("vc_articletitle not in", values, "vcArticletitle");
            return (Criteria) this;
        }

        public Criteria andVcArticletitleBetween(String value1, String value2) {
            addCriterion("vc_articletitle between", value1, value2, "vcArticletitle");
            return (Criteria) this;
        }

        public Criteria andVcArticletitleNotBetween(String value1, String value2) {
            addCriterion("vc_articletitle not between", value1, value2, "vcArticletitle");
            return (Criteria) this;
        }

        public Criteria andVcArticlecontentIsNull() {
            addCriterion("vc_articlecontent is null");
            return (Criteria) this;
        }

        public Criteria andVcArticlecontentIsNotNull() {
            addCriterion("vc_articlecontent is not null");
            return (Criteria) this;
        }

        public Criteria andVcArticlecontentEqualTo(String value) {
            addCriterion("vc_articlecontent =", value, "vcArticlecontent");
            return (Criteria) this;
        }

        public Criteria andVcArticlecontentNotEqualTo(String value) {
            addCriterion("vc_articlecontent <>", value, "vcArticlecontent");
            return (Criteria) this;
        }

        public Criteria andVcArticlecontentGreaterThan(String value) {
            addCriterion("vc_articlecontent >", value, "vcArticlecontent");
            return (Criteria) this;
        }

        public Criteria andVcArticlecontentGreaterThanOrEqualTo(String value) {
            addCriterion("vc_articlecontent >=", value, "vcArticlecontent");
            return (Criteria) this;
        }

        public Criteria andVcArticlecontentLessThan(String value) {
            addCriterion("vc_articlecontent <", value, "vcArticlecontent");
            return (Criteria) this;
        }

        public Criteria andVcArticlecontentLessThanOrEqualTo(String value) {
            addCriterion("vc_articlecontent <=", value, "vcArticlecontent");
            return (Criteria) this;
        }

        public Criteria andVcArticlecontentLike(String value) {
            addCriterion("vc_articlecontent like", value, "vcArticlecontent");
            return (Criteria) this;
        }

        public Criteria andVcArticlecontentNotLike(String value) {
            addCriterion("vc_articlecontent not like", value, "vcArticlecontent");
            return (Criteria) this;
        }

        public Criteria andVcArticlecontentIn(List<String> values) {
            addCriterion("vc_articlecontent in", values, "vcArticlecontent");
            return (Criteria) this;
        }

        public Criteria andVcArticlecontentNotIn(List<String> values) {
            addCriterion("vc_articlecontent not in", values, "vcArticlecontent");
            return (Criteria) this;
        }

        public Criteria andVcArticlecontentBetween(String value1, String value2) {
            addCriterion("vc_articlecontent between", value1, value2, "vcArticlecontent");
            return (Criteria) this;
        }

        public Criteria andVcArticlecontentNotBetween(String value1, String value2) {
            addCriterion("vc_articlecontent not between", value1, value2, "vcArticlecontent");
            return (Criteria) this;
        }

        public Criteria andCArticletypeIsNull() {
            addCriterion("c_articletype is null");
            return (Criteria) this;
        }

        public Criteria andCArticletypeIsNotNull() {
            addCriterion("c_articletype is not null");
            return (Criteria) this;
        }

        public Criteria andCArticletypeEqualTo(String value) {
            addCriterion("c_articletype =", value, "cArticletype");
            return (Criteria) this;
        }

        public Criteria andCArticletypeNotEqualTo(String value) {
            addCriterion("c_articletype <>", value, "cArticletype");
            return (Criteria) this;
        }

        public Criteria andCArticletypeGreaterThan(String value) {
            addCriterion("c_articletype >", value, "cArticletype");
            return (Criteria) this;
        }

        public Criteria andCArticletypeGreaterThanOrEqualTo(String value) {
            addCriterion("c_articletype >=", value, "cArticletype");
            return (Criteria) this;
        }

        public Criteria andCArticletypeLessThan(String value) {
            addCriterion("c_articletype <", value, "cArticletype");
            return (Criteria) this;
        }

        public Criteria andCArticletypeLessThanOrEqualTo(String value) {
            addCriterion("c_articletype <=", value, "cArticletype");
            return (Criteria) this;
        }

        public Criteria andCArticletypeLike(String value) {
            addCriterion("c_articletype like", value, "cArticletype");
            return (Criteria) this;
        }

        public Criteria andCArticletypeNotLike(String value) {
            addCriterion("c_articletype not like", value, "cArticletype");
            return (Criteria) this;
        }

        public Criteria andCArticletypeIn(List<String> values) {
            addCriterion("c_articletype in", values, "cArticletype");
            return (Criteria) this;
        }

        public Criteria andCArticletypeNotIn(List<String> values) {
            addCriterion("c_articletype not in", values, "cArticletype");
            return (Criteria) this;
        }

        public Criteria andCArticletypeBetween(String value1, String value2) {
            addCriterion("c_articletype between", value1, value2, "cArticletype");
            return (Criteria) this;
        }

        public Criteria andCArticletypeNotBetween(String value1, String value2) {
            addCriterion("c_articletype not between", value1, value2, "cArticletype");
            return (Criteria) this;
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

        public Criteria andDtCreatetimeIsNull() {
            addCriterion("dt_createtime is null");
            return (Criteria) this;
        }

        public Criteria andDtCreatetimeIsNotNull() {
            addCriterion("dt_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andDtCreatetimeEqualTo(Date value) {
            addCriterion("dt_createtime =", value, "dtCreatetime");
            return (Criteria) this;
        }

        public Criteria andDtCreatetimeNotEqualTo(Date value) {
            addCriterion("dt_createtime <>", value, "dtCreatetime");
            return (Criteria) this;
        }

        public Criteria andDtCreatetimeGreaterThan(Date value) {
            addCriterion("dt_createtime >", value, "dtCreatetime");
            return (Criteria) this;
        }

        public Criteria andDtCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dt_createtime >=", value, "dtCreatetime");
            return (Criteria) this;
        }

        public Criteria andDtCreatetimeLessThan(Date value) {
            addCriterion("dt_createtime <", value, "dtCreatetime");
            return (Criteria) this;
        }

        public Criteria andDtCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("dt_createtime <=", value, "dtCreatetime");
            return (Criteria) this;
        }

        public Criteria andDtCreatetimeIn(List<Date> values) {
            addCriterion("dt_createtime in", values, "dtCreatetime");
            return (Criteria) this;
        }

        public Criteria andDtCreatetimeNotIn(List<Date> values) {
            addCriterion("dt_createtime not in", values, "dtCreatetime");
            return (Criteria) this;
        }

        public Criteria andDtCreatetimeBetween(Date value1, Date value2) {
            addCriterion("dt_createtime between", value1, value2, "dtCreatetime");
            return (Criteria) this;
        }

        public Criteria andDtCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("dt_createtime not between", value1, value2, "dtCreatetime");
            return (Criteria) this;
        }

        public Criteria andDtPublishtimeIsNull() {
            addCriterion("dt_publishtime is null");
            return (Criteria) this;
        }

        public Criteria andDtPublishtimeIsNotNull() {
            addCriterion("dt_publishtime is not null");
            return (Criteria) this;
        }

        public Criteria andDtPublishtimeEqualTo(Date value) {
            addCriterion("dt_publishtime =", value, "dtPublishtime");
            return (Criteria) this;
        }

        public Criteria andDtPublishtimeNotEqualTo(Date value) {
            addCriterion("dt_publishtime <>", value, "dtPublishtime");
            return (Criteria) this;
        }

        public Criteria andDtPublishtimeGreaterThan(Date value) {
            addCriterion("dt_publishtime >", value, "dtPublishtime");
            return (Criteria) this;
        }

        public Criteria andDtPublishtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dt_publishtime >=", value, "dtPublishtime");
            return (Criteria) this;
        }

        public Criteria andDtPublishtimeLessThan(Date value) {
            addCriterion("dt_publishtime <", value, "dtPublishtime");
            return (Criteria) this;
        }

        public Criteria andDtPublishtimeLessThanOrEqualTo(Date value) {
            addCriterion("dt_publishtime <=", value, "dtPublishtime");
            return (Criteria) this;
        }

        public Criteria andDtPublishtimeIn(List<Date> values) {
            addCriterion("dt_publishtime in", values, "dtPublishtime");
            return (Criteria) this;
        }

        public Criteria andDtPublishtimeNotIn(List<Date> values) {
            addCriterion("dt_publishtime not in", values, "dtPublishtime");
            return (Criteria) this;
        }

        public Criteria andDtPublishtimeBetween(Date value1, Date value2) {
            addCriterion("dt_publishtime between", value1, value2, "dtPublishtime");
            return (Criteria) this;
        }

        public Criteria andDtPublishtimeNotBetween(Date value1, Date value2) {
            addCriterion("dt_publishtime not between", value1, value2, "dtPublishtime");
            return (Criteria) this;
        }

        public Criteria andNClicknumIsNull() {
            addCriterion("n_clicknum is null");
            return (Criteria) this;
        }

        public Criteria andNClicknumIsNotNull() {
            addCriterion("n_clicknum is not null");
            return (Criteria) this;
        }

        public Criteria andNClicknumEqualTo(Integer value) {
            addCriterion("n_clicknum =", value, "nClicknum");
            return (Criteria) this;
        }

        public Criteria andNClicknumNotEqualTo(Integer value) {
            addCriterion("n_clicknum <>", value, "nClicknum");
            return (Criteria) this;
        }

        public Criteria andNClicknumGreaterThan(Integer value) {
            addCriterion("n_clicknum >", value, "nClicknum");
            return (Criteria) this;
        }

        public Criteria andNClicknumGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_clicknum >=", value, "nClicknum");
            return (Criteria) this;
        }

        public Criteria andNClicknumLessThan(Integer value) {
            addCriterion("n_clicknum <", value, "nClicknum");
            return (Criteria) this;
        }

        public Criteria andNClicknumLessThanOrEqualTo(Integer value) {
            addCriterion("n_clicknum <=", value, "nClicknum");
            return (Criteria) this;
        }

        public Criteria andNClicknumIn(List<Integer> values) {
            addCriterion("n_clicknum in", values, "nClicknum");
            return (Criteria) this;
        }

        public Criteria andNClicknumNotIn(List<Integer> values) {
            addCriterion("n_clicknum not in", values, "nClicknum");
            return (Criteria) this;
        }

        public Criteria andNClicknumBetween(Integer value1, Integer value2) {
            addCriterion("n_clicknum between", value1, value2, "nClicknum");
            return (Criteria) this;
        }

        public Criteria andNClicknumNotBetween(Integer value1, Integer value2) {
            addCriterion("n_clicknum not between", value1, value2, "nClicknum");
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
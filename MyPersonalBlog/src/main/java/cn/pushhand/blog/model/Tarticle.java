package cn.pushhand.blog.model;

import java.io.Serializable;
import java.util.Date;

public class Tarticle implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -6933032851972278120L;

	private String vcArticleid;

    private String vcArticletitle;

    private String vcArticlecontent;

    private String cArticletype;

    private String vcUserid;

    private Date dtCreatetime;

    private Date dtPublishtime;

    private Integer nClicknum;

    public String getVcArticleid() {
        return vcArticleid;
    }

    public void setVcArticleid(String vcArticleid) {
        this.vcArticleid = vcArticleid == null ? null : vcArticleid.trim();
    }

    public String getVcArticletitle() {
        return vcArticletitle;
    }

    public void setVcArticletitle(String vcArticletitle) {
        this.vcArticletitle = vcArticletitle == null ? null : vcArticletitle.trim();
    }

    public String getVcArticlecontent() {
        return vcArticlecontent;
    }

    public void setVcArticlecontent(String vcArticlecontent) {
        this.vcArticlecontent = vcArticlecontent == null ? null : vcArticlecontent.trim();
    }

    public String getcArticletype() {
        return cArticletype;
    }

    public void setcArticletype(String cArticletype) {
        this.cArticletype = cArticletype == null ? null : cArticletype.trim();
    }

    public String getVcUserid() {
        return vcUserid;
    }

    public void setVcUserid(String vcUserid) {
        this.vcUserid = vcUserid == null ? null : vcUserid.trim();
    }

    public Date getDtCreatetime() {
        return dtCreatetime;
    }

    public void setDtCreatetime(Date dtCreatetime) {
        this.dtCreatetime = dtCreatetime;
    }

    public Date getDtPublishtime() {
        return dtPublishtime;
    }

    public void setDtPublishtime(Date dtPublishtime) {
        this.dtPublishtime = dtPublishtime;
    }

    public Integer getnClicknum() {
        return nClicknum;
    }

    public void setnClicknum(Integer nClicknum) {
        this.nClicknum = nClicknum;
    }
}
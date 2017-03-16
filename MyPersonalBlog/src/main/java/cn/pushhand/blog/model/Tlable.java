package cn.pushhand.blog.model;

import java.io.Serializable;

public class Tlable implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -1584431650222069373L;

	private String vcLableid;

    private String vcLablename;

    public String getVcLableid() {
        return vcLableid;
    }

    public void setVcLableid(String vcLableid) {
        this.vcLableid = vcLableid == null ? null : vcLableid.trim();
    }

    public String getVcLablename() {
        return vcLablename;
    }

    public void setVcLablename(String vcLablename) {
        this.vcLablename = vcLablename == null ? null : vcLablename.trim();
    }
}
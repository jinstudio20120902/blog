package cn.pushhand.blog.model;

import java.io.Serializable;

public class Tarticlelable implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -439207534445134893L;

	private String vcArticleid;

    private String vcLableid;

    public String getVcArticleid() {
        return vcArticleid;
    }

    public void setVcArticleid(String vcArticleid) {
        this.vcArticleid = vcArticleid == null ? null : vcArticleid.trim();
    }

    public String getVcLableid() {
        return vcLableid;
    }

    public void setVcLableid(String vcLableid) {
        this.vcLableid = vcLableid == null ? null : vcLableid.trim();
    }
}
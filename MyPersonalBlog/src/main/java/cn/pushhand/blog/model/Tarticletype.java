package cn.pushhand.blog.model;

import java.io.Serializable;

public class Tarticletype implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 8931809778796545483L;

	private String vcTypeid;

    private String vcTypename;

    public String getVcTypeid() {
        return vcTypeid;
    }

    public void setVcTypeid(String vcTypeid) {
        this.vcTypeid = vcTypeid == null ? null : vcTypeid.trim();
    }

    public String getVcTypename() {
        return vcTypename;
    }

    public void setVcTypename(String vcTypename) {
        this.vcTypename = vcTypename == null ? null : vcTypename.trim();
    }
}
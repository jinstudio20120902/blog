package cn.pushhand.blog.model;

public class Tarticlelable {
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
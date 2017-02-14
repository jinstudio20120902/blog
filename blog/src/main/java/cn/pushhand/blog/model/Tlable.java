package cn.pushhand.blog.model;

public class Tlable {
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
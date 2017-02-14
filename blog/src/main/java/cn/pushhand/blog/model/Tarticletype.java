package cn.pushhand.blog.model;

public class Tarticletype {
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
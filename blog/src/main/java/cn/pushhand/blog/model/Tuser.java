package cn.pushhand.blog.model;

public class Tuser {
    private String vcUserid;

    private String vcUsername;

    private String vcPassword;

    public String getVcUserid() {
        return vcUserid;
    }

    public void setVcUserid(String vcUserid) {
        this.vcUserid = vcUserid == null ? null : vcUserid.trim();
    }

    public String getVcUsername() {
        return vcUsername;
    }

    public void setVcUsername(String vcUsername) {
        this.vcUsername = vcUsername == null ? null : vcUsername.trim();
    }

    public String getVcPassword() {
        return vcPassword;
    }

    public void setVcPassword(String vcPassword) {
        this.vcPassword = vcPassword == null ? null : vcPassword.trim();
    }
}
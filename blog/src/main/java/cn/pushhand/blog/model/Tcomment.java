package cn.pushhand.blog.model;

import java.util.Date;

public class Tcomment {
    private String vcCommentid;

    private String vcCommentcontent;

    private Date dtComenttime;

    private String vcVisitor;

    public String getVcCommentid() {
        return vcCommentid;
    }

    public void setVcCommentid(String vcCommentid) {
        this.vcCommentid = vcCommentid == null ? null : vcCommentid.trim();
    }

    public String getVcCommentcontent() {
        return vcCommentcontent;
    }

    public void setVcCommentcontent(String vcCommentcontent) {
        this.vcCommentcontent = vcCommentcontent == null ? null : vcCommentcontent.trim();
    }

    public Date getDtComenttime() {
        return dtComenttime;
    }

    public void setDtComenttime(Date dtComenttime) {
        this.dtComenttime = dtComenttime;
    }

    public String getVcVisitor() {
        return vcVisitor;
    }

    public void setVcVisitor(String vcVisitor) {
        this.vcVisitor = vcVisitor == null ? null : vcVisitor.trim();
    }
}
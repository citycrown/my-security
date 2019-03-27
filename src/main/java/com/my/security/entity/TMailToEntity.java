package com.my.security.entity;

public class TMailToEntity {
    private Integer id;

    private Integer mailid;

    private String touser;

    private Boolean status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMailid() {
        return mailid;
    }

    public void setMailid(Integer mailid) {
        this.mailid = mailid;
    }

    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser == null ? null : touser.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
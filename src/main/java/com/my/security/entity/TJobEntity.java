package com.my.security.entity;

import java.util.Date;

public class TJobEntity {
    private Integer id;

    private String jobname;

    private String description;

    private String cron;

    private String springbeanname;

    private String methodname;

    private Boolean issysjob;

    private Boolean status;

    private Date createtime;

    private Date updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname == null ? null : jobname.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron == null ? null : cron.trim();
    }

    public String getSpringbeanname() {
        return springbeanname;
    }

    public void setSpringbeanname(String springbeanname) {
        this.springbeanname = springbeanname == null ? null : springbeanname.trim();
    }

    public String getMethodname() {
        return methodname;
    }

    public void setMethodname(String methodname) {
        this.methodname = methodname == null ? null : methodname.trim();
    }

    public Boolean getIssysjob() {
        return issysjob;
    }

    public void setIssysjob(Boolean issysjob) {
        this.issysjob = issysjob;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}
package com.my.security.entity;

import java.util.Date;

public class TNoticeReadEntity extends TNoticeReadEntityKey {
    private Date createtime;

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
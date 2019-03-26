package com.my.security.dto;

import com.my.security.entity.SysUser;

import java.util.List;

/**
 * 类说明
 * <p>
 *
 * @author 陈冕
 * @version 1.0.0
 * @date 2019/3/26
 */
public class UserDto extends SysUser {

    private static final long serialVersionUID = -1475985552435131810L;

    private List<Long> roleIds;

    public List<Long> getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(List<Long> roleIds) {
        this.roleIds = roleIds;
    }

}

package com.my.security.service;

import com.my.security.entity.SysRoleEntity;

/**
 * 类说明
 * <p>
 *
 * @author 陈冕
 * @version 1.0.0
 * @date 2019/4/3
 */
public interface SysRoleService {
    SysRoleEntity selectById(Integer id);
}

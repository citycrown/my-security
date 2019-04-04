package com.my.security.service;

import com.my.security.entity.SysRoleUserEntity;

import java.util.List;

/**
 * 类说明
 * <p>
 *
 * @author 陈冕
 * @version 1.0.0
 * @date 2019/4/3
 */
public interface SysRoleUserService {
    List<SysRoleUserEntity> listByUserId(Integer userId);
}

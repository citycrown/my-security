package com.my.security.service;

import com.my.security.dto.UserDto;
import com.my.security.entity.SysUserEntity;

/**
 * 用户服务接口
 * <p>
 *
 * @author 陈冕
 * @version 1.0.0
 * @date 2019/3/26
 */
public interface UserService {

    SysUserEntity saveUser(UserDto userDto);

    /*SysUser updateUser(UserDto userDto);

    SysUser getUser(String username);

    void changePassword(String username, String oldPassword, String newPassword);*/
}

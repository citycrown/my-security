package com.my.security.service.impl;

import com.my.security.dto.LoginUser;
import com.my.security.entity.Permission;
import com.my.security.entity.SysRoleEntity;
import com.my.security.entity.SysRoleUserEntity;
import com.my.security.entity.SysUserEntity;
import com.my.security.mapper.PermissionMapper;
import com.my.security.service.SysRoleService;
import com.my.security.service.SysRoleUserService;
import com.my.security.service.SysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 实现userDetaikService接口
 * <p>
 *
 * @author 陈冕
 * @version 1.0.0
 * @date 2019/4/3
 */
@Service("CustomUserDetailsService")
public class CustomUserDetailsServiceImpl implements UserDetailsService {

    private static final Logger log = LoggerFactory.getLogger(CustomUserDetailsServiceImpl.class);

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private SysRoleService sysRoleService;

    @Autowired
    private SysRoleUserService sysRoleUserService;

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("根据用户名查询用户，username:", username);
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        // 从数据库中取出用户信息
        SysUserEntity user = sysUserService.selectByName(username);

        // 判断用户是否存在
        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在");
        } else if (user.getStatus() == SysUserEntity.Status.LOCKED) {
            throw new LockedException("用户被锁定,请联系管理员");
        } else if (user.getStatus() == SysUserEntity.Status.DISABLED) {
            throw new DisabledException("用户已作废");
        }

        LoginUser loginUser = new LoginUser();
        BeanUtils.copyProperties(user, loginUser);

        List<Permission> permissions = permissionMapper.listByUserId(user.getId());
        loginUser.setPermissions(permissions);

        return loginUser;
    }
}

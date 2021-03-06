package com.my.security.service.impl;

import com.my.security.dto.UserDto;
import com.my.security.entity.SysUserEntity;
import com.my.security.mapper.SysUserMapper;
import com.my.security.service.SysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 类说明
 * <p>
 *
 * @author 陈冕
 * @version 1.0.0
 * @date 2019/3/26
 */
@Service("UserService")
public class SysUserServiceImpl implements SysUserService {
    private static final Logger log = LoggerFactory.getLogger("adminLogger");

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUserEntity selectById(Long id) {
        return sysUserMapper.selectById(id);
    }

    @Override
    public SysUserEntity selectByName(String name) {
        return sysUserMapper.selectByName(name);
    }

    @Override
    @Transactional
    public SysUserEntity saveUser(UserDto userDto) {
        SysUserEntity user = userDto;
        user.setPassword(user.getPassword());
       // user.setStatus(Status.VALID);
        sysUserMapper.insert(user);
       // saveUserRoles(user.getId(), userDto.getRoleIds());

        log.debug("新增用户{}", user.getUsername());
        return user;
    }

}

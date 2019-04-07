package com.my.security.service.impl;

import com.my.security.entity.SysRoleUserEntity;
import com.my.security.mapper.SysRoleUserMapper;
import com.my.security.service.SysRoleUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类说明
 * <p>
 *
 * @author 陈冕
 * @version 1.0.0
 * @date 2019/4/3
 */
@Service("SysRoleUserService")
public class SysRoleUserServiceImpl implements SysRoleUserService {

    @Autowired
    SysRoleUserMapper sysRoleUserMapper;

    @Override
    public List<SysRoleUserEntity> listByUserId(Long userId) {
        return sysRoleUserMapper.listByUserId(userId);
    }
}

package com.my.security.service.impl;

import com.my.security.entity.SysRoleEntity;
import com.my.security.mapper.SysRoleMapper;
import com.my.security.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 类说明
 * <p>
 *
 * @author 陈冕
 * @version 1.0.0
 * @date 2019/4/3
 */
@Service("SysRoleService")
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    SysRoleMapper sysRoleMapper;

    @Override
    public SysRoleEntity selectById(Integer id){
        return sysRoleMapper.selectById(id);
    }

}

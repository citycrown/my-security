package com.my.security.controller;

import com.my.security.entity.SysUserEntity;
import com.my.security.mapper.SysUserMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * user
 * <p>
 *
 * @author 陈冕
 * @version 1.0.0
 * @date 2019/3/19
 */
@Api(tags = "用户")
@RestController
@RequestMapping("/user")
public class UserController {
    private static final Logger log = LoggerFactory.getLogger("adminLogger");

    @Autowired
    private SysUserMapper sysUserMapper;

    @ApiOperation(value = "根据用户id获取用户")
    @GetMapping("/{id}")
    public SysUserEntity user(@PathVariable Integer id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

    @ApiOperation(value = "当前登陆用户")
    @GetMapping("/currentUser")
    public SysUserEntity currentUser() {
        return null;
    }

}

package com.my.security.controller;

import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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


}

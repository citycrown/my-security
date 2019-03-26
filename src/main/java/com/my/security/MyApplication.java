package com.my.security;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * 启动类
 * <p>
 *
 * @author 陈冕
 * @version 1.0.0
 * @date 2019/3/19
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.my.security.**.mapper"})
public class MyApplication {

    private static final Logger log = LoggerFactory.getLogger("adminLogger");

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MyApplication.class, args);
        org.springframework.core.env.Environment env = context.getEnvironment();
        log.info("------");
        log.info("当前环境：{}", env.getProperty("spring.profiles.active"));
        log.info("执行成功");
        log.info("------");
    }

}

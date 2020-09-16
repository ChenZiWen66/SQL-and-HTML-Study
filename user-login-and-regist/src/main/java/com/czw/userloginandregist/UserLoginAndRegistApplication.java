package com.czw.userloginandregist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserLoginAndRegistApplication {
    private static final Logger LOG = LoggerFactory.getLogger(UserLoginAndRegistApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(UserLoginAndRegistApplication.class, args);
        LOG.info("项目启动成功 http://localhost:9005");
    }

}

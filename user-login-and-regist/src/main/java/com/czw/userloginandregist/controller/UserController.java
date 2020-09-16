package com.czw.userloginandregist.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/login")
    public String userLogin(){
        LOG.info("跳转到登陆");
        return "登陆";
    }
}

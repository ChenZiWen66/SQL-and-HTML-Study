package com.czw.userloginandregist.controller;

import com.czw.userloginandregist.entity.request.LoginRequest;
import com.czw.userloginandregist.entity.request.RegisterRequest;
import com.czw.userloginandregist.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@MapperScan(basePackages = {"com.czw.userloginandregist.mapper"})
@RestController
@CrossOrigin
public class UserController {
    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;
    @PostMapping("/login")
    public int userLogin(LoginRequest loginRequest){
        LOG.info("跳转到登陆....");
        LOG.info("{},{}",loginRequest.getUserName(),loginRequest.getPassword());
        return userService.login(loginRequest);
    }

    @RequestMapping("/register")
    public String userRegister(RegisterRequest registerRequest){
        return userService.register(registerRequest);
    };
}

package com.czw.userloginandregist.service;

import com.czw.userloginandregist.entity.request.LoginRequest;
import com.czw.userloginandregist.entity.request.RegisterRequest;
import com.czw.userloginandregist.entity.response.LoginResponse;
import com.czw.userloginandregist.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private static final Logger LOG = LoggerFactory.getLogger(UserService.class);
    @Autowired
    private UserMapper userMapper;

    public int login(LoginRequest loginRequest) {
        LOG.info("UserService Login方法开始执行");
        LoginResponse loginResponse = userMapper.loginVerify(loginRequest);
        LOG.info("UserMapper的方法执行完毕");
        if (loginResponse == null) {
            LOG.info("没有查询到内容返回0");
            return 0;
        } else {
            LOG.info("有查询到结果，返回1");
            return 1;
        }
    }

    public String register(RegisterRequest registerRequest) {
        int result = userMapper.register(registerRequest);
        if (result > 0) {
            return "注册成功";
        } else {
            return "注册失败";
        }
    }
}

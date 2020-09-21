package com.czw.userloginandregist.mapper;

import com.czw.userloginandregist.entity.request.LoginRequest;
import com.czw.userloginandregist.entity.request.RegisterRequest;
import com.czw.userloginandregist.entity.response.LoginResponse;

public interface UserMapper {
    LoginResponse loginVerify(LoginRequest loginRequest);

    int register(RegisterRequest registerRequest);
}

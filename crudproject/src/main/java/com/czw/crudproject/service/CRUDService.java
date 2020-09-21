package com.czw.crudproject.service;

import com.czw.crudproject.entity.UserEntity;
import com.czw.crudproject.mapper.CRUDMapper;
import com.czw.crudproject.request.ShowUserRequest;
import com.czw.crudproject.response.ShowUserResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CRUDService {
    private static final Logger LOG = LoggerFactory.getLogger(CRUDService.class);

    @Autowired
    public CRUDMapper crudMapper;

    //    @Resource
    public List<ShowUserResponse> show(ShowUserRequest showUserRequest) {
        LOG.info("开始查询用户表");
        List<UserEntity> userEntityList = crudMapper.selectUser((showUserRequest.getCurrentPage() - 1) * showUserRequest.getPageSize(), showUserRequest.getPageSize());
        List<ShowUserResponse> showUserResponses = new ArrayList<>();
        for (UserEntity userEntity : userEntityList) {
            ShowUserResponse showUserResponse = new ShowUserResponse();
            showUserResponse.setUsername(userEntity.getUsername());
            showUserResponse.setPassword(userEntity.getPassword());
            showUserResponses.add(showUserResponse);
        }
        LOG.info("查询用户表成功");
        return showUserResponses;
    }
}

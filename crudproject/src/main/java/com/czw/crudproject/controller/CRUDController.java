package com.czw.crudproject.controller;

import com.czw.crudproject.request.ShowUserRequest;
import com.czw.crudproject.response.ShowUserResponse;
import com.czw.crudproject.service.CRUDService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/crud")
public class CRUDController {
    private static final Logger LOG = LoggerFactory.getLogger(CRUDController.class);
    @Autowired
    private CRUDService crudService;

    /**
     * 查询用户表
     * @return
     */
    @PostMapping("/show")
    @ResponseBody
    @CrossOrigin
    public List<ShowUserResponse> showUser(@RequestBody ShowUserRequest showUserRequest){
        LOG.info("开始,当前页面{},页面大小{}",showUserRequest.getCurrentPage(),showUserRequest.getPageSize());
        return crudService.show(showUserRequest);
    }
}

package com.czw.simpleproject.controller;

import com.czw.simpleproject.response.DataResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataController {
    @RequestMapping("/getdata")
//    @ResponseBody
    public DataResponse getdata(){
        DataResponse dataResponse = new DataResponse();
        dataResponse.setUsername("czw");
        dataResponse.setPassword("123456");
        return dataResponse;
    }
}

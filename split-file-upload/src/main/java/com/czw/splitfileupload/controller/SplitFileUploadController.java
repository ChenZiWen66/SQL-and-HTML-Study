package com.czw.splitfileupload.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/file")
public class SplitFileUploadController {
    private static final Logger LOG = LoggerFactory.getLogger(SplitFileUploadController.class);
    @RequestMapping("/upload")
    public String splitUploadFile(){
        return "分片上传成功";
    }
}

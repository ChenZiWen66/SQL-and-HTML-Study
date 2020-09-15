package com.czw.splitfileupload;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SplitFileUploadApplication {
    private static final Logger LOG = LoggerFactory.getLogger(SplitFileUploadApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(SplitFileUploadApplication.class, args);
        LOG.info("分片上传项目启动成功 http://localhost:9004");
    }

}

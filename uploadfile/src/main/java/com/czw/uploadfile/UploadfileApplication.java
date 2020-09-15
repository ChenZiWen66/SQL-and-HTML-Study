package com.czw.uploadfile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UploadfileApplication {
    private static final Logger LOG = LoggerFactory.getLogger(UploadfileApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(UploadfileApplication.class, args);
        LOG.info("项目启动成功http://localhost:9003");
    }

}

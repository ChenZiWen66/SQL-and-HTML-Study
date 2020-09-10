package com.czw.simpleproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleprojectApplication {
    public static Logger LOG=LoggerFactory.getLogger(SimpleprojectApplication.class);
    public static void main(String[] args) {
        LOG.info("Application启动...");
        SpringApplication.run(SimpleprojectApplication.class, args);
        LOG.info("Application启动成功port=9001");
    }

}

package com.czw.crudproject;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = {"com.czw.crudproject.mapper"})
@SpringBootApplication
public class CrudprojectApplication {
    public static Logger LOG = LoggerFactory.getLogger(CrudprojectApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CrudprojectApplication.class, args);
        LOG.info("启动项目成功,http://localhost:9002");
    }

}

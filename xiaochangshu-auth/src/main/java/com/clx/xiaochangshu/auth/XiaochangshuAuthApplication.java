package com.clx.xiaochangshu.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.clx.xiaochangshu.auth.domain.mapper")
public class XiaochangshuAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaochangshuAuthApplication.class, args);
    }

}

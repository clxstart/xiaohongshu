package com.clx.xiaochangshu.auth.controller;

import com.clx.framework.aop.log.aspect.ApiOperationLog;
import com.clx.framework.common.response.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;


@RestController
public class TestController {

    @GetMapping("/test")
    @ApiOperationLog(description = "测试接口")
    public Response<String> test() {
        return Response.success("Hello, clx666");
    }

    @GetMapping("/test2")
    @ApiOperationLog(description = "测试接口2")
    public Response<User> test2() {
        return Response.success(User.builder()
                .nickName("clx")
                .createTime(LocalDateTime.now())
                .build());
    }
}


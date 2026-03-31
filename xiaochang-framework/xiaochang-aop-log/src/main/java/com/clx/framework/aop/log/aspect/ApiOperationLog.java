package com.clx.framework.aop.log.aspect;

import java.lang.annotation.*;

// 自定义注解类

@Retention(RetentionPolicy.RUNTIME) // 运行时仍然存在，可通过反射读取
@Target({ElementType.METHOD})
@Documented
public @interface ApiOperationLog {
    /**
     * API 功能描述
     *
     * @return
     */
    String description() default "";

}

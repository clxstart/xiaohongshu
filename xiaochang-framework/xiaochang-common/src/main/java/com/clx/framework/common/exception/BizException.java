package com.clx.framework.common.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 业务异常
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BizException implements BaseExceptionInterface {

    /**
     * 异常码
     */
    private String errorCode;

    /**
     * 异常消息
     */
    private String errorMessage;

}

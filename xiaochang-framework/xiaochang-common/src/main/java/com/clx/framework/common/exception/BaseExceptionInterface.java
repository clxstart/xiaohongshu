package com.clx.framework.common.exception;

/**
 * 异常接口
 */
public interface BaseExceptionInterface {

    /**
     * 获取异常码
     */
    String getErrorCode();

    /**
     * 获取异常消息
     */
    String getErrorMessage();

}

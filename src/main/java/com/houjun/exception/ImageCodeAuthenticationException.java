package com.houjun.exception;


import org.springframework.security.core.AuthenticationException;

/**
 * 自定义的AuthenticationException异常子类
 */

public class ImageCodeAuthenticationException extends AuthenticationException {
    public ImageCodeAuthenticationException(String msg, Throwable t) {
        super(msg, t);
    }

    public ImageCodeAuthenticationException(String explanation) {
        super(explanation);
    }

}

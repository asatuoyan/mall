package com.atguigu.gmall.common.exception;

/**
 * @author akinjoker
 * @version 1.0
 * @Create 5/25/23 10:34 AM
 * @description
 */
public class AuthException extends RuntimeException{
    public AuthException() {
        super();
    }

    public AuthException(String message) {
        super(message);
    }
}

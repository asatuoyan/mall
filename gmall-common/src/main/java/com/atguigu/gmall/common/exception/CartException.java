package com.atguigu.gmall.common.exception;

/**
 * @author akinjoker
 * @version 1.0
 * @Create 5/26/23 7:48 PM
 * @description
 */

public class CartException extends RuntimeException{
    public CartException() {
        super();
    }

    public CartException(String message) {
        super(message);
    }
}

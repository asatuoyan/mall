package com.atguigu.gmall.common.exception;

/**
 * @author akinjoker
 * @version 1.0
 * @Create 5/30/23 4:58 PM
 * @description
 */
public class OrderException extends RuntimeException{
    public OrderException() {
        super();
    }

    public OrderException(String message) {
        super(message);
    }
}

package com.learn.logexp.advice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author sunil
 * @project log-exception-controller-advice-app
 * @created 2021/09/10 6:15 PM
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidProductException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public InvalidProductException (String message) {
        super(message);
    }
}

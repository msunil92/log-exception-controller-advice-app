package com.learn.logexp.advice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author sunil
 * @project log-exception-controller-advice-app
 * @created 2021/09/10 6:14 PM
 */
@RestControllerAdvice
public class ProductExceptionHandler {
    @ExceptionHandler(InvalidProductException.class)
    public final ResponseEntity<String> handleInvalidTraceIdException
            (InvalidProductException ex) {

        return new ResponseEntity<String>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }
}

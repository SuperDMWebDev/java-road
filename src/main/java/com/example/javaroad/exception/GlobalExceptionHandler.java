package com.example.javaroad.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {
    // handler when exception happen
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> resourceNotFoundException(ResourceNotFoundException ex, WebRequest request)
    {
        ErrorDetail errorDetail = new ErrorDetail(new Date(),ex.getMessage(),request.getDescription(true));
        return new ResponseEntity<>(errorDetail, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> exception (Exception exception, WebRequest request)
    {
        ErrorDetail errorDetail = new ErrorDetail(new Date(), exception.getMessage(),request.getDescription(true));
        return new ResponseEntity<>(errorDetail,HttpStatus.INTERNAL_SERVER_ERROR);
    }

}

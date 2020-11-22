package com.example.springcustomvalidator.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class TranslateException extends ResponseEntityExceptionHandler {

    //handling invalid input model exception
//    @ExceptionHandler(MethodArgumentNotValidException.class)
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers, HttpStatus status,
                                                                  WebRequest request) {
        ErrorDetails errorDetails = new ErrorDetails(new Date(), "003", "Validation Failed123",
                ex.getBindingResult().getFieldError().getDefaultMessage().toString());
        return new ResponseEntity(errorDetails, HttpStatus.BAD_REQUEST);
    }
}

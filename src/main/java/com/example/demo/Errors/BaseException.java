package com.example.demo.Errors;

import org.springframework.http.HttpStatus;

public abstract class BaseException extends RuntimeException {

    public BaseException(String message) {
        super(message);
    }

    public abstract HttpStatus getStatusCode();

}

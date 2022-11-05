package com.example.demo.Errors;

import org.springframework.http.HttpStatus;

public abstract class BaseExeption extends RuntimeException {

    public BaseExeption(String message) {
        super(message);
    }

    public abstract HttpStatus getStatusCode();
    public abstract String getMessageExeption();
}

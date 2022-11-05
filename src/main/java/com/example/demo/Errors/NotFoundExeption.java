package com.example.demo.Errors;

import org.springframework.http.HttpStatus;

public class NotFoundExeption extends BaseExeption{


    public NotFoundExeption(String message) {
        super(message);
    }

    @Override
    public HttpStatus getStatusCode() {
        return HttpStatus.NOT_FOUND;
    }

    @Override
    public String getMessageExeption() {
        return "NotFoundExeption";
    }

}

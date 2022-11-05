package com.example.demo.Errors;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.springframework.http.HttpStatus;

public class ConflictException extends BaseExeption {

    public ConflictException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getStatusCode() {
        return HttpStatus.CONFLICT;
    }

    @Override
    public String getMessageExeption() {
        return "ConflictExceptions";
    }

}

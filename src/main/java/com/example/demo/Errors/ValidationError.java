package com.example.demo.Errors;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class ValidationError {

    public ValidationError() {
        this.timestamp = new Date();
        errors=new ArrayList<>();
    }

    private String uri;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy hh:mm:ss")
    private Date timestamp;
    private List<String> errors;

    public void AddErrors(String error){
        errors.add(error);
    }
}

package com.example.demo.Errors;


import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ErrorDetails {


    public ErrorDetails(String message, List<String> details, String uri) {
        this.message = message;
        this.details = details;
        this.timestamp = new Date();
        this.uri = uri;
    }

    private String message;
    private List<String> details;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy hh:mm:ss")
    private Date timestamp;
    private String uri;

}

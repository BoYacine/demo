package com.example.demo.Dto;

import com.example.demo.Entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocumentRequestDto {

    private Long id;
    private String name;
    private String format;
    private double size;
    private Date date;
    private String path;
    private User user;

}

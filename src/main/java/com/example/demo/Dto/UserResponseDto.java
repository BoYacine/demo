package com.example.demo.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class UserResponseDto {
    private Long id;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;

}

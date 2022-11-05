package com.example.demo.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data @AllArgsConstructor @NoArgsConstructor
public class UserRequestDto {
    @NotBlank(message = "userName is required")
    @NotNull(message = "userName is required")
    private String userName;
    private String password;
    private String firstName;
    private String lastName;

}

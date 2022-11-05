package com.example.demo.Service;

import com.example.demo.Dto.UserRequestDto;
import com.example.demo.Dto.UserResponseDto;

import java.util.List;

public interface UserService {


    UserResponseDto save(UserRequestDto userRequestDto);
    UserResponseDto findById(long id);
    List<UserResponseDto> findAll();
    UserResponseDto findByName(String name);
    UserResponseDto update(UserRequestDto userRequestDto, long id);
    UserResponseDto delete(long id);



}

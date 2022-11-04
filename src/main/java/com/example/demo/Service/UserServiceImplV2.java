package com.example.demo.Service;
import com.example.demo.Dto.UserRequestDto;
import com.example.demo.Dto.UserResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("v2")
public class UserServiceImplV2 implements UserService {
    @Override
    public UserResponseDto save(UserRequestDto userRequestDto) {
        return null;
    }

    @Override
    public UserResponseDto findById(long id) {
        return null;
    }

    @Override
    public List<UserResponseDto> findAll() {
        return null;
    }

    @Override
    public UserResponseDto findByName(String name) {
        return null;
    }

    @Override
    public UserResponseDto update(UserRequestDto userRequestDto, long id) {
        return null;
    }

    @Override
    public UserResponseDto delete(long id) {
        return null;
    }
}

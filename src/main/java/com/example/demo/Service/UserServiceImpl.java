package com.example.demo.Service;

import com.example.demo.Dto.UserRequestDto;
import com.example.demo.Dto.UserResponseDto;
import com.example.demo.Entity.User;
import com.example.demo.Errors.ConflictException;
import com.example.demo.Errors.NotFoundException;
import com.example.demo.Mapper.MapperUserImpl;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("v1")
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    MapperUserImpl mapper;

    @Override
    public UserResponseDto save(UserRequestDto userRequestDto) {
        if (userRepository.findByUserName(userRequestDto.getUserName())!=null){
            throw new ConflictException("Another User with same UserName exist");
        }
        User user=mapper.DtoToEntity(userRequestDto);
        userRepository.save(user);
        UserResponseDto userResponseDto=mapper.EntityToDto(user);
        return userResponseDto;
    }

    @Override
    public UserResponseDto findById(long id) {
      UserResponseDto userResponseDto =
              mapper.EntityToDto(userRepository.findById(id).orElseThrow(() ->
                      new NotFoundException("user not found")));
        return userResponseDto;
    }

    @Override
    public List<UserResponseDto> findAll() {
        List<User> users= userRepository.findAll();
        List<UserResponseDto> userResponseDtos = users.stream()
                        .map(user ->mapper.EntityToDto(user))
                        .collect(Collectors.toList());
        return  userResponseDtos;
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

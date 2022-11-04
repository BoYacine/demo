package com.example.demo.Mapper;
import com.example.demo.Dto.UserRequestDto;
import com.example.demo.Dto.UserResponseDto;
import com.example.demo.Entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MapperUserImpl implements Mapper<User,UserResponseDto,UserRequestDto> {

    @Autowired
    ModelMapper modelMapper;

    @Override
    public UserResponseDto EntityToDto(User user) {
        UserResponseDto userResponseDto =new UserResponseDto();
        modelMapper.map(user, userResponseDto);
        return userResponseDto;
    }
    @Override
    public User DtoToEntity(UserRequestDto userRequestDto) {
        User user =new User();
        modelMapper.map(userRequestDto, user);
        return user;
    }
}

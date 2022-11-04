package com.example.demo.Mapper;

import com.example.demo.Dto.UserRequestDto;
import com.example.demo.Dto.UserResponseDto;
import com.example.demo.Entity.User;

public interface Mapper<E,RS,RQ> {
    /**
     *
     * @param user: Entity
     * @return UserRequestDto
     */
    RS EntityToDto(E user);

    /**
     *
     * @param userRequestDto
     * @return E: Entity
     */
    E DtoToEntity(RQ userRequestDto);


}

package com.example.demo.Controller;

import com.example.demo.Dto.UserRequestDto;
import com.example.demo.Dto.UserResponseDto;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class UserController {
    @Autowired
    @Qualifier(value = "v1")
    UserService userService;

    @GetMapping("users/{id}")
    public UserResponseDto findById(@PathVariable long id){
        return userService.findById(id);
    }

    @PostMapping("users")
    public UserResponseDto save(@RequestBody  UserRequestDto userRequestDto) {
        return userService.save(userRequestDto);
    }
    @GetMapping("users")
    public List<UserResponseDto> findAll() {
        return userService.findAll();
    }
}

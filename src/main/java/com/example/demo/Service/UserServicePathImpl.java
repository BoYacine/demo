package com.example.demo.Service;

import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserServicePathImpl implements UserServicePath{


    @Autowired
    UserRepository userRepository;
    @Value("${directory.root}")
    String root;

    @Override
    public String getUserPath(Long id) {
        User user= userRepository.findById(id).get();
        String path= root + user.getUserName();
        return path;
    }



}

package com.SpringApi.SpringApi.controller;

import com.SpringApi.SpringApi.interfaces.UserRepository;
import com.SpringApi.SpringApi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/test")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping
    public List<User> getHello(){
        System.out.println("result");
        return userRepository.findAll();
    }
}

package com.SpringApi.SpringApi.controller;

import com.SpringApi.SpringApi.model.User;
import com.SpringApi.SpringApi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/test")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/pizza/register")
    public User registerUser(@RequestBody User user){
        System.out.println(user);
        return user;
    }
}

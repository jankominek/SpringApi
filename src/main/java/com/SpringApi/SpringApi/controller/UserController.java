package com.SpringApi.SpringApi.controller;

import com.SpringApi.SpringApi.dto.UserCredentialsDto;
import com.SpringApi.SpringApi.dto.UserDto;
import com.SpringApi.SpringApi.dto.UserInfoDto;
import com.SpringApi.SpringApi.model.User;
import com.SpringApi.SpringApi.service.UserService;
import com.SpringApi.SpringApi.utils.UserVerification;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/pizza")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getUser")
    public User getUser(@RequestBody String email){
        return userService.getUser(email);
    }

    @PostMapping("/register")
    public void registerUser(@RequestBody UserCredentialsDto user){ userService.registerUser(user);
    }

    @PostMapping("/login")
    public Boolean loginUser(@RequestBody UserCredentialsDto user) {
        return userService.loginUser(user);
    }
    @PostMapping("/verification")
    public Boolean verifyAccount(@RequestBody UserVerification userVerification){
        return userService.verifyAccount(userVerification);
    }
    @GetMapping("/auth/verification-check")
    public UserInfoDto getpizzeriaApplicationSpringReactUserInfo(@RequestBody String email){
        return userService.getUserInfo(email);
    }

}

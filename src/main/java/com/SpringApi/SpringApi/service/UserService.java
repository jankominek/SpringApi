package com.SpringApi.SpringApi.service;

import com.SpringApi.SpringApi.interfaces.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void registerUser(){

    }
}

package com.example.demo.service;

import com.example.demo.entity.UserEntity;
import com.example.demo.dto.UserRequest;

public interface UserService {
    UserEntity getUser(int id);
    UserEntity addUser(UserRequest userRequest);
}
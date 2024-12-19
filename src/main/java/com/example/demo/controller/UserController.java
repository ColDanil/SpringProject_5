package com.example.demo.controller;

import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.demo.dto.UserRequest;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/user")
    public UserEntity getUserById(@RequestParam int id) {
        return userService.getUser(id);
    }

    @PostMapping("/user")
    public UserEntity addUser(@RequestBody UserRequest userRequest) {
        return userService.addUser(userRequest);
    }
}
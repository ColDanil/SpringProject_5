package com.example.demo.controller;

import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    // Обработка числа из строки запроса
    @GetMapping("/user")
    public UserEntity getUserById(@RequestParam int id) {
        return userService.getUser(id);
    }

    // Обработка JSON из тела запроса
    @PostMapping("/user")
    public UserEntity getUserByJson(@RequestBody UserIdRequest request) {
        return userService.getUser(request.getId());
    }

    public static class UserIdRequest {
        private int id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}
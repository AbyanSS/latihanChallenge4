package com.arj.tesch4.controller;

import com.arj.tesch4.model.UserEntity;
import com.arj.tesch4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<UserEntity> findAllUsers() {
        return userService.findAllUsers();
    }

}

package com.arj.tesch4.service;

import com.arj.tesch4.model.UserEntity;
import com.arj.tesch4.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public List<UserEntity> findAllUsers(){
        return userRepo.findAll();
    }

}

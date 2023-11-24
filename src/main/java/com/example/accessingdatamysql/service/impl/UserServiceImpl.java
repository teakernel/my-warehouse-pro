package com.example.accessingdatamysql.service.impl;

import com.example.accessingdatamysql.entity.User;
import com.example.accessingdatamysql.dao.UserRepository;
import com.example.accessingdatamysql.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    @Override
    public void add(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}

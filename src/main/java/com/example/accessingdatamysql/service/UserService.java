package com.example.accessingdatamysql.service;

import com.example.accessingdatamysql.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    void add(User user);

    List<User> findAll();

}

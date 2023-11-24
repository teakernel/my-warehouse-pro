package com.example.accessingdatamysql.controller;

import com.example.accessingdatamysql.service.UserService;
import com.example.accessingdatamysql.entity.User;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/userAdd")
    public String index1(){
        return "user_new";
    }

    @RequestMapping("/save")
    public String save(Model model, User user){
        userService.add(user);
        return "redirect:/userList";
    }

    @RequestMapping("/userList")
    public String index(Model model)   {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "user_list";
    }

}
package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.bean.User;
import com.atguigu.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public User getUser(Integer id){
        return userService.getUser(id);
    }

    @RequestMapping("/getUserAndMovie")
    public Map<String,Object> getUserAndMovie(Integer id){
        return userService.getUserAndMovie(id);
    }
}

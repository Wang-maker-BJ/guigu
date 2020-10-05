package com.atguigu.springcloud.service;

import com.atguigu.springcloud.bean.User;

import java.util.Map;

public interface UserService {
    User getUser(Integer id);

    Map<String, Object> getUserAndMovie(Integer id);
}

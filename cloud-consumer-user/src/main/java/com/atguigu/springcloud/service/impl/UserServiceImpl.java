package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.bean.User;
import com.atguigu.springcloud.dao.UserDao;
import com.atguigu.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUser(Integer id) {
        return userDao.getUserById(id);
    }

    @Override
    public Map<String, Object> getUserAndMovie(Integer id) {
        Map<String,Object> map = new HashMap<>();
        //将用户信息放入集合中
        map.put("user",getUser(id));

        //将电影信息放入集合中
        map.put("movie",null);


        return map;
    }
}

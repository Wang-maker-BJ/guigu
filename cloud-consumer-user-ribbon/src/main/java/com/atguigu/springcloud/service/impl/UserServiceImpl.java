package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.bean.Movie;
import com.atguigu.springcloud.bean.User;
import com.atguigu.springcloud.dao.UserDao;
import com.atguigu.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public User getUser(Integer id) {
        return userDao.getUserById(id);
    }

    @Override
    public Map<String, Object> getUserAndMovie(Integer id) {
        Map<String,Object> map = new HashMap<>();
        //将用户信息放入集合中
        map.put("user",getUser(id));

        Movie movie = restTemplate.getForObject("http://CLOUD-PROVIDER-MOVIE/getMovie?id=1", Movie.class);
        //将电影信息放入集合中
        map.put("movie",movie);


        return map;
    }
}

package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    public User getUserById(Integer id){
        return new User(id,"帅宇");
    }
}

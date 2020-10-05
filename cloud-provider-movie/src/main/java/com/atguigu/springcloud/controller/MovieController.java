package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.bean.Movie;
import com.atguigu.springcloud.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    //获取每个项目启动时的端口号打印
    @Value("${server.port}")
    private Integer port;

    @RequestMapping("/getMovie")
    public Movie getMovie(@RequestParam("id") Integer id){
        System.out.println("端口号为" + port + "的电影服务被启动了");
        return movieService.getMovie(id);
    }
}

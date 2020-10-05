package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.bean.Movie;
import com.atguigu.springcloud.service.MovieFeignClient;
import org.springframework.stereotype.Service;
//feign客户端的异常处理类，当feign客户端的方法调用失败时会调用当前类的实现方法处理请求
@Service//将异常类的对象注入容器中
public class MovieFeignClientExceptionHandler implements MovieFeignClient {
    @Override
    public Movie getMovie(Integer id) {
        return new Movie(-1,"查询失败，请刷新重试");
    }
}

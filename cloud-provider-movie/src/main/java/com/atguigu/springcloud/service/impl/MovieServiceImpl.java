package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.bean.Movie;
import com.atguigu.springcloud.dao.MovieDao;
import com.atguigu.springcloud.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieDao movieDao;

    @Override
    public Movie getMovie(Integer id) {
        return movieDao.getMovieById(id);
    }
}

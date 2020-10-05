package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.bean.Movie;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDao {

    public Movie getMovieById(Integer id) {
        return new Movie(id,"上海赶紧凉快吧");
    }
}

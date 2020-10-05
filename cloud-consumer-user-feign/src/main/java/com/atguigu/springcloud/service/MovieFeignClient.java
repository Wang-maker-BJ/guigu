package com.atguigu.springcloud.service;

import com.atguigu.springcloud.bean.Movie;
import com.atguigu.springcloud.service.impl.MovieFeignClientExceptionHandler;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "CLOUD-PROVIDER-MOVIE",fallback = MovieFeignClientExceptionHandler.class )//需要将当前feign客户端绑定给Movie服务
//绑定的目的是为了获取注册中心要访问的服务的ip地址+端口号,value值填写注册中心的要访问服务的名称
//fallback是异常处理类，要继承此接口，当发生异常，比如movie服务挂了，user服务要调用movie服务，这时为了避免
//服务器的雪崩，要设置异常处理类
public interface MovieFeignClient {


    /**
     * 传入的参数是简单数据类型
     *              必须使用@RequestParam绑定参数
     * 复杂类型的数据：对象、map、list
     *              必须使用@RequestBody将参数转换为Json传递
     * @param id
     * @return
     */

    @RequestMapping("/movie/getMovie")//路径拼接后必须要和远程访问的资源的路径相同
    Movie getMovie(@RequestParam("id") Integer id);

}

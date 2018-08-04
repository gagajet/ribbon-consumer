package com.example.ribbonconsumer.controller;

import com.example.ribbonconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author:王泽龙
 * @Description:
 * @Date: 18-7-29 下午1:51
 */
@RestController
public class ConsumerController {
    @Autowired
    HelloService helloService;

    @RequestMapping(value="/ribbon-consumer", method= RequestMethod.GET)
    public String helloConsumer(){
        return helloService.helloService();
    }
}
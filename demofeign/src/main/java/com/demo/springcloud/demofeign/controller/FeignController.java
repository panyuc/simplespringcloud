package com.demo.springcloud.demofeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springcloud.demofeign.client.FeignClient;

@RestController
public class FeignController  {

    @Autowired
    private FeignClient feignClient;
    
    @RequestMapping("/hi")
    public String hi(String name){
        return feignClient.getClientHi(name);
    }

}

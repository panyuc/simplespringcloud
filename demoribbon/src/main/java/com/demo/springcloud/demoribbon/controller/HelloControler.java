package com.demo.springcloud.demoribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springcloud.demoribbon.service.HelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;
    
    
    @RequestMapping(value = "/hi")
    @HystrixCommand(fallbackMethod = "hiError")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }
    
    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }

}
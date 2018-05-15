package com.demo.springcloud.demofeign.client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.cloud.netflix.feign.FeignClient("democlient")
public interface FeignClient {
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String getClientHi(@RequestParam(value = "name") String name);
}

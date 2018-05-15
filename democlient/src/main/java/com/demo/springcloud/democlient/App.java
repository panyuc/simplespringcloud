package com.demo.springcloud.democlient;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hello world!
 *
 */
@Controller
@RequestMapping("/app/")
public class App 
{
    @ResponseBody
    @RequestMapping("hi")
    public String h(){
        return "holle";
    }
}

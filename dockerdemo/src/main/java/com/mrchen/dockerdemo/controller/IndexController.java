package com.mrchen.dockerdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Value("${jaspty.test}")
    private String val;

    @GetMapping("/index")
    public String index(){
    return "index" ;
    }


    @GetMapping("/test")
    public @ResponseBody int test(String test ){
        int a = 0 ;
        int b = 1;
        return a ;
    }

    @GetMapping("/aaa")
    public void  jasptyTest(){
        System.out.println(val);
    }
}

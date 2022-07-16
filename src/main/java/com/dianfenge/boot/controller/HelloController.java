package com.dianfenge.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/*
@ResponseBody
@Controller 可统一为@RestController
 */


@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String handle01(){
        System.out.println("test");
        return "hello,SpringBoot!test2 hot-fix,test";
    }
}

package com.example.usermanager;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {

    @RequestMapping("/hello")
    public String SayHello(){
        return "李书记";
    }
}

package com.ecomerceStore.store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
    @GetMapping("/index")
    public String greetingPage(){
        return "index";
    }
    @GetMapping("/")
    public String Page(){
        return "contact";
    }
    @GetMapping("/welcome")
    public String WelcomePage(){
        return "index";
    }
    @GetMapping("/register")

    public String registerUser(){

        return "register";
    }
    @GetMapping ("/login")
    public String loginUser(){

        return "login";
    }


}

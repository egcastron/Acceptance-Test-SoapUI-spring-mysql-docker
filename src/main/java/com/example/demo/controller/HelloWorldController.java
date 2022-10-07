package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloWorldJWT")
@CrossOrigin
public class HelloWorldController {

    @RequestMapping({"/hello"})
    public String firstPage(){
        return "Hello World...!";
    }

    @RequestMapping({"/helloNotSecurity"})
    public String firstPagePrima(){
        return "Hello World...!";
    }

}

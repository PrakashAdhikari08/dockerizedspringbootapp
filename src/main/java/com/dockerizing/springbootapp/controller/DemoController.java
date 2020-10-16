package com.dockerizing.springbootapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class DemoController {

    @GetMapping("/all")
    public String getAll(){
        return "All User are busy";
    }
}

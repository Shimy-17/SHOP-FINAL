package com.example.bsweb.controller;

import com.example.bsweb.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @GetMapping("/")
    public String index(){
        return "hello, Alexandr";
    }

    @PostMapping(value="/", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public User indexPost(@RequestBody User user){

        return user;
    }
}

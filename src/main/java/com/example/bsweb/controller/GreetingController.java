package com.example.bsweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("name", "Alexandr");

        return "index";
    }
}

package com.example.javaapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hej från Java API! BING BONG BOIOIOIOING";
    }
    
    @GetMapping("/index")
    public String index() {
        return "redirect:/index.html";
    }
}

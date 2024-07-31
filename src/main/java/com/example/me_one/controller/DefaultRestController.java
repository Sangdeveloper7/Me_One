package com.example.me_one.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class DefaultRestController {
    @GetMapping("/index")
    public String index(@RequestParam int test1, @RequestParam int test2){
        return "hahah!!! " + test1 + "///" + test2;
    }

}

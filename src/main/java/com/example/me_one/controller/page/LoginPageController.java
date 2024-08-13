package com.example.me_one.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("")
@Controller
public class LoginPageController {


    @GetMapping("/")
    public String login(){
        return "tbmeanone/login";
    }





}

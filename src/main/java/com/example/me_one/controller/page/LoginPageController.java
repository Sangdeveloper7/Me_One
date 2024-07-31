package com.example.me_one.controller.page;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("")
@Controller
public class LoginPageController {

    @GetMapping({"/Login", "/login"})
    public String login() {return "login"; }
}

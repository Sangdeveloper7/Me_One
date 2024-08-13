package com.example.me_one.controller.page;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/tbmain_serv")
@Controller
public class MainServicePageController {

    @GetMapping({"/Mainserv", "/mainserv"})
    public String mainserv() {return "tbmeanone/mainservice"; }

}

package com.example.me_one.controller.page;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EnterPageController {

    @GetMapping("/tbmeanone/enter")
    public String enterPage() {
        return "tbmeanone/enter";
    }
}

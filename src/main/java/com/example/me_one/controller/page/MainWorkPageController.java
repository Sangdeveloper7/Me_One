package com.example.me_one.controller.page;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/tbmain_work")
@Controller
public class MainWorkPageController {

    @GetMapping({"/Mainwork", "/mainwork"})
    public String mainwork() {return "tbmeanone/mainwork"; }
}

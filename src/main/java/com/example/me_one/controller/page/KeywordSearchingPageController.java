package com.example.me_one.controller.page;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/tbkeyword")
@Controller
public class KeywordSearchingPageController {

    @GetMapping({"/keyword", "/Keyword"})
    public String keyword() {return "keyword"; }
}

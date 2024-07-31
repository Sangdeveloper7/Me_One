package com.example.me_one.controller.page;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/tbsearch")
@Controller
public class SearchingPageController {

    @GetMapping({"/search", "/Search"})
    public String search() {return "search"; }
}

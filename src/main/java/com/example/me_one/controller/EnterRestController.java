package com.example.me_one.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/api/tbboard")
@RestController
public class EnterRestController {

    EnterRestController enterRestController;

    public EnterRestController(
            EnterRestController enterRestController
    ){
        this.enterRestController = enterRestController;
    }

    @GetMapping("/create")
    public Map<String, Object> create(
            @RequestParam String title
            , @RequestParam String content
            , @RequestParam String writer
    ){
        Map<String, Object> tbboard = new HashMap<>();
        tbboard.put("title", title);
        tbboard.put("content", content);
        tbboard.put("writer", writer);
        return enterService.create(enterService);
    }
}

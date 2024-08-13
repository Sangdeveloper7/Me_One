package com.example.me_one.controller;


import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/tbenter")
@RestController
public class EnterRestController {

    EnterRestController enterRestController;

    public EnterRestController(
            EnterRestController enterRestController
    ){
        this.enterRestController = enterRestController;
    }

    @PostMapping("")
    public ResponseEntity<TbpostDto.CreateResDto> create(@Valid @RequestBody TbpostDto.CreateReqDto param){
        return ResponseEntity.status(HttpStatus.CREATED).body(tbpostService.create(param));
    }


}

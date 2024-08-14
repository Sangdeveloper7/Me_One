package com.example.me_one.controller;

import com.example.me_one.dto.TbuserDto;
import com.example.me_one.service.TbuserService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tbenter")
public class EnterRestController {

    private static final Logger logger = LoggerFactory.getLogger(EnterRestController.class);

    private final TbuserService tbuserService;

    public EnterRestController(TbuserService tbuserService) {
        this.tbuserService = tbuserService;
    }

    @PostMapping("")
    public ResponseEntity<TbuserDto.CreateResDto> create(@Valid @RequestBody TbuserDto.CreateReqDto param) {
        logger.info("Create request received with param: {}", param);
        TbuserDto.CreateResDto response = tbuserService.create(param);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<TbuserDto.SelectResDto> detail(@PathVariable("id") String id) {
        logger.info("Detail request received for id: {}", id);
        TbuserDto.SelectResDto response = tbuserService.get(id);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @GetMapping("/list")
    public ResponseEntity<List<TbuserDto.SelectResDto>> list(@Valid TbuserDto.ListReqDto param) {
        logger.info("List request received with param: {}");
        List<TbuserDto.SelectResDto> response = tbuserService.list(param);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @PutMapping("")
    public ResponseEntity<TbuserDto.CreateResDto> update(@Valid @RequestBody TbuserDto.UpdateReqDto param) {
        logger.info("Update request received with param: {}", param);
        TbuserDto.CreateResDto response = tbuserService.update(param);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}

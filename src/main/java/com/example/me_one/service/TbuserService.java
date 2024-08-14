package com.example.me_one.service;

import com.example.me_one.dto.TbuserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TbuserService {


    public TbuserDto.CreateResDto create(TbuserDto.CreateReqDto param);
    public TbuserDto.CreateResDto update(TbuserDto.UpdateReqDto param);
    public TbuserDto.SelectResDto get(String id);
    public List<TbuserDto.SelectResDto> list(TbuserDto.ListReqDto param);
}

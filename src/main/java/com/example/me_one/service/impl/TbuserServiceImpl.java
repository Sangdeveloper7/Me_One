package com.example.me_one.service.impl;

import com.example.me_one.dto.TbuserDto;
import com.example.me_one.mapper.TbuserMapper;
import com.example.me_one.repository.TbuserRepository;
import com.example.me_one.service.TbuserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbuserServiceImpl implements TbuserService {


    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final TbuserRepository tbuserRepository;
    private final TbuserMapper tbuserMapper;

    public TbuserServiceImpl(
            TbuserRepository tbuserRepository,
            TbuserMapper tbuserMapper
    ) {
        this.tbuserRepository = tbuserRepository;
        this.tbuserMapper = tbuserMapper;
    }

    @Override
    public TbuserDto.CreateResDto create(TbuserDto.CreateReqDto param) {
        return null;
    }

    @Override
    public TbuserDto.CreateResDto update(TbuserDto.UpdateReqDto param) {
        return null;
    }

    @Override
    public TbuserDto.SelectResDto get(String id) {
        return null;
    }

    @Override
    public List<TbuserDto.SelectResDto> list(TbuserDto.ListReqDto param) {
        return null;
    }
}

package com.example.me_one.repository;

import com.example.me_one.dto.CommonDto;

import java.util.List;
import java.util.Map;

//2024-07-12 추가(클래스 처음 추가함)
public interface TbuserRepository {
	/**/
	CommonDto.TbboardDetailResDto detail(String id);
	List<Map<String, Object>> list(Map<String, Object> param);

}
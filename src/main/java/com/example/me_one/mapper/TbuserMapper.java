package com.example.me_one.mapper;

import com.example.me_one.dto.CommonDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

//2024-07-12 추가(클래스 처음 추가함)

@Mapper
public interface TbuserMapper {
	/**/
	CommonDto.TbboardDetailResDto detail(String id);
	List<Map<String, Object>> list(Map<String, Object> param);



}
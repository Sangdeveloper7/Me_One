package com.example.me_one.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

//2024-07-12 추가 클래스
public class CommonDto {

	@Builder
	@Schema
	@Getter
	@Setter
	@AllArgsConstructor
	@NoArgsConstructor
	public static class PostDetailResDto {
		String id;
		String title;
		String content;
		String title2;
	}
	@Builder
	@Schema
	@Getter
	@Setter
	@AllArgsConstructor
	@NoArgsConstructor
	public static class TbboardDetailResDto {
		String id;
		String title;
		String content;
		String writer;
	}

}
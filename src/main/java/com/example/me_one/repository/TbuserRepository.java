package com.example.me_one.repository;

import com.example.me_one.domain.Tbuser;
import com.example.me_one.dto.CommonDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Map;

//2024-07-12 추가(클래스 처음 추가함)
public interface TbuserRepository extends JpaRepository<Tbuser, String> {


}
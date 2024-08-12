package com.example.me_one.controller;

import com.example.me_one.util.FileUpload;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RequestMapping("api")
@RestController
public class LoginRestController {

    @GetMapping("/login")
    public String login(@RequestParam int test1, @RequestParam int test2){
        return "hahah!!! " + test1 + "///" + test2;
    }

    @GetMapping("/add")
    public String add(@RequestParam int test1, @RequestParam int test2){
        int result = test1 + test2;

        return "result : " + result;
    }


//    @GetMapping("/login")
//    public boolean login(@RequestParam String id, @RequestParam String pw){
//        boolean result = false;
//        System.out.println("id : " + id + "// pw" + pw);
//        if("admin".equals(id)){
//            if("abcd1234".equals(pw)){
//                result = true;
//            }
//        }
//
//        return result;
//    }
//
//    @GetMapping("/login2")
//    public Map<String, Object> login2(@RequestParam Map<String, Object> params){
//        Map<String, Object> returnData = new HashMap<String, Object>();
//        boolean result = false;
//        String msg = "";
//        String id = (String) params.get("id");
//        String pw = (String) params.get("pw");
//        System.out.println("id : " + id + "// pw" + pw);
//        if("admin".equals(id)){
//            if("abcd1234".equals(pw)){
//                result = true;
//                msg = "정상 로그인 완료!";
//            } else {
//                msg = "pw 모르면 ㄴㄴ!!";
//            }
//        } else {
//            msg = "id도 모르니?";
//        }
//
//        returnData.put("result", result);
//        returnData.put("msg", msg);
//
//
//        return returnData;
//    }
}

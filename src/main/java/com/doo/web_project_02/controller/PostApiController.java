package com.doo.web_project_02.controller;

import com.doo.web_project_02.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/api")
public class PostApiController {

    @PostMapping("/post-01")
    public void post (@RequestBody Map<String, Object> requestData){
        requestData.forEach((key, value) -> {
            System.out.println("key : " + key);
            System.out.println("value : " + value);
        });
    }
    @PostMapping("/post-02")
    public void post2 (@RequestBody PostRequestDto postRequestDto){
        System.out.println(postRequestDto.toString());
    }
}

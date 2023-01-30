package com.doo.rest_api.controller;

import com.doo.rest_api.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

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

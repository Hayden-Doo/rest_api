package com.doo.rest_api.controller;



import com.doo.rest_api.dto.PutRequestDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put/{id}")
    public PutRequestDto put(@RequestBody PutRequestDto putRequestDto, @PathVariable(name="id") Long userId){
        System.out.println(putRequestDto);
        System.out.println(userId);
        return putRequestDto;
    }
}

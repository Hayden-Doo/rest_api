package com.doo.rest_api.controller;

import com.doo.rest_api.dto.GetRequestDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class GetApiController {

    @GetMapping("/hello")
    public String hello() {
        return "hello spring boot!!";
    }

    @GetMapping(path = "/get-hello")
    public String getHello() {
        return "get-hello !!";
    }

    @RequestMapping(value = "/get-hi", method = RequestMethod.GET)
    public String hi() {
        return "get-hi !!";
    }

    @GetMapping("/get-path-variable/{name}")
    public String pathVariable(@PathVariable(name = "name") String pathName) {
        System.out.println("PathVariable : " + pathName);
        return pathName;
    }

    @GetMapping(path = "get-query-param-01")
    public String queryParam(@RequestParam Map<String, String> queryParam) {

        StringBuilder stringBuilder = new StringBuilder();

        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            stringBuilder.append(entry.getKey() + "=" + entry.getValue() + "\n");
        });
        return stringBuilder.toString();
    }

    @GetMapping("get-query-param-02")
    public String queryParam2(
            @RequestParam String name,
            @RequestParam String add,
            @RequestParam int age
    ) {
        System.out.println(name);
        System.out.println(add);
        System.out.println(age);

        return name + " " + add + " " + age;
    }

    @GetMapping("get-query-param-03")
    public String queryParam3(GetRequestDto getRequestDto) {
        System.out.println(getRequestDto.getName());
        System.out.println(getRequestDto.getAdd());
        System.out.println(getRequestDto.getAge());

        return getRequestDto.toString();
    }
}

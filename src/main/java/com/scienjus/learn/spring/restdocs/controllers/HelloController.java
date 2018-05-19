package com.scienjus.learn.spring.restdocs.controllers;

import com.scienjus.learn.spring.restdocs.models.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public Result hello(@RequestParam("name") String name) {
        return new Result(200 , String.format("Hello %s!", name));
    }
}

package com.museegg.meta.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
@Api("测试")
public class HelloController {

    @PostMapping("/hello")
    @ApiModelProperty("你好")
    public String test() {
        return "hello world";
    }

}

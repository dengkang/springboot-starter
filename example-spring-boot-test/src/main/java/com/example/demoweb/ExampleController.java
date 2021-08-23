package com.example.demoweb;


import com.example.config.ConfigureInfo;
import com.example.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleController {

    @Autowired
    ExampleService exampleService;

    @GetMapping(value = "/config")
    public Object configInfo() {
        // 获取配置信息
        ConfigureInfo configureInfo = exampleService.configInfo();
        // 封装返回
        return configureInfo;
    }

}

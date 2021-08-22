package com.example.service;

import com.example.config.ConfigureInfo;
import org.springframework.stereotype.Service;


@Service
public class ExampleServiceImpl implements ExampleService {

    private String id;

    private String ip;

    private ExampleServiceImpl(){}

    public ExampleServiceImpl(String id, String ip){
        this.id = id;
        this.ip =ip;
    }


    @Override
    public ConfigureInfo configInfo() {

        return ConfigureInfo.builder()
                .id(this.id)
                .ip(this.ip)
                .build();
    }
}

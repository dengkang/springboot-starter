package com.example.config;

import com.example.service.ExampleService;
import com.example.service.ExampleServiceImpl;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.autoconfigure.condition.*;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnWebApplication
@EnableConfigurationProperties(ExampleProperties.class)
@ConditionalOnClass(ExampleService.class)
@Log4j2
public class ExampleAutoConfigure {

    @Bean
    public ExampleService exampleService(){
        log.info("config ExampleService start ...");
        ExampleService exampleService = new ExampleServiceImpl(properties.getId(),properties.getIp());
        log.info("config ExampleService end ...");
        return exampleService;
    }



    private final ExampleProperties properties;

    public ExampleAutoConfigure(ExampleProperties properties){
        this.properties = properties;
    }

}

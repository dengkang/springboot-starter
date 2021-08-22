package com.example.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;



@Data
@ConfigurationProperties(prefix = "com.example.demoweb")
public class ExampleProperties {

    private String id;

    private String ip;
}

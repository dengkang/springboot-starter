package com.example.demoweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.hellostarter","com.example.demoweb","com.example.config"})
public class DemowebApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemowebApplication.class, args);
    }

}

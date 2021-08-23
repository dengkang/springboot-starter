package com.example.demoweb;

import com.example.config.EnableExampleAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableExampleAutoConfigure
public class DemowebApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemowebApplication.class, args);
    }

}

package com.example.config;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class ConfigureInfo implements Serializable {

    private String id;



    private String ip;
}

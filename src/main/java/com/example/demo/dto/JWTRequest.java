package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JWTRequest {
    private String userName;
    private String password;
}

package com.example.demo.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping(value = "/get-test-message")
    public Map<String, Object> getTestMessage(@AuthenticationPrincipal OAuth2User oAuth2User) {
        return oAuth2User.getAttributes();
    }

}

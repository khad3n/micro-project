package com.khde.simpletestclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("test-client")
public class SimpleController {

    @Value("${eureka.instance.instance-id}")
    private String clientId;

    @GetMapping("/test")
    public ResponseEntity<String> getTestResponse() {
        String answer = String.format("Hi from: %s", clientId);
        return ResponseEntity.ok(answer);
    }
}

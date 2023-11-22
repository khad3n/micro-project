package com.khde.simpletestclient.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping("/test")
    public ResponseEntity<String> getTestResponse() {
        return ResponseEntity.ok("Hi from test client");
    }
}

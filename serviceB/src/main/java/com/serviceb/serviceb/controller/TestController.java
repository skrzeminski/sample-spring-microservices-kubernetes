package com.serviceb.serviceb.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class TestController {

    public TestController() {}

    @GetMapping("/serviceB")
    ResponseEntity<String> serviceA() {
        return new ResponseEntity<>("Hello service B!", HttpStatus.OK);
    }

}
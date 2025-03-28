package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/health")
public class HealthCheckController {

    @GetMapping
    public String healthCheck() {
        return "HI THERE!, I am healthy";
    }
}

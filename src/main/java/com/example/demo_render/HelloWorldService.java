package com.example.demo_render;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String getMessage() {
        return "Hello from Spring Boot on Render!";
    }
}
package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController 
public class HelloContoller {
    @GetMapper("/")
    public String home(){
        return "Hello ! spring boot application !";
    }
}

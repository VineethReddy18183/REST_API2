package com.example.string;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class StringController {
    @GetMapping("/")
    public String func()
    {
        return "30-01-2024";
    }
    
}

package com.thoughtworks.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        var result = "Hello World! <br /><br />";
        result += System.getenv().toString();
        return result;
    }
}

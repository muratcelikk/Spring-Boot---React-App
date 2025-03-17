package com.example.springbootreact;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")  // React uygulamasının adresi
public class HomeController {

    @GetMapping("/api/hello")
    public String home(){
        return "Hello World from Spring Boot!!!";
    }
}

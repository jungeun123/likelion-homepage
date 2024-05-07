package com.homepage.likelion.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleTestController {

    // GET http://localhost:8080/api/simpleText/success
    @GetMapping("/api/simpleText/success")
    public String simpleTextSuccess(){
        return "안녕";
    }

}

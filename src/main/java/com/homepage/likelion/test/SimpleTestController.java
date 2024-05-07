package com.homepage.likelion.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/simpleText")
public class SimpleTestController {

    // GET http://localhost:8080/api/simpleText/success
    @GetMapping("/success")
    public String simpleTextSuccess(){
        return "안녕";
    }

    // GET http://localhost:8080/api/simpleText/success
    @GetMapping("/fail")
    public String simpleTextFail(){
        return "안녕";
    }

}

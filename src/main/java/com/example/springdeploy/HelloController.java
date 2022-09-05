package com.example.springdeploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${app.mesagge}")
    String mesagge;

    @GetMapping("/helloword")
    public String helloWord(){
        System.out.println(mesagge);
        return "Hello Word! desde spring con autosave!!";
    }


}

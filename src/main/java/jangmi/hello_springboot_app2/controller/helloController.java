package jangmi.hello_springboot_app2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello world!!";
    }

}

package com.estudos.demo.controller;

import com.estudos.demo.Entitys.User;
import com.estudos.demo.services.HelloWorldService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    private HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService){
        this.helloWorldService = helloWorldService;
    }

    @GetMapping("/{id}")
    public String helloWorld(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "nenhum") String filter , @RequestBody User user){
        return "Hello World!";
    }
}

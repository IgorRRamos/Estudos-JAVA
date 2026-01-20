package com.estudos.demo.services;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    private String nome(String nome){
        return "Hello World " + nome;
    }
}

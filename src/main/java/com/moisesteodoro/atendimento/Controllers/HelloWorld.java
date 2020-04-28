package com.moisesteodoro.atendimento.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorld {

    @GetMapping(produces = "text/plain")
    public String helloworld(){
         return "HELLO WORLD";
     }

}
package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloUserController {

    @RequestMapping("/greeting2")
    public Greeting greeting2(@RequestParam("name") String name) {
        return new Greeting(3, "Hola, " + name + "!");
    }
}


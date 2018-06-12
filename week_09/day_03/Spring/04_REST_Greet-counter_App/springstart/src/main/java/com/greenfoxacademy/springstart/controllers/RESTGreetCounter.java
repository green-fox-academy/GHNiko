package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class RESTGreetCounter {

    AtomicLong id = new AtomicLong(0);

    @RequestMapping("/greeting3")
    public Greeting greeting3(@RequestParam("name") String name) {
        id.incrementAndGet();
        Greeting greeting3 = new Greeting(id, "Hola, " + name + "!");
        return greeting3;
    }
}
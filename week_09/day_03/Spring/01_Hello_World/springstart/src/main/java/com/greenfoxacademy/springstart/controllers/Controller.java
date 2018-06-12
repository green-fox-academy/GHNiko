package com.greenfoxacademy.springstart.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class Controller {

    @RequestMapping("/kittens")
    public ArrayList<String> getKittyNames(){
        return new ArrayList<String>(
                Arrays.asList(
                        "Mr. Kitten",
                        "Tiger"
                )
        );
    }
}

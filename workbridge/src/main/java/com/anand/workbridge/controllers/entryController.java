package com.anand.workbridge.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class entryController {

    @GetMapping("/testApp")
    public String testMethod(){

        return "Saurav testing";
    }
}

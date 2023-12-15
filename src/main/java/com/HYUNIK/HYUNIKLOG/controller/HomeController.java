package com.HYUNIK.HYUNIKLOG.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String Hello() {
        return "Hello CI/CD";
    }
}

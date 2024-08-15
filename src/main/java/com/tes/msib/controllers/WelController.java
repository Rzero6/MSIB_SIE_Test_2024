package com.tes.msib.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/welcome")
public class WelController {

    @GetMapping
    public String welcome() {
        return "WElocmoe";
    }

}

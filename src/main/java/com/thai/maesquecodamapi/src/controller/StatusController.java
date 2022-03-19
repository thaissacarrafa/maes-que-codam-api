package com.thai.maesquecodamapi.src.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping(path = "/api/status")
    public String check () {
        return "Seu servidor está Online";
    }

}


package com.seeyouthere.mockapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransportController {

    @GetMapping("/search/address.json")
    public String coordinate() {
        return "1";
    }
}

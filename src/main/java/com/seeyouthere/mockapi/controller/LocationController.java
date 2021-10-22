package com.seeyouthere.mockapi.controller;

import com.seeyouthere.mockapi.domain.ResponseLocationExamples;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2/local")
public class LocationController {

    @GetMapping("/search/address.json")
    public String coordinate() {
        return ResponseLocationExamples.COORDINATE.getCoordinate();
    }

    @GetMapping("/geo/coord2regioncode.json")
    public String location() {
        return "hi";
    }

    @GetMapping("/search/keyboard.json")
    public String search() {
        return "bye";
    }

    @GetMapping("/search/category.json")
    public String utility() {
        return "hi";
    }
}

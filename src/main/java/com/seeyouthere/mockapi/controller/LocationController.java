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
        return ResponseLocationExamples.COORDINATE.getData();
    }

    @GetMapping("/geo/coord2regioncode.json")
    public String location() {
        return ResponseLocationExamples.LOCATION.getData();
    }

    @GetMapping("/search/keyword.json")
    public String search() {
        return ResponseLocationExamples.KEYWORD.getData();
    }

    @GetMapping("/search/category.json")
    public String utility() {
        return ResponseLocationExamples.CATEGORY.getData();
    }
}

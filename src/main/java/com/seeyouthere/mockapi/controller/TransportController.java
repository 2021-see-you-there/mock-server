package com.seeyouthere.mockapi.controller;

import com.seeyouthere.mockapi.domain.ResponseTransportExamples;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_XML_VALUE)
public class TransportController {

    @GetMapping(value = "/getPathInfoBySubway")
    public String subway() {
        return ResponseTransportExamples.SUBWAY.getData();
    }

    @GetMapping(value = "/getPathInfoByBus")
    public String bus() {
        return ResponseTransportExamples.BUS.getData();
    }

    @GetMapping(value = "/getPathInfoByBusNSub")
    public String busNSubway() {
        return ResponseTransportExamples.BUSNSUBWAY.getData();
    }
}

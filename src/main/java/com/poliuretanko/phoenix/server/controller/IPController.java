package com.poliuretanko.phoenix.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.UnknownHostException;

@RestController
public class IPController {

    @GetMapping("/ip/{value}")
    public String getIP(@PathVariable String value) throws UnknownHostException {
        //TODO get from cache
        return null;
    }

    @PostMapping("/ip/{value}")
    public String createIP(@PathVariable String value) throws UnknownHostException {
        //TODO create in cache
        return null;
    }
}

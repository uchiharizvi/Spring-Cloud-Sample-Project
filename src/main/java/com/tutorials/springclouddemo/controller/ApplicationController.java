package com.tutorials.springclouddemo.controller;

import com.tutorials.springclouddemo.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/spring-cloud")
@RestController
public class ApplicationController {
    @Autowired
    private ApplicationService service;

    @GetMapping("/data")
    public String getData() throws Exception {
        return service.getData();
    }
}

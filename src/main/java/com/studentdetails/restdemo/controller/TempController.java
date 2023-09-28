package com.studentdetails.restdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temp")
public class TempController {

    @GetMapping("/getTemp")
    public String getTemp(String val) {
        return "hello: " +val+" ji nikhil";
    }

}

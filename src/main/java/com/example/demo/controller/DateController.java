package com.example.demo.controller;

import com.example.demo.service.DateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping("/api")
public class DateController {

    private final DateService dateService;

    @Autowired
    public DateController(DateService dateService) {
        this.dateService = dateService;
    }

    @GetMapping("/time")
    public LocalTime getTime() {
        return dateService.getTime();
    }

    @GetMapping("/date")
    public String getDate(@RequestParam(required = false) String format) {
        return dateService.getDate(format);
    }
}

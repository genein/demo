package com.example.demo.controller;

import com.example.demo.domain.Country;
import com.example.demo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {
    @Autowired
    private CountryService countryService;

    @RequestMapping("/countries")
    public List<Country> countries() {
        return countryService.selectAll();
    }

    @RequestMapping("/country/{name}")
    public Country country(@PathVariable String name) {
        return countryService.selectByName(name);
    }
}

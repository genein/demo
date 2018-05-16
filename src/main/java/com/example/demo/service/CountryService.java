package com.example.demo.service;

import com.example.demo.mapper.CountryMapper;
import com.example.demo.domain.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryMapper countryMapper;

    public List<Country> selectAll() {
        return countryMapper.selectAll();
    }

    public Country selectByName(String name) {
        return countryMapper.selectByCountryName(name);
    }

}

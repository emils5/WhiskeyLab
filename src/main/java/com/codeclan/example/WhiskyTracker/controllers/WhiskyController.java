package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/whiskies")
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;

    @Autowired
    DistilleryRepository distilleryRepository;

    @GetMapping(value = "/year/{year}")
    public List<Whisky> findByYear(@PathVariable int year){
        return whiskyRepository.findByYear(year);
    }

    @GetMapping(value = "/region/{region")
    public List<Whisky> getAllWhiskiesFromRegions(@PathVariable String region){
        return whiskyRepository.getAllWhiskiesFromRegions(region);
    }

    @GetMapping(value = "/age/{age}/distilleries")
    public List<Distillery> getWhiskyByAge(@PathVariable int age){
        return distilleryRepository.getWhiskyByAge(age);
    }

}

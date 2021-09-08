package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class DistilleryController {

    @Autowired
    DistilleryRepository distilleryRepository;

    @Autowired
    WhiskyRepository whiskyRepository;

    @GetMapping(value = "/region/{region}")
    public List<Distillery> findByRegion(@PathVariable String region){
        return distilleryRepository.findByRegion(region);
    }

    @GetMapping(value = "/{id}/whiskies/age/{age}")
    public List<Whisky> getDistilleriesForCertainWhiskyAge(@PathVariable Long id, @PathVariable int age){
        return whiskyRepository.getDistilleriesForCertainWhiskyAge(id, age);
    }


}

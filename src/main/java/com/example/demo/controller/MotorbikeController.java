package com.example.demo.controller;

import com.example.demo.model.Motorbike;
import com.example.demo.service.MotorbikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MotorbikeController {

    @Autowired
    private MotorbikeService motorbikeService;

    @RequestMapping("/getAllMotorbike")
    public List<Motorbike> getAllMotorbikeList(){
        return motorbikeService.getAllMotorbikeList();
    }

}

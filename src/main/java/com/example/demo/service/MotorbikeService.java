package com.example.demo.service;

import com.example.demo.model.Motorbike;
import com.example.demo.repository.MotorbikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotorbikeService {

    @Autowired
    private MotorbikeRepository motorbikeRepository;

    @Autowired
    public List<Motorbike> getAllMotorbikeList(){
        return motorbikeRepository.findAll();
    }

    public List<Motorbike> getByVehiclePlateNumber(String vehiclePlateNumber) {
        return (List<Motorbike>) motorbikeRepository.findByVehiclePlateNumber(vehiclePlateNumber);

    }
}

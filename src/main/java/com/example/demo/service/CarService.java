package com.example.demo.service;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    public List<Car> getAllCarList(){
        return carRepository.findAll();
    }

    public List<Car> getByVehiclePlateNumber(String vehiclePlateNumber) {
        return (List<Car>) carRepository.findByVehiclePlateNumber(vehiclePlateNumber);

    }
}

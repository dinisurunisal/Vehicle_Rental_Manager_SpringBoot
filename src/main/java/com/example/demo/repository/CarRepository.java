package com.example.demo.repository;

import com.example.demo.model.Car;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends MongoRepository<Car, String> {

    public Car findByVehiclePlateNumber(String vehiclePlateNumber);

}

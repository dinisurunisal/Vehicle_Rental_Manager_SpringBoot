package com.example.demo.repository;

import com.example.demo.model.Motorbike;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MotorbikeRepository extends MongoRepository<Motorbike, String> {

    public Motorbike findByVehiclePlateNumber(String vehiclePlateNumber);

}

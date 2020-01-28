package com.example.demo.repository;

import com.example.demo.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Customer11Repository extends MongoRepository<Customer, String> {
}

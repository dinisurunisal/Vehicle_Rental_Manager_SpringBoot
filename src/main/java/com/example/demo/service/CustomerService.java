package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CarRepository;
import com.example.demo.repository.Customer11Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private Customer11Repository customer11Repository;

    public List<Customer> getAll() {
        return customer11Repository.findAll();
    }



}

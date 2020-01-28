package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.repository.Customer11Repository;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CustomerController {

    @Autowired
    private Customer11Repository customer11Repository;

    @Autowired
    private CustomerService customerService;

    @PostMapping("/addNewBooking")
    public Customer sendCustomer(@RequestBody Customer customer){
        customer11Repository.save(customer);
        return customer;
    }
}

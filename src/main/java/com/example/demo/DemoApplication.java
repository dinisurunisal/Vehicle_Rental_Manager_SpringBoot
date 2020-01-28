package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    //http://localhost:8080/create?make=2&model=2&vehiclePlateNumber=2&yearOfManufacture=2&vehicleColor=1&seatCapacity=1&transmission=1&fuelType=1&engineCapacity=1&availability=true&rentalFee=1

}

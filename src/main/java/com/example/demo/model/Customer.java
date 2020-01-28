package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bookCust_database")
public class Customer {
    @Id
    String firstName ;
    String surname ;
    String email ;
    String nic ;
    String plateNumber;
    String make;
    String model;
    String pickup;
    String dropoff;

    public Customer(String firstName, String surname, String email, String nic, String plateNumber, String make, String model, String pickup, String dropoff) {
        this.firstName = firstName;
        this.surname = surname;
        this.email = email;
        this.nic = nic;
        this.plateNumber = plateNumber;
        this.make = make;
        this.model = model;
        this.pickup = pickup;
        this.dropoff = dropoff;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPickup() {
        return pickup;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public String getDropoff() {
        return dropoff;
    }

    public void setDropoff(String dropoff) {
        this.dropoff = dropoff;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", nic='" + nic + '\'' +
                ", plateNumber='" + plateNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", pickup='" + pickup + '\'' +
                ", dropoff='" + dropoff + '\'' +
                '}';
    }
}

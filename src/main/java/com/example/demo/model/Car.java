package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(collection = "car_database")
public class Car {

    @Id
    String id;
    String vehiclePlateNumber;
    String make;
    String model;
    String type;
    int yearOfManufacture;
    String vehicleColor;
    int seatCapacity;
    String transmission;
    String fuelType;
    int engineCapacity;
    boolean availability;
    BigDecimal rentalFee;
    int noOfDoors;
    boolean airCondition;
    boolean dvdPlayer;
    boolean spareWheel;

    public Car(String vehiclePlateNumber,String make, String model, String type, int yearOfManufacture, String vehicleColor, int seatCapacity, String transmission, String fuelType, int engineCapacity, boolean availability, BigDecimal rentalFee, int noOfDoors, boolean airCondition, boolean dvdPlayer, boolean spareWheel) {
        this.vehiclePlateNumber = vehiclePlateNumber;
        this.make = make;
        this.model = model;
        this.type = type;
        this.yearOfManufacture = yearOfManufacture;
        this.vehicleColor = vehicleColor;
        this.seatCapacity = seatCapacity;
        this.transmission = transmission;
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
        this.availability = availability;
        this.rentalFee = rentalFee;
        this.noOfDoors = noOfDoors;
        this.airCondition = airCondition;
        this.dvdPlayer = dvdPlayer;
        this.spareWheel = spareWheel;
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

    public String getVehiclePlateNumber() {
        return vehiclePlateNumber;
    }

    public void setVehiclePlateNumber(String vehiclePlateNumber) {
        this.vehiclePlateNumber = vehiclePlateNumber;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public BigDecimal getRentalFee() {
        return rentalFee;
    }

    public void setRentalFee(BigDecimal rentalFee) {
        this.rentalFee = rentalFee;
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public boolean isAirCondition() {
        return airCondition;
    }

    public void setAirCondition(boolean airCondition) {
        this.airCondition = airCondition;
    }

    public boolean isDvdPlayer() {
        return dvdPlayer;
    }

    public void setDvdPlayer(boolean dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    public boolean isSpareWheel() {
        return spareWheel;
    }

    public void setSpareWheel(boolean spareWheel) {
        this.spareWheel = spareWheel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                ", vehiclePlateNumber='" + vehiclePlateNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", vehicleColor='" + vehicleColor + '\'' +
                ", seatCapacity=" + seatCapacity +
                ", transmission='" + transmission + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", availability=" + availability +
                ", rentalFee=" + rentalFee +
                ", noOfDoors=" + noOfDoors +
                ", airCondition=" + airCondition +
                ", dvdPlayer=" + dvdPlayer +
                ", spareWheel=" + spareWheel +
                '}';
    }
}

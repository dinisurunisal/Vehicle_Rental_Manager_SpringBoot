package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(collection = "motorbike_database")
public class Motorbike {

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
    boolean helmetAvailability;
    boolean bikeTrunkCaseAvailability;
    boolean bikeJacketAvailability;

    public Motorbike(String vehiclePlateNumber, String make, String model, String type, int yearOfManufacture, String vehicleColor, int seatCapacity, String transmission, String fuelType, int engineCapacity, boolean availability, BigDecimal rentalFee, boolean helmetAvailability, boolean bikeTrunkCaseAvailability, boolean bikeJacketAvailability) {
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
        this.helmetAvailability = helmetAvailability;
        this.bikeTrunkCaseAvailability = bikeTrunkCaseAvailability;
        this.bikeJacketAvailability = bikeJacketAvailability;
    }

    public String getVehiclePlateNumber() {
        return vehiclePlateNumber;
    }

    public void setVehiclePlateNumber(String vehiclePlateNumber) {
        this.vehiclePlateNumber = vehiclePlateNumber;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public boolean isHelmetAvailability() {
        return helmetAvailability;
    }

    public void setHelmetAvailability(boolean helmetAvailability) {
        this.helmetAvailability = helmetAvailability;
    }

    public boolean isBikeTrunkCaseAvailability() {
        return bikeTrunkCaseAvailability;
    }

    public void setBikeTrunkCaseAvailability(boolean bikeTrunkCaseAvailability) {
        this.bikeTrunkCaseAvailability = bikeTrunkCaseAvailability;
    }

    public boolean isBikeJacketAvailability() {
        return bikeJacketAvailability;
    }

    public void setBikeJacketAvailability(boolean bikeJacketAvailability) {
        this.bikeJacketAvailability = bikeJacketAvailability;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
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
                ", helmetAvailability=" + helmetAvailability +
                ", bikeTrunkCaseAvailability=" + bikeTrunkCaseAvailability +
                ", bikeJacketAvailability=" + bikeJacketAvailability +
                '}';
    }
}

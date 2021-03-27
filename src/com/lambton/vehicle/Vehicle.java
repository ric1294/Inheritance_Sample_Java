package com.lambton.vehicle;

import com.lambton.Gender;
import com.lambton.Person;

public class Vehicle extends Person {

    int VIN;
    String brand;
    Boolean isInsured;

    public Vehicle(int id, String firstname, String lastname, Gender gender, Vehicle vehicle, int VIN, String brand, Boolean isInsured) {
        super(id, firstname, lastname, gender, vehicle);
        this.VIN = VIN;
        this.brand = brand;
        this.isInsured = isInsured;
    }

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Boolean getInsured() {
        return isInsured;
    }

    public void setInsured(Boolean insured) {
        isInsured = insured;
    }
}

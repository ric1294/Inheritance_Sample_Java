package com.lambton.vehicle;

import com.lambton.Gender;
import com.lambton.vehicle.Color;
import com.lambton.vehicle.Vehicle;

public class Car extends Vehicle {
    Color color;

    public Car(int id, String firstname, String lastname, Gender gender, Vehicle vehicle, int VIN, String brand, Boolean isInsured, Color color) {
        super(id, firstname, lastname, gender, vehicle, VIN, brand, isInsured);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

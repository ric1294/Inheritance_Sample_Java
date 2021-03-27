package com.lambton.employee;

import com.lambton.Gender;
import com.lambton.vehicle.Vehicle;

public class FullTime extends Employee{
    double bonus;

    public FullTime(int id, String firstname, String lastname, Gender gender, Vehicle vehicle, double totalSalary, double bonus) {
        super(id, firstname, lastname, gender, vehicle, totalSalary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }



}

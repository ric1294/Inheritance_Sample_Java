package com.lambton.employee;

import com.lambton.Gender;
import com.lambton.Person;
import com.lambton.vehicle.Vehicle;

public class Employee extends Person {

    double totalSalary;

    public Employee(int id, String firstname, String lastname, Gender gender, Vehicle vehicle, double totalSalary) {
        super(id, firstname, lastname, gender, vehicle);
        this.totalSalary = totalSalary;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }
}

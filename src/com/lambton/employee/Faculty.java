package com.lambton.employee;

import com.lambton.Gender;
import com.lambton.vehicle.Vehicle;

public class Faculty extends Employee{

    String department;

    public Faculty(int id, String firstname, String lastname, Gender gender, Vehicle vehicle, double totalSalary, String department) {
        super(id, firstname, lastname, gender, vehicle, totalSalary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

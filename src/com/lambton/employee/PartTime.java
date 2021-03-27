package com.lambton.employee;

import com.lambton.Gender;
import com.lambton.vehicle.Vehicle;

public class PartTime extends Employee{
    int noHoursWorked;
    double payPerHour;

    public PartTime(int id, String firstname, String lastname, Gender gender, Vehicle vehicle, double totalSalary, int noHoursWorked, double payPerHour) {
        super(id, firstname, lastname, gender, vehicle, totalSalary);
        this.noHoursWorked = noHoursWorked;
        this.payPerHour = payPerHour;
    }

    public int getNoHoursWorked() {
        return noHoursWorked;
    }

    public void setNoHoursWorked(int noHoursWorked) {
        this.noHoursWorked = noHoursWorked;
    }

    public double getPayPerHour() {
        return payPerHour;
    }

    public void setPayPerHour(double payPerHour) {
        this.payPerHour = payPerHour;
    }
}

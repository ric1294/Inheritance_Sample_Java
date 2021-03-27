package com.lambton.student;

import com.lambton.Gender;

import com.lambton.vehicle.Vehicle;

public class PartTime extends Student {

    int noWeeklyClasses;

    public PartTime(int id, String firstname, String lastname, Gender gender, Vehicle vehicle, String collegeName, String courseName, String result, int noWeeklyClasses) {
        super(id, firstname, lastname, gender, vehicle, collegeName, courseName, result);
        this.noWeeklyClasses = noWeeklyClasses;
    }

    public int getNoWeeklyClasses() {
        return noWeeklyClasses;
    }

    public void setNoWeeklyClasses(int noWeeklyClasses) {
        this.noWeeklyClasses = noWeeklyClasses;
    }
}

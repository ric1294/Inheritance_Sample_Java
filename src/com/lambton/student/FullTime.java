package com.lambton.student;

import com.lambton.Gender;
import com.lambton.student.Student;
import com.lambton.vehicle.Vehicle;

public class FullTime extends Student {
    int attendance;

    public FullTime(int id, String firstname, String lastname, Gender gender, Vehicle vehicle, String collegeName, String courseName, String result, int attendance) {
        super(id, firstname, lastname, gender, vehicle, collegeName, courseName, result);
        this.attendance = attendance;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }
}

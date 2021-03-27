package vehicle;

import com.lambton.Gender;
import com.lambton.vehicle.Vehicle;

public class MotorCycle extends Vehicle {
    int noOfSeats;

    public MotorCycle(int id, String firstname, String lastname, Gender gender, Vehicle vehicle, int VIN, String brand, Boolean isInsured, int noOfSeats) {
        super(id, firstname, lastname, gender, vehicle, VIN, brand, isInsured);
        this.noOfSeats = noOfSeats;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }
}

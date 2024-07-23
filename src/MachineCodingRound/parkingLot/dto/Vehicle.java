package MachineCodingRound.parkingLot.dto;

import MachineCodingRound.parkingLot.enums.VehicleType;

public class Vehicle {
    VehicleType vehicleType;
    String color;
    String registrationNumber;

    public Vehicle(VehicleType vehicleType, String color, String registrationNumber) {
        this.vehicleType = vehicleType;
        this.color = color;
        this.registrationNumber = registrationNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}

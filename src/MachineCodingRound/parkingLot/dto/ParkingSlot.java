package MachineCodingRound.parkingLot.dto;

import MachineCodingRound.parkingLot.enums.ParkingSlotStatus;
import MachineCodingRound.parkingLot.enums.VehicleType;

public class ParkingSlot {
    int id;
    VehicleType vehicleType;
    ParkingSlotStatus parkingSlotStatus;
    int floorNumber;

    public ParkingSlot(int id, VehicleType vehicleType, ParkingSlotStatus parkingSlotStatus, int floorNumber) {
        this.id = id;
        this.vehicleType = vehicleType;
        this.parkingSlotStatus = parkingSlotStatus;
        this.floorNumber = floorNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ParkingSlotStatus getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public void setParkingSlotStatus(ParkingSlotStatus parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }



}

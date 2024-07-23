package MachineCodingRound.parkingLot.dto;

import java.util.List;

public class ParkingFloor {
    int floorNumber;
    String parkingLot_id;
    List<ParkingSlot> parkingSlotList;

    public ParkingFloor(int floorNumber, String parkingLot_id, List<ParkingSlot> parkingSlotList) {
        this.floorNumber = floorNumber;
        this.parkingLot_id = parkingLot_id;
        this.parkingSlotList = parkingSlotList;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public String getParkingLot_id() {
        return parkingLot_id;
    }

    public void setParkingLot_id(String parkingLot_id) {
        this.parkingLot_id = parkingLot_id;
    }

    public List<ParkingSlot> getParkingSlotList() {
        return parkingSlotList;
    }

    public void setParkingSlotList(List<ParkingSlot> parkingSlotList) {
        this.parkingSlotList = parkingSlotList;
    }
}

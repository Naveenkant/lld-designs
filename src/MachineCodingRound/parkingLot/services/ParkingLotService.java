package MachineCodingRound.parkingLot.services;

import MachineCodingRound.parkingLot.dto.ParkingFloor;
import MachineCodingRound.parkingLot.dto.ParkingLot;
import MachineCodingRound.parkingLot.dto.ParkingSlot;
import MachineCodingRound.parkingLot.enums.VehicleType;
import MachineCodingRound.parkingLot.repository.ParkingDataRepository;

import java.util.List;

public class ParkingLotService {
    /*
    create Parking lot
    park vehicle
    unpark vehicle
    display slots
     */
    ParkingLot parkingLot;
    ParkingDataRepository parkingDataRepository = ParkingDataRepository.getInstance();

    public void createParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
        this.parkingLot.setParkingFloors(parkingDataRepository.initializeData(
                parkingLot.getNoOfFloors(), parkingLot.getNoOfSlotsPerFloor()));

        System.out.println("Created parking lot with " + parkingLot.getNoOfFloors() +
                "floors and " + parkingLot.getNoOfSlotsPerFloor() + " slots per floor");
    }

    public void parkVehicle(VehicleType vehicleType, String color, String registrationNo) {


    }
//    public ParkingSlot getFirstAvailalbeParkingSlot() {
//        List<ParkingFloor>parkingFloorList=parkingLot.getParkingFloors();
//
//        for(ParkingFloor parkingFloor:parkingFloorList){
//            List<ParkingSlot>parkingSlotList=parkingFloorList.getLast().getParkingSlotList();
//        }
//
//}
}

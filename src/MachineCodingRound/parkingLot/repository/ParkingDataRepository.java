package MachineCodingRound.parkingLot.repository;

import MachineCodingRound.parkingLot.dto.ParkingFloor;
import MachineCodingRound.parkingLot.dto.ParkingSlot;
import MachineCodingRound.parkingLot.enums.ParkingSlotStatus;
import MachineCodingRound.parkingLot.enums.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingDataRepository {
   private static ParkingDataRepository instance ;
   List<ParkingFloor> parkingFloors;
   List<ParkingSlot>parkingSlotData;
   private ParkingDataRepository() {
       parkingFloors = new ArrayList<ParkingFloor>();
   }
   public static ParkingDataRepository getInstance() {
       if (instance == null) {
           instance = new ParkingDataRepository();
       }
       return instance;
   }

    public List<ParkingFloor> initializeData(int noOfFloors,int noOfSlots) {
        parkingFloors = new  ArrayList<>(noOfFloors);
        for(int i=0;i<noOfFloors;i++){
            initializeSlots(noOfSlots,(i+1));
            List<ParkingSlot> parkingSlots = getAllParkingSlotData(i);
            parkingFloors.add(new ParkingFloor((i+1),"",parkingSlots));
        }
        return parkingFloors;
    }

    public void initializeSlots(int noOfSlots,int floorNo) {
        parkingSlotData = new  ArrayList<>(noOfSlots);
        if(noOfSlots>=1)
            parkingSlotData.add(getTruckData(0,floorNo));
        if(noOfSlots>=3)
            for(int i=1;i<3;i++)
                parkingSlotData.add(getBikeData(i,floorNo));
        if(noOfSlots>3)
            for(int i=3;i<noOfSlots;i++){
                parkingSlotData.add(getCarData(i,floorNo));
            }
    }

    public List<ParkingSlot> getAllParkingSlotData(int floorNo){
        parkingSlotData.forEach(parkingSlot -> parkingSlot.setFloorNumber(floorNo));
        return parkingSlotData;
    }

    private ParkingSlot getTruckData(int id,int floorNo){
        return new ParkingSlot(id, VehicleType.TRUCK, ParkingSlotStatus.FREE, floorNo);
    }
    private ParkingSlot getBikeData(int id,int floorNo){
        return new ParkingSlot(id,VehicleType.BIKE, ParkingSlotStatus.FREE,floorNo);
    }
    private ParkingSlot getCarData(int id,int floorNo){
        return new ParkingSlot(id,VehicleType.CAR, ParkingSlotStatus.FREE,floorNo);
    }
}

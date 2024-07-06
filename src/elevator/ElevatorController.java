package elevator;
import java.util.*;
public class ElevatorController {
    List<ElevatorCar>elevatorCarList;

    public ElevatorController(int numberOfFloors,int numberOfElevators) {
        Display display=new Display(Direction.NO_DIRECTION,0);
        for(int i=0;i<numberOfElevators;i++) {
            elevatorCarList.add(new ElevatorCar("1",10,display));
        }
    }
    public void requestElevator(int sourceFloor, int destinationFloor){
        Request request=new Request(sourceFloor,destinationFloor);
        ElevatorCar elevatorCar=getNearestElevator(request);
        if(elevatorCar!=null) {
            elevatorCar.addRequest(request);
        }
    }
    public ElevatorCar getNearestElevator(Request request) {
        ElevatorCar elevatorCar=null;
        int startFloor=request.getCurrent();
        int effectiveElevator =0;
        int min=10000000;
        for(int i=0;i<elevatorCarList.size();i++) {
            if(min>(Math.abs(elevatorCarList.get(i).currentFloor-startFloor))){
                min=Math.abs(elevatorCarList.get(i).currentFloor-startFloor);
                effectiveElevator=i;
            }
        }
        return elevatorCarList.get(effectiveElevator);

    }

}

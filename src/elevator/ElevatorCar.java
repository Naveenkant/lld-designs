package elevator;
import java.util.*;
public class ElevatorCar {
    String elevatorId;
    int currentFloor;
    int capacity;
    Display display;
    DoorStatus doorStatus;
    List<Request>requests;
    ElevatorStatus elevatorStatus;

    public ElevatorCar(String elevatorId, int capacity, Display display) {
        this.elevatorId = elevatorId;
        this.capacity = capacity;
        this.display = display;
    }
    public synchronized void addRequest(Request request){
        if (requests.size()<capacity) {
            requests.add(request);
        }
    }
    public synchronized void getNextRequest(){
        if (requests.size()>0) {
            processRequest();
        }else{
            System.out.println("wait for request");
        }
    }
    public void processRequest(){
        Request currentRequest = requests.get(0);
        int startFloor=display.currentFloor;
        int endFloor=currentRequest.destination;

        if(startFloor<endFloor){
            display.direction=Direction.UPWARDS;
            for (int i = startFloor; i <= endFloor; i++) {
                display.currentFloor=i;
                elevatorStatus=ElevatorStatus.MOVING;
                doorStatus=DoorStatus.CLOSED;
                System.out.println("Elevator " + elevatorId + " reached floor " + i);
                try {
                    Thread.sleep(1000); // Simulating elevator movement
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            elevatorStatus=ElevatorStatus.STOPPED;
            doorStatus=DoorStatus.OPEN;

        }else{
            display.direction=Direction.DOWNWARDS;
            for (int i = startFloor; i <= endFloor; i++) {
                display.currentFloor=i;
                elevatorStatus=ElevatorStatus.MOVING;
                doorStatus=DoorStatus.CLOSED;

                System.out.println("Elevator " + elevatorId + " reached floor " + i);
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            elevatorStatus=ElevatorStatus.STOPPED;
            doorStatus=DoorStatus.OPEN;

        }

    }

}

package elevator;

public class MainClass {

    public static void main(String[] args) {
        ElevatorController elevatorController=new ElevatorController(10,5);
        elevatorController.requestElevator(3,4);
        elevatorController.requestElevator(4,5);
        elevatorController.requestElevator(1,8);
    }
}

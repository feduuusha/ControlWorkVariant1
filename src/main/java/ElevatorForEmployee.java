public class ElevatorForEmployee extends Elevator {
    public ElevatorForEmployee(int capacity, int maxLoad, int speed, int maxFloor) {
        super(capacity, maxLoad, speed, maxFloor);
        availableFloors = new int[maxFloor];
        for (int i = 0; i < maxFloor; i++) {
            availableFloors[i] = i + 1;
        }
    }
}

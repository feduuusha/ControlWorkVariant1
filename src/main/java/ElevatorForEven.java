public class ElevatorForEven extends Elevator {
    public ElevatorForEven(int capacity, int maxLoad, int speed, int maxFloor) {
        super(capacity, maxLoad, speed, maxFloor);
        availableFloors = new int[maxFloor / 2];
        int counter = 0;
        for (int i = 2; i <= maxFloor; i += 2) {
            availableFloors[counter] = i;
            counter++;
        }
    }
}

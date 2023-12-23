public class ElevatorForOdd extends Elevator {
    public ElevatorForOdd(int capacity, int maxLoad, int speed, int maxFloor) {
        super(capacity, maxLoad, speed, maxFloor);
        availableFloors = new int[(maxFloor + 1) / 2];
        int counter = 0;
        for (int i = 1; i <= maxFloor; i += 2) {
            availableFloors[counter] = i;
            counter++;
        }
    }
}

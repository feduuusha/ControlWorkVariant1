import java.util.Arrays;

public abstract class Elevator {
    final int capacity;
    final int maxLoad;
    final int speed;
    int[] availableFloors;
    final int maxFloor;
    Status status = Status.FREE;

    public Elevator(int capacity, int maxLoad, int speed, int maxFloor) {
        this.capacity = capacity;
        this.maxLoad = maxLoad;
        this.speed = speed;
        this.maxFloor = maxFloor;
    }

    @Override
    public String toString() {
        return "Elevator{" +
                "capacity=" + capacity +
                ", maxLoad=" + maxLoad +
                ", speed=" + speed +
                ", availableFloors=" + Arrays.toString(availableFloors) +
                ", maxFloor=" + maxFloor +
                ", status=" + status +
                '}';
    }
}

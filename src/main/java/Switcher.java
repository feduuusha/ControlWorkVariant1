public class Switcher implements IFree {
    private Node head;

    public Switcher() {
    }

    public void addElevator(Elevator elevator) {
        Node node = new Node(elevator);
        if (head == null) {
            head = node;
            head.next = head;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = node;
            node.next = head;
        }
    }

    public Elevator free() throws NoElevatorsAvailableException {
        Node current = head;
        while (current.elevator.status != Status.FREE) {
            if (current.next == head) throw new NoElevatorsAvailableException("All elevators are occupied");
            current = current.next;
        }
        current.elevator.status = Status.BUSY;
        return current.elevator;
    }
}

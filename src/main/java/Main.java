public class Main {
    static Switcher switcherForEven = new Switcher();
    static Switcher switcherForOdd = new Switcher();
    static Switcher switcherForEmployee = new Switcher();

    public static void main(String[] args) {
//        Создание лифтов для чётных этажей
        ElevatorForEven elevatorForEven1 = new ElevatorForEven(12, 500, 5, 16);
        ElevatorForEven elevatorForEven2 = new ElevatorForEven(8, 350, 10, 16);
        ElevatorForEven elevatorForEven3 = new ElevatorForEven(16, 700, 7, 16);
//        Создание лифтов для нечётных этажей
        ElevatorForOdd elevatorForOdd1 = new ElevatorForOdd(7, 450, 6, 16);
        ElevatorForOdd elevatorForOdd2 = new ElevatorForOdd(9, 600, 8, 16);
        ElevatorForOdd elevatorForOdd3 = new ElevatorForOdd(13, 800, 4, 16);
//        Создание лифта для сотрудников
        ElevatorForEmployee elevatorForEmployee = new ElevatorForEmployee(20, 1000, 20, 16);
//        Добавление лифтов в связный список
        switcherForEven.addElevator(elevatorForEven1);
        switcherForEven.addElevator(elevatorForEven2);
        switcherForEven.addElevator(elevatorForEven3);

        switcherForOdd.addElevator(elevatorForOdd1);
        switcherForOdd.addElevator(elevatorForOdd2);
        switcherForOdd.addElevator(elevatorForOdd3);

        switcherForEmployee.addElevator(elevatorForEmployee);
//        Оформление 20 вызовов
        for (int i = 0; i < 20; ++i) {
            Elevator elevator = null;
            try {
                switch (i%3) {
                    case 0:
                        elevator = chooseElevator(DesiredFloor.EVEN_FLOOR);
                        break;
                    case 1:
                        elevator = chooseElevator(DesiredFloor.ODD_FLOOR);
                        break;
                    case 2:
                        elevator = chooseElevator(DesiredFloor.EMPLOYEE);
                        break;
                }
                System.out.println("Был вызван: " + elevator);
            } catch (NoElevatorsAvailableException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    // Интерфейс описывающий вызов лифта
    static Elevator chooseElevator(DesiredFloor desiredFloor) throws NoElevatorsAvailableException {
        switch (desiredFloor) {
            case EMPLOYEE:
                return switcherForEmployee.free();
            case ODD_FLOOR:
                return switcherForOdd.free();
            case EVEN_FLOOR:
                return switcherForEven.free();
        }
        return null;
    }
}

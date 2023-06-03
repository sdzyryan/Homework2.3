public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Car1", 4);
        Car car2 = new Car("Car2", 4);

        Truck truck1 = new Truck("Truck1", 6);
        Truck truck2 = new Truck("Truck2", 8);

        Bicycle bicycle1 = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        car1.service();
        bicycle1.service();
        truck1.service();

    }
}
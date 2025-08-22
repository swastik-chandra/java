package in.kgcoding.abstraction;

public class testAbstraction {
    public static void main(String[] args) {
//        Vehicle veh = new Vehicle(2);
        Car car = new Car(2);
        car.commute();
        car.makeStartSound();
    }
}

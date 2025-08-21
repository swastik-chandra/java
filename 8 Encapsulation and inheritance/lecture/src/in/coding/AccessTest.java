package in.coding;

public class AccessTest {
    public static void main(String[] args) {
        car car = new car();
        car.color = "Red";
        car.model = "Swift";
        car.costOfPurchase = 7654;
        System.out.println(car);
        car newCar = new car("Black", "BMW",
                1, 5000);
        System.out.println(newCar);

        Default def = new Default();

    }
}

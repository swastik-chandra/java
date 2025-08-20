public class Car {
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiter;
    int noOfSeats;

    Car( String color ){
        noOfWheels = 4 ;
        this.color = color;
        maxSpeed = 150;
        currentFuelInLiter = 2;
        noOfSeats = 5;
        }


    public void drive() {
        if (currentFuelInLiter == 0) {
            System.out.println(" car is out of fuel");
        } else if (currentFuelInLiter < 5) {
            System.out.println(" Car is reversed mode , please refill the fuel");
            currentFuelInLiter--;
        } else {
            System.out.println(" Car Is Driving ");
            currentFuelInLiter--;
        }
        }
        public void addFuel( float fuel ){
            currentFuelInLiter += fuel;
        }
        public float getCurrentFuelInLiter() {
            return currentFuelInLiter;

        }
    }


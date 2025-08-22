package in.kgcoding.abstraction;

public class Car extends Vehicle{

    @Override
    public void makeStartSound() {
        System.out.println(" suuuuuutututututusuuuutu..");
    }

    public Car(int noOfTyres) {
        super(4);
    }
}

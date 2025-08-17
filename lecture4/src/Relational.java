import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to  Driving Licence Portal  ");
        System.out.println("Please Enter Your Age:");
        int age = input.nextInt();
        if (age >= 18){
            System.out.println("You are eligible for Driving ");
        } else{
                System.out.println("tum bade ho jao beta tab karna drive ");

        }
    }
}

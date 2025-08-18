import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        greet();

        int first = readNumber();

        int second = readNumber();

        int sum = first + second;

        System.out.println(" Sum of the number  is " + sum);
    }

    public static int readNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("PLease enter the number .");
        int number = input.nextInt();
        return number;
    }
    public static void greet() {
        System.out.println("Welcome to Calculator: n/ ");


    }
}
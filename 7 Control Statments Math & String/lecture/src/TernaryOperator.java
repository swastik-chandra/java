import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println(" Welcome to number checker \n");
        System.out.println("Please input your First Number :");
        int num1 = input.nextInt();
        System.out.println("Now , enter your your second number :");
        int num2 = input.nextInt();
//        int greaterNumber;
//        if (num1 > num2 ){
//            greaterNumber = num1 ;
//
//        }else{
//            greaterNumber = num2;
//
//        }
        int greaterNumber = num1 > num2 ? num1 : num2 ;
        System.out.println(greaterNumber+" is the greatest number ");
    }
}

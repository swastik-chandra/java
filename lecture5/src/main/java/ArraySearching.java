import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {3, 56, 65, 98, 88, 34, 76, 90};
        System.out.println("Welcome to Array Searching ");
        System.out.println("Enter the no. you are searching ");
        int num = input.nextInt();
        boolean isFound = isFound(arr, num);
        if (isFound) {
            System.out.println("your number is found in array ");
        } else {
            System.out.println("your number is  not found in array");
        }
    }
    public static boolean isFound(int[] arr, int num ){
        int index  = 0;
        while (index < arr.length){
            if (arr[index] == num){
             return true;

             
            }
            index++;

        }
        return false;

    }
}

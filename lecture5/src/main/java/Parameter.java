public class Parameter {
    public static void main(String[] args) {

        System.out.println(sumTwoNumbers(111, 545));
        System.out.println(sumTwoNumbers(56, -12));
        System.out.println(sumTwoNumbers(34, 21));
    }
    public static int sumTwoNumbers(int  first , int second){
        System.out.println("first number received:  " + first);
        System.out.println("second number received " + second );
        int sum = first + second;
        return sum ;
    }
}

public class Array1 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        //     int[] myArr =  new int[5];
//        myArr[0] = 45;
//        myArr[4] = 99;
//        myArr[03] = 76;
//        myArr[1] = 9;
//        myArr[2] = 6;
        int[] myArr = {45, 9, 6, 76, 99 };
     //   int index = 2;
//        System.out.println(myArr[0]);
//        System.out.println(myArr[1]);
//        System.out.println(myArr[index]);
//        System.out.println(myArr[3]);
//        System.out.println(myArr[4]);
        // Array traversal
        int index = 0 ;
    //    while(index < 5 ){
        while(index < myArr.length )    {
            System.out.println(myArr[index]);
            index++;
           }

        String[] strArr = new String [4];
        strArr[0]  = "My String ";

        String[] newStrArr = {"first" , "second" , "third"};
        System.out.println(newStrArr.length);


    }
}

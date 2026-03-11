package in.kgcoding.Multithreading;

public class NeedOfMultiThreading {
    public static void main(String[] args) {
        long startTime  = System.currentTimeMillis();
//        first Task
        for (int i = 1; i < 1000; i++) {
            System.out.printf(" %d# " , i );
        }
        System.out.println("\n # Task is done ");

//        Second Task
        for (int i = 1; i < 1000; i++) {
            System.out.printf(" %d*" , i );

        }
        System.out.println("\n   * Task is done ");
//        third Task
        for (int i = 1; i < 1000; i++) {
            System.out.printf(" %d@ " , i );

        }
        System.out.println("\n @ Task is done ");
        long endTime  = System.currentTimeMillis();
        System.out.printf("total time taken :%d ", (endTime - startTime));
    }
}
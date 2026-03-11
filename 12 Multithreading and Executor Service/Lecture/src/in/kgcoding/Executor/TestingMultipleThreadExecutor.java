package in.kgcoding.Executor;


import in.kgcoding.Multithreading.Runnable.PrintTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class TestingMultipleThreadExecutor {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService Service = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            PrintTask task = new PrintTask('-');
            Service.submit(task);

        }
//        PrintTask task1 = new PrintTask('*');
//        PrintTask task2 = new PrintTask('%');
//        PrintTask task3 = new PrintTask('^');
//
//
//        Service.submit(task1);
//        Service.submit(task2);
//        Service.submit(task3);
//
//
        Service.shutdown();
        System.out.println("\n**************1");
        if (!Service.awaitTermination(10, TimeUnit.SECONDS)) {
            System.out.println("\n**************2");
            Service.shutdownNow();
        }



        Service.shutdown();
    }
}

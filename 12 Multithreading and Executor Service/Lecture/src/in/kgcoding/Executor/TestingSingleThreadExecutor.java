package in.kgcoding.Executor;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class TestingSingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService Service = Executors.newSingleThreadExecutor();
        PrintTask task1 = new PrintTask('*');

        Service.submit(task1);

        Service.shutdown();
    }
}

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ArraySumWithThreads {
    private static final int NUM_THREADS = Runtime.getRuntime().availableProcessors(); // Number of available processors

    public static void main(String[] args) {
        System.out.println("NUM_THREADS : " + NUM_THREADS);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Your input array
        int arrayLength = array.length;
        int chunkSize = arrayLength / NUM_THREADS;

        ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);
        int result = 0;

        for (int i = 0; i < NUM_THREADS; i++) {
            int startIndex = i * chunkSize;
            int endIndex = (i == NUM_THREADS - 1) ? arrayLength : (i + 1) * chunkSize;
            executor.submit(() -> {
                int localSum = 0;
                System.out.println(localSum);
                for (int j = startIndex; j < endIndex; j++) {
                    localSum += array[j];
                }
                synchronized (ArraySumWithThreads.class) {
                    // result += localSum;
                }
            });
        }

        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sum of the array: " + result);
    }
}

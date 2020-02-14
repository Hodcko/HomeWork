package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.*;

public class Test17 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        List<Future<Integer>> futures = new ArrayList<>();
        long count = 0;

        long startMs = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            futures.add(executor.submit(() ->{
                TimeUnit.MILLISECONDS.sleep(1);
                return 1 + 1;
            }));
        }

        for (Future<Integer> future : futures) {
            try {
                count += future.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdownNow();
        
        long stopMs = System.currentTimeMillis();

        System.out.println("Done " + count);
        System.out.println("Time " + (stopMs - startMs));
    }
}

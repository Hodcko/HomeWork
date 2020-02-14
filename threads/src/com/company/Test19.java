package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;

public class Test19 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(100000000);
        List<Future<Integer>> futures = new ArrayList<>();
        AtomicLong count = new AtomicLong(0);

        long startMs = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            futures.add(executor.submit(() ->{
                TimeUnit.MILLISECONDS.sleep(1);
                return 1 + 1;
            }));
        }

        while (futures.size() > 0) {
            futures.parallelStream().filter(Future::isDone).forEach(f -> {
                try {
                    count.addAndGet(f.get());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            });
            futures.removeIf(Future::isDone);
        }

        executor.shutdown();

        long stopMs = System.currentTimeMillis();

        System.out.println("Done " + count);
        System.out.println("Time " + (stopMs - startMs));
    }
}

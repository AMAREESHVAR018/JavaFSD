package com.community.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorCallableExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> 3;
        Future<Integer> result = executorService.submit(task);

        System.out.println("Total registrations: " + result.get());
        executorService.shutdown();
    }
}
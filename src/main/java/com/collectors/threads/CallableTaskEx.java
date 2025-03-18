package com.collectors.threads;

import java.util.concurrent.*;

/**
 * @author NaveenWodeyar
 *
 */

class CallableTask implements Callable<Integer> {
    private final int number;

    public CallableTask(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        return number * 2;
    }
}

public class CallableTaskEx {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<Integer> future = executorService.submit(new CallableTask(10));

        System.out.println("Result: " + future.get());

        executorService.shutdown();
    }
}

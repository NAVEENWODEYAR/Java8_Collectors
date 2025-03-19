package com.collectors.threads;

import java.util.LinkedList;

/**
 * @author NaveenWodeyar
 *
 */


class CustomThreadPool {
    private final int poolSize;
    private final LinkedList<Runnable> taskQueue;
    private final WorkerThread[] threads;

    public CustomThreadPool(int poolSize) {
        this.poolSize = poolSize;
        taskQueue = new LinkedList<>();
        threads = new WorkerThread[poolSize];
        for (int i = 0; i < poolSize; i++) {
            threads[i] = new WorkerThread();
            threads[i].start();
        }
    }

    public synchronized void submitTask(Runnable task) {
        taskQueue.add(task);
        notify();
    }

    private synchronized Runnable getTask() throws InterruptedException {
        while (taskQueue.isEmpty()) {
            wait();
        }
        return taskQueue.removeFirst();
    }

    private class WorkerThread extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    Runnable task = getTask();
                    task.run();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        CustomThreadPool threadPool = new CustomThreadPool(4);

        for (int i = 0; i < 10; i++) {
            final int taskId = i;
            threadPool.submitTask(() -> {
                try {
                    Thread.sleep(1000);
                    System.out.println("Task " + taskId + " completed by " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }
    }
}


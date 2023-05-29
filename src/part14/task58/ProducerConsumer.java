package part14.task58;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumer {
    private static final int QUEUE_ELEMENTS = 200;
    private static final int TARGET_ELEMENTS = 10_000;

    private BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(QUEUE_ELEMENTS);
    private int processedElements = 0;

    public void start() {
        Thread[] producers = new Thread[3];
        Thread[] consumers = new Thread[2];

        for (int i = 0; i < producers.length; i++) {
            producers[i] = new Thread(new Producer());
            producers[i].start();
        }

        for (int i = 0; i < consumers.length; i++) {
            consumers[i] = new Thread(new Consumer());
            consumers[i].start();
        }

        while (processedElements < TARGET_ELEMENTS) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (Thread producer : producers) {
            producer.interrupt();
        }

        for (Thread consumer : consumers) {
            consumer.interrupt();
        }
    }

    public class Producer implements Runnable {
        private Random random = new Random();

        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    synchronized (queue) {
                        while (queue.size() >= 100) {
                            queue.wait();
                        }

                        int number = random.nextInt(100) + 1;
                        queue.put(number);
                        processedElements++;
                        System.out.println("Producer produced: " + number);

                        if (queue.size() <= 80) {
                            queue.notifyAll();
                        }
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public class Consumer implements Runnable {
        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    synchronized (queue) {
                        while (queue.isEmpty()) {
                            queue.wait();
                        }

                        int number = queue.take();
                        System.out.println("Consumer consumed: " + number);

                        if (queue.size() >= 100) {
                            queue.notifyAll();
                        }
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

}

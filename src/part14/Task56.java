package part14;

public class Task56 {

    private static int threadCount = 10;
    private static int currentThread = 0;
    private static int threadNumber = 0;
    private static Object lock = new Object();

    public static void main(String[] args) {
        for (int i = 0; i < threadCount; i++) {
            Thread thread = new Thread(new SequentialThread());
            thread.start();
        }
    }

    static class SequentialThread implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                threadNumber = currentThread++;
                while (threadNumber != currentThread - 1) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Thread " + threadNumber + " is executing");
                lock.notifyAll();
            }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread " + threadNumber + " has finished execution");
        }
    }
}

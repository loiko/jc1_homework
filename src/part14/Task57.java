package part14;

public class Task57 {
        public static void main(String[] args) {

            Object resource1 = new Object();
            Object resource2 = new Object();
            Object resource3 = new Object();

            Thread thread1 = new Thread(new MyRunnable(resource1, resource2));
            Thread thread2 = new Thread(new MyRunnable(resource2, resource3));
            Thread thread3 = new Thread(new MyRunnable(resource3, resource1));

            thread1.start();
            thread2.start();
            thread3.start();
        }

        private static class MyRunnable implements Runnable {
            private final Object resource1;
            private final Object resource2;

            public MyRunnable(Object resource1, Object resource2) {
                this.resource1 = resource1;
                this.resource2 = resource2;
            }

            @Override
            public void run() {
                String threadName = Thread.currentThread().getName();
                System.out.println(threadName + " acquiring resource1");
                synchronized (resource1) {
                    System.out.println(threadName + " acquired resource1");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(threadName + " acquiring resource2");
                    synchronized (resource2) {
                        System.out.println(threadName + " acquired resource2");


                        System.out.println(threadName + " releasing resource2");
                    }
                    System.out.println(threadName + " released resource2");
                }
                System.out.println(threadName + " released resource1");
            }
        }
    }


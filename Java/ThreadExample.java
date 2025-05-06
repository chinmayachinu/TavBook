import java.time.Duration;
import java.util.Arrays;

public class ThreadExample {

    public static void main(String[] args) {
        ThreadClass threadClass1 = new ThreadClass("Thread 1");
        ThreadClass threadClass2 = new ThreadClass("Thread 2");
        ThreadClass threadClass3 = new ThreadClass("Thread 3");

        threadClass1.start();
        threadClass2.start();
        threadClass3.start();
        try{
            threadClass1.join();
            threadClass2.join();
            threadClass3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadClass extends Thread{
    private final String threadName;

    public ThreadClass(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for(int i =0; i< 3; i++) {
            System.out.println(this.threadName + " " + i);

            try {
                Thread.sleep(Duration.ofSeconds(1));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(this.threadName + " finished");
        }
    }
}

class DeadLock {
    public static void main(String[] args) {
        final String s1 = "hello";
        final String s2 = "world";

        Thread thread1 = new Thread(){
            public void run() {
                synchronized (s1) {
                    System.out.println("Thread 1 aquires s1");

                    try{
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (s2) {
                        System.out.println("Thread 1 aquires s2");
                    }
                }
            }
        };

        Thread thread2 = new Thread() {
            public void run() {
                synchronized (s2) {
                    System.out.println("Thread 2 aquires s2");

                    try{
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (s1) {
                        System.out.println("Thread 2 aquires s1");
                    }
                }
            }
        };

        thread1.start();
        thread2.start();

    }

}

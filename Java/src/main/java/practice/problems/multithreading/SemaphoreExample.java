package practice.problems.multithreading;

import java.util.concurrent.Semaphore;

/**
 * @author kartik sharma
 * @date 23/05/18
 */
public class SemaphoreExample {

    public Semaphore sem1, sem2;

    public SemaphoreExample() {
        try {
            sem1 = new Semaphore(1);
            sem2 = new Semaphore(1);
            sem1.acquire();
            sem2.acquire();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void first() {
        try {
            System.out.println(Thread.currentThread().getName() + " : first");
            sem1.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void second() {
        try {
            sem1.acquire();
            sem1.release();
            System.out.println(Thread.currentThread().getName() + " : second");
            sem2.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void third() {
        try {
            sem1.acquire();
            sem2.release();
            System.out.println(Thread.currentThread().getName() + " : third");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        SemaphoreExample semaphore = new SemaphoreExample();
        Thread thread1 = new Thread(() -> {
            semaphore.first();
        });
        Thread thread2 = new Thread(() -> {
            semaphore.second();
        });
        Thread thread3 = new Thread(() -> {
            semaphore.third();
        });

        thread1.start();
        thread2.start();
        thread3.start();

    }

}

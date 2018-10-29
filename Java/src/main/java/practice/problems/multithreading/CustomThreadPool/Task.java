package practice.problems.multithreading.CustomThreadPool;

/**
 * @author kartik sharma
 * @date 29/10/18
 */
public class Task implements Runnable {

    private int num;

    public Task(int n) {
        num = n;
    }

    public void run() {
        System.out.println("Task " + num + " is running.");
    }
}
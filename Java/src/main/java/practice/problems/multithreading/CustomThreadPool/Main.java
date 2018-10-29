package practice.problems.multithreading.CustomThreadPool;

/**
 * @author kartik sharma
 * @date 29/10/18
 */
public class Main {

    public static void main(String[] args) {
        ThreadPool pool = new ThreadPool(5);

        for (int i = 1; i <= 10; i++) {
            Task task = new Task(i);
            pool.execute(task);
        }

    }
}
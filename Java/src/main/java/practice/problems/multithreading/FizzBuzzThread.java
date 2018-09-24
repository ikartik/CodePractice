package practice.problems.multithreading;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author kartik sharma
 * @date 23/05/18
 */
public class FizzBuzzThread extends Thread {

    int max;
    static int i = 1;
    Predicate<Integer> predicate;
    Function<Integer, String> printer;
    static Object lock = new Object();

    FizzBuzzThread(Predicate<Integer> predicate, Function<Integer, String> printer, int n) {
        this.predicate = predicate;
        this.printer = printer;
        this.max = n;
    }

    public void run() {
        while (i <= max) {
            if (predicate.test(i)) {
                synchronized (lock) {
                    System.out.println(Thread.currentThread().getName() + " : " + printer.apply(i));
                    i += 1;
                }
            }
        }
    }
}


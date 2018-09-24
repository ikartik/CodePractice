package practice.problems.multithreading;

import org.junit.Test;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author kartik sharma
 * @date 23/05/18
 */
public class FizzBuzz {

    @Test
    public void testMethod() {

        int n = 20;

//        while (i <= n) {
//            if (i % 3 == 0 && i % 5 == 0)
//                System.out.println(Thread.currentThread().getName() + " : FizzBuzz");
//            else if (i % 3 == 0)
//                System.out.println(Thread.currentThread().getName() + " : Fizz");
//            else if (i % 5 == 0)
//                System.out.println(Thread.currentThread().getName() + " : Buzz");
//            else
//                System.out.println(Thread.currentThread().getName() + " : " + i);
//            i += 1;
//        }

        Thread[] threads = {
                new FizzBuzzThread(k -> k % 3 == 0 && k % 5 == 0, k -> "FizzBuzz", n),
                new FizzBuzzThread(k -> k % 3 == 0 && k % 5 != 0, k -> "Fizz", n),
                new FizzBuzzThread(k -> k % 3 != 0 && k % 5 == 0, k -> "Buzz", n),
                new FizzBuzzThread(k -> k % 3 != 0 && k % 5 != 0, k -> Integer.toString(k), n)
        };
        for (int i = 0; i < threads.length; i++) {
            threads[i].setName("Thread" + (i+1));
            threads[i].start();
        }
    }
}

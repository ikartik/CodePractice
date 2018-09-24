package practice.problems.multithreading;

import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author kartik sharma
 * @date 26/04/18
 */

public class UnsafeCounterTest {

    class UnsafeCounter {
        private volatile int counter;
        public void inc() {
            counter++;
        }
        public void dec() {
            counter--;
        }
        public int get() {
            return counter;
        }
    }

    @Test
    public void testUnsafeCounter() throws InterruptedException {
        UnsafeCounter unsafeCounter = new UnsafeCounter();
        Thread first = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                unsafeCounter.inc();
                System.out.println("Inc : " + unsafeCounter.get());
            }
        });
        Thread second = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                unsafeCounter.dec();
                System.out.println("Dec : " + unsafeCounter.get());
            }
        });
        first.start();
        second.start();
        first.join();
        second.join();
    }
}


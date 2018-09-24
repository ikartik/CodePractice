package practice.problems.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kartik sharma
 * @date 27/04/18
 */
public class StreamTest {

    public static void main(String[] args) {

        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");


        long start, end;

        start = System.nanoTime();
        stringCollection
                .stream()
                .sorted()
//                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);
        end = System.nanoTime();

        System.out.println("Time taken " + (end - start));

        start = System.nanoTime();
        stringCollection
                .stream()
//                .sorted()
//                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);
        end = System.nanoTime();

        System.out.println("Time taken " + (end - start));


    }


}

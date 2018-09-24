package practice.interview.problems.expedia;

import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author kartik sharma
 * @date 20/04/18
 */

public class PrintPairsWithMinDifference {

    static class Pair {
        private int a, b;

        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    // Given an array of integers, print all (i,j) pairs (in ascending order) having minimum difference

    public static void main(String[] args) {

        int arr[] = {10, 7, 1, 19, 14, 25};
        int n = arr.length;

        SortedMap<Integer, Pair> map = new TreeMap<Integer, Pair>();

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                map.put(Math.abs(arr[i] - arr[j]), new Pair(arr[i], arr[j]));
            }
        }

        for (Integer diff : map.keySet()) {
            System.out.println(diff + ", Pair :(" + map.get(diff).a + ", " + (map.get(diff).b) + ")");
        }

    }

}

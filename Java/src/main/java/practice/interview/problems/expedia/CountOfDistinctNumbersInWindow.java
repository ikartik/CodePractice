package practice.interview.problems.expedia;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author kartik sharma
 * @date 20/04/18
 */
public class CountOfDistinctNumbersInWindow {

    // Given an array of size n and an integer k, return the of count of distinct numbers in all windows of size k


    public static void main(String[] args) {

        int a[] = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        int n = a.length;

        /*for (int i = 0; i <= n-k; i++) {

            HashSet<Integer> set = new HashSet<>();

            for (int j = i; j < i+k; j++) {

                set.add(a[j]);

            }
            System.out.println("Dictinct in window " + (i+1) + " : " + set.size());
        }*/

        printDistinct(a, k, n);
    }

    static void printDistinct(int a[], int k, int n) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int distCount = 0;
        int val;
        for (int i = 0; i < k; i++) {

            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);

            } else {
                map.put(a[i], 1);
                distCount += 1;
            }
        }

        System.out.println("Dictinct in window 1 : " + distCount);

        for (int i = k; i < n; i++) {
            val = map.get(a[i - k]);
            if (val == 1) {
                map.remove(a[i - k]);
                distCount -= 1;
            } else {
                map.put(a[i - k], val - 1);
            }

            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);

            } else {
                map.put(a[i], 1);
                distCount += 1;
            }

            System.out.println("Dictinct in window " + (i - k + 2) + " : " + distCount);

        }

    }

}

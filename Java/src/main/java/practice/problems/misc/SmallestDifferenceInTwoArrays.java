package practice.problems.misc;

import java.util.Arrays;

/**
 * @author kartik sharma
 * @date 29/05/18
 */
public class SmallestDifferenceInTwoArrays {

    /*

    Smallest Difference: Given two arrays of integers, compute the pair of values (one value in each
    array) with the smallest (non-negative) difference. Return the difference.
    EXAMPLE
    Input: {1, 3, 15, 11, 2}, {23, 127, 235, 19, 8}
    Output 3. That is, the pair (11, 8).

    */

    public static void main(String[] args) {

        int a[] = {11, 2, 15, 1};
        int b[] = {19, 235, 127, 4, 13, 12};

        int m = a.length;
        int n = b.length;

        int minDiff = Integer.MAX_VALUE;
        int x = 0, y = 0;
        int i = 0, j = 0;

        Arrays.sort(a); // {1, 2, 11, 15}
        Arrays.sort(b); // {4, 12, 13, 19, 127, 235}

        while (i < m && j < n) {

            if (Math.abs(a[i] - b[j]) < minDiff) {
                minDiff = Math.abs(a[i] - b[j]);
                x = a[i];
                y = b[j];
            }
            if (a[i] < b[j])
                i += 1;
            else
                j += 1;

        }

        System.out.println("Pair : (" + x + ", " + y + ")");

    }
}

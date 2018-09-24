package practice.problems.misc;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author kartik sharma
 * @date 21/05/18
 */
public class MergeSortdArraysIntoOne {

    @Test
    public void myMethod() {

        int[] a = {2, 6, 8, 11};
        int[] b = {1, 3, 7, 9, 13, 0, 0, 0, 0};

        int n1 = a.length;
        int n2 = b.length - n1;

        int k = b.length - 1;

        int i = n1 - 1;
        int j = n2 - 1;

        while (i >= 0 && j >= 0) {
            if (a[i] > b[j]) {
                b[k] = a[i];
                i -= 1;
            } else {
                b[k] = b[j];
                j -= 1;
            }
            k -= 1;
        }

        while (i >= 0) {
            b[k] = a[i];
            k -= 1;
            i -= 1;
        }
        while (j >= 0) {
            b[k] = b[j];
            k -= 1;
            j -= 1;
        }

        System.out.println(Arrays.toString(b));

    }


}

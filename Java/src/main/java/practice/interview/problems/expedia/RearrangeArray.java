package practice.interview.problems.expedia;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author kartik sharma
 * @date 21/04/18
 */
public class RearrangeArray {

    // Rearrange an array such that ‘a[j]’ becomes ‘i’ if ‘a[i]’ is ‘j’

    /*
        Input: a[]  = {1, 3, 0, 2};
        Output: a[] = {2, 0, 3, 1};
    */

    public static void main(String[] args) {

//        int a[] = {1, 3, 0, 2};
        int a[] = {2, 0, 1, 4, 5, 3};
        int n = a.length;

        arrangeWithExtraSpace(a, n);
    }


    static void arrangeWithExtraSpace(int a[], int n) {

        System.out.println("arrangeWithExtraSpace");

        int out[] = new int[n];

        for (int i = 0; i < n; i++) {
            out[a[i]] = i;
        }

        System.out.println(Arrays.toString(out));

    }


}

package practice.interview.problems.expedia;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author kartik sharma
 * @date 21/04/18
 */
public class RearrangeArray {

    // Rearrange an array such that ‘arr[j]’ becomes ‘i’ if ‘arr[i]’ is ‘j’

    /*
        Input: arr[]  = {1, 3, 0, 2};
        Output: arr[] = {2, 0, 3, 1};
    */

    public static void main(String[] args) {

        int arr[] = {1, 3, 0, 2};
        int n = arr.length, t1, t2;

        arrangeWithExtraSpace(arr, n);

        arrangeWithoutExtraSpace(arr, n);

    }

    static void arrangeWithExtraSpace(int arr[], int n){
        int out[] = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], i);
        }

        for (int i = 0; i < n; i++) {
            out[i] = map.get(i);
        }

        System.out.println(Arrays.toString(out));
    }

    static void arrangeWithoutExtraSpace(int arr[], int n){

//        for (int i = 0; i < n; i++) {
//            arr[i] =
//        }

    }


}

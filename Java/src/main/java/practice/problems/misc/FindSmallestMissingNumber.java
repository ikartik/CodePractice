package practice.problems.misc;

import java.util.Arrays;

/**
 * @author kartik sharma
 * @date 30/04/18
 */
public class FindSmallestMissingNumber {

    /*

    Given   [1,2,0] return 3,
            [3,4,-1,1] return 2,
            [-8, -7, -6] returns 1

    Your algorithm should run in O(n) time and use constant space.

    */

    public static void main(String[] args) {

        /*int arr[] = {0, 1, 2, 3}, n = arr.length;

        System.out.println(Arrays.toString(arr));

        int index = 0, temp, i;
        for (i = 0; i < n; i++) {
            if (arr[i] < 0 && i > index) {
                temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                index += 1;
            }
        }
//        System.out.println(Arrays.toString(arr));

        for (i = index; i < n; i++) {
            if(arr[i] > 0)
                arr[arr[i]] = -1;
        }
//        System.out.println(Arrays.toString(arr));

        for (i = index; i < n; i++) {
            if(arr[i] > 0) {
                System.out.println("Missing number : " + i);
                return;
            }
        }
        System.out.println("Missing number : " + 1);*/
    }

}

package practice.problems.misc;

import org.junit.Test;

/**
 * @author kartik sharma
 * @date 21/05/18
 */
public class FindInARotatedSortedArray {

    @Test
    public void myMethod() {

        int[] arr = {15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14};
        int x = 12;

        binSearch(arr, x, 0, arr.length - 1);
    }

    public void binSearch(int[] arr, int x, int l, int r) {

        if (l > r) {
            System.out.println(x + " is not present in the array");
            return;
        }

        int mid = (l + r) / 2;
        if (arr[mid] == x) {
            System.out.println("Found " + x + " at index : " + mid);
            return;
        }
        if (arr[l] < arr[mid]) {
            if (x >= arr[mid] && x < arr[l])
                binSearch(arr, x, l, mid - 1);
            else
                binSearch(arr, x, mid + 1, r);
        } else if (arr[l] > arr[mid]) {
            if (x > arr[mid] && x <= arr[r])
                binSearch(arr, x, mid + 1, r);
            else
                binSearch(arr, x, l, mid - 1);
        } else if(arr[l] == arr[mid]){
            if(arr[mid] != arr[r])
                binSearch(arr, x, mid + 1, r);
            else{
                binSearch(arr, x, l, mid - 1);
                binSearch(arr, x, mid + 1, r);
            }
        }

        return;

    }

}

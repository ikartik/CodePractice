package practice.interview.problems.oyo;

import java.util.Arrays;

/**
 * Created by kartik on 22/09/17.
 */
public class QuickSortDualPivot {

    public static void main(String[] args) {

        int arr[] = {5, 5, 2, 5, 7};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int arr[]){
        sort(arr, 0, arr.length-1);
    }

    static void sort(int[] arr, int lowIndex, int highIndex){

        if(highIndex <= lowIndex)
            return;

        int pivot1 = arr[lowIndex];
        int pivot2 = arr[highIndex];

        if(less(pivot2, pivot1)){
            exchange(arr, lowIndex, highIndex);
            pivot1 = arr[lowIndex];
            pivot2 = arr[highIndex];
        }
        else if(pivot1 == pivot2){
            while(pivot1 == pivot2 && lowIndex < highIndex){
                lowIndex++;
                pivot1 = arr[lowIndex];
            }
        }

        int i = lowIndex + 1;
        int lt = lowIndex + 1;
        int gt = highIndex -1;

        while(i <= gt){
            if(less(arr[i], pivot1))
                exchange(arr, i++, lt++);
            else if(less(pivot2, arr[i]))
                exchange(arr, i, gt--);
            else
                i++;
        }

        exchange(arr, lowIndex, --lt);
        exchange(arr, highIndex, ++gt);

        sort(arr, lowIndex, lt-1);
        sort(arr, lt+1, gt-1);
        sort(arr, gt+1, highIndex);

    }

    static boolean less(int a, int b) {
        return a <= b ? true : false;
    }

    static void exchange(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

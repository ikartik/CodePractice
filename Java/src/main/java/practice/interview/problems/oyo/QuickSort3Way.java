package practice.interview.problems.oyo;

import java.util.Arrays;

/**
 * Created by kartik on 22/09/17.
 */
public class QuickSort3Way {


    static void sort(int[] input) {
        //input=shuffle(input);
        sort(input, 0, input.length - 1);
    }

    static void sort(int[] input, int lowIndex, int highIndex) {

        if (highIndex <= lowIndex) return;

        int lt = lowIndex;
        int gt = highIndex;
        int i = lowIndex + 1;

        int pivotIndex = lowIndex;
        int pivotValue = input[pivotIndex];

        while (i <= gt) {
            if (less(input[i], pivotValue))
                exchange(input, i++, lt++);
            else if (less(pivotValue, input[i]))
                exchange(input, i, gt--);
            else
                i++;
        }
        sort(input, lowIndex, lt - 1);
        sort(input, gt + 1, highIndex);
    }

    static boolean less(int a, int b) {
        return a <= b ? true : false;
    }

    static void exchange(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 4, 7, 7, 1, 8, 2};
        sort(arr);

        System.out.println(Arrays.toString(arr));
    }

}
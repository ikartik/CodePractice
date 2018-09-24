package practice.problems.misc;

import java.util.Arrays;

/**
 * Created by kartik on 20/09/17.
 */
public class AllPermutationsOfAString {


    public static void main(String[] args) {

        String s = "abc";
        int n = s.length();
        char arr[] = s.toCharArray();
        permute(arr, 0, n-1);

    }

    static void permute(char[] arr, int l, int r){
        if(l == r)
            System.out.print(Arrays.toString(arr));
        else{
            for (int i = l; i < r+1; i++) {
                swap(arr, i, l);
                permute(arr, l+1, r);
                swap(arr, i, l);
            }
        }
    }

    static void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

package practice.interview.problems.amazon;

import java.util.Arrays;

/**
 * Created by kartik on 18/09/17.
 */
public class A1B1A2B2 {

    static int even[] = {1, 2, 3, 4, 5, 6, 7, 8};
    static int odd[] = {1, 2, 3, 11, 12, 13};

    public static void main(String[] args) {

        System.out.println(Arrays.toString(even));
//        myTrans(even);
        kartik(even);

        System.out.println(Arrays.toString(odd));
//        myTrans(odd);
        kartik(odd);


    }

    static void myTrans(int[] m) {

        int n = (m.length - 1);

        int i = 1;
        for (int start = 1; start < n; start++) {
            int temp = m[start];
            m[start] = m[n / 2 + i];

            for (int j = (n / 2 + i); j > start; j--) {
                m[j] = m[j - 1];
            }

            start++;
            m[start] = temp;

            i++;
        }
        System.out.println(Arrays.toString(m));
    }

    static void kartik(int arr[]){

        int n = arr.length;

        for(int i=n/2-1,j=n/2; i>0 && j<n-1; i--, j++){
            int m = i;

            while(m < j){
                swap(arr, m, m+1);
                m += 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

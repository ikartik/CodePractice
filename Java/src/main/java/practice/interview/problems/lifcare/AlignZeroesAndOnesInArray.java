package practice.interview.problems.lifcare;

import java.util.Arrays;

/**
 * @author kartik sharma
 * @date 18/10/18
 */
public class AlignZeroesAndOnesInArray {

    public static void main(String[] args) {

        int a[] = {0, 1, 0, 1, 1, 0, 1};

        int n = a.length;

        int i = 0, j = n - 1;

        while (i < j) {
            if(a[i] == 0)
                i += 1;
            if(a[j] == 1)
                j -= 1;
            if(a[i] == 1 && a[j] == 0){
                a[i] = 0;
                a[j] = 1;
                i += 1;
                j -= 1;
            }
        }
        System.out.println(Arrays.toString(a));
    }

}

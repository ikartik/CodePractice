package practice.problems.misc;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kartik on 13/09/17.
 */
public class KPairsWithSmallestSum {

    public static void main(String[] args) {

        int[] a1 = {1,7,11};
        int[] a2 = {2,4,6};

        int k = 3;

        getAllPairs(a1, a2, k);

    }

    static void getAllPairs(int[] a1, int[] a2, int k){

        int n1 = a1.length;
        int n2 = a2.length;

        if (k > n1*n2) {
            System.out.print("k pairs don't exist");
            return ;
        }

        int index2[] = new int[n1];

        while(k > 0){
            int min_sum = Integer.MAX_VALUE;
            int min_index = 0;

            for (int i1 = 0; i1 < n1; i1++) {
                if (index2[i1] < n2 && a1[i1] + a2[index2[i1]] < min_sum) {
                    min_index = i1;
                    min_sum = a1[i1] + a2[index2[i1]];
                }
            }

            System.out.print("(" + a1[min_index] + ", " + a2[index2[min_index]]+ ") ");
            index2[min_index]++;
            k--;
        }

    }

}

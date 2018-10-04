package practice.interview.problems.uber;

import org.apache.commons.lang.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author kartik sharma
 * @date 04/10/18
 */
public class PermutationOfArrayOfArrays {

    // Permutations of an Array of Arrays

    /*

    Input   :   [[1, 2, 3], [4], [5, 6]]
    Output  :   [[1, 4, 5], [1, 4, 6], [2, 4, 5], [2, 4, 6], [3, 4, 5], [3, 4, 6]]

    */

    public static void main(String[] args) {

        int[][] a = {{1, 2, 3}, {4}, {5, 6}};

        ArrayList<int[]> ans = permuteUtil(a);
        for (int[] ar : ans) {
            System.out.println(Arrays.toString(ar));
        }

    }

    static ArrayList<int[]> permuteRec(int[][] a, int i) {
        if (i == a.length)
            return new ArrayList<>();

        ArrayList<int[]> res_next = permuteRec(a, i + 1);

        ArrayList<int[]> result = new ArrayList<>();

        for (int n : a[i]) {
            if (res_next.size() != 0) {
                for (int[] arr : res_next) {
                    result.add(ArrayUtils.addAll(new int[]{n}, arr));
                }
            } else {
                result.add(new int[]{n});
            }
        }
        return result;
    }

    static ArrayList<int[]> permuteUtil(int[][] a) {
        return permuteRec(a, 0);
    }
}

package practice.problems.dynamicProgramming;

/**
 * @author kartik sharma
 * @date 24/08/18
 */
public class LongestIncreasingSubsequence {

    public static void main(String[] args) {


        int a[] = {10,22,9,33,21,50,41,60};

        System.out.println(longestIncreasingSubsequence(a, a.length));

    }

    public static int longestIncreasingSubsequence(int a[], int n){

        int lis[] = new int[n];

        for (int i = 0; i < n; i++) {
            lis[i] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(a[i] > a[j] && lis[j] >= lis[i])
                    lis[i] = lis[j] + 1;
            }
        }

        return lis[n-1];

    }

}

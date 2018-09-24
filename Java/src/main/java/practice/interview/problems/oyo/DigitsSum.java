package practice.interview.problems.oyo;

/**
 * Created by kartik on 21/09/17.
 */
public class DigitsSum {

    static int countRec(int n, int sum)
    {
        // Base case
        if (n == 0)
            return sum == 0 ? 1:0;

        // Initialize answer
        int ans = 0;

        // Traverse through every digit and count
        // numbers beginning with it using recursion
        for (int i=1; i<=3; i++)                        // for (int i=0; i<=9; i++)
            if (sum-i >= 0)
                ans += countRec(n-1, sum-i);

        return ans;
    }

    // This is mainly a wrapper over countRec. It
    // explicitly handles leading digit and calls
    // countRec() for remaining digits.
    static int finalCount(int n, int sum)
    {
        // Initialize final answer
        int ans = 0;

        // Traverse through every digit from 1 to
        // 9 and count numbers beginning with it
        for (int i = 2; i <= 3; i++)                    // for (int i = 1; i <= 9; i++)
            if (sum-i >= 0)
                ans += countRec(n-1, sum-i);

        return ans;
    }

    /* Driver program to test above function */
    public static void main (String args[])
    {
        int n = 3, sum = 6;
        System.out.println(finalCount(n, sum));
    }
}/* This code is contributed by Rajat Mishra */


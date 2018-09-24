package practice.problems.dynamicProgramming;

/**
 * @author kartik sharma
 * @date 21/08/18
 */


/*

Given an integer array nums, find the contiguous subarray (containing at least one number),
which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

*/

public class MaxSumSubArray {

    public static void main(String[] args) {

//        int a[] = {-2,1,-3,4,-1,2,1,-5,4};
        int a[] = {-1, -6, -5, -2};
        int n = a.length;

        int curSum = Integer.MIN_VALUE, maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if(curSum <= 0)
                curSum = a[i];
            else
                curSum += a[i];

            if(curSum > maxSum)
                maxSum = curSum;
        }

        System.out.println(maxSum);
    }

}

package practice.problems.gainlo;

/**
 * @author kartik sharma
 * @date 21/08/18
 */
public class ContinuousSubArrayWithSumS {


    //    Given an array of non-negative numbers, find continuous subarray with sum to S.

    public static void main(String[] args) {

        int a[] = {6, 2, 3, 1, 5, 1, 4, 2, 6};
        int sum = 6;
        findOut(a, a.length, sum);

    }


    public static void findOut(int a[], int n, int sum) {

        int current_sum = 0;
        int start = 0;
        int i;

        for (i = 0; i < n; i++) {

            if (current_sum + a[i] == sum) {
                printSubarray(a, start, i);
                current_sum += a[i];
            } else if (current_sum + a[i] > sum) {
                current_sum = a[i];
                start = i;
            } else {
                current_sum += a[i];
            }

        }

        if (current_sum == sum) {
            printSubarray(a, start, i-1);
        }

    }

    public static void printSubarray(int a[], int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

}

package practice.interview.problems.yatra;

/**
 * Created by kartik on 16/09/17.
 */
public class Subarrays {

    public static void main(String[] args) {

        int arr[] = {7,3,2,5,9,1,4,6,8};
        int givenSum = 10;

        int currSum = arr[0];
        int start=0;
        int end=0;
        while (end < arr.length)
        {
            if (currSum == givenSum)
            {
                System.out.println("Found given sum from " + start + " to " + end);
            }

            if (currSum <= givenSum)
            {
                end++;
                if (end < arr.length)
                    currSum = currSum + arr[end];
            }
            else
            {
                currSum = currSum - arr[start];
                start++;
            }
        }

    }

}

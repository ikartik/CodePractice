package practice.interview.problems.amazon;

/**
 * @author kartik sharma
 * @date 17/01/18
 */
public class ContiguousIntegers {

//    Given an array of n integers(duplicates allowed). Print “Yes” if it is a set of contiguous integers else print “No”.

    public static void main(String[] args) {

        int[] arr = {5,2,4,3,6};

        System.out.println(findOut(arr));

    }

    public static String findOut(int arr[]){

        int sum = 0;

        for (int i = 0; i < arr.length-1; i+=2) {
            sum = sum + arr[i];
            sum = sum - arr[i+1];
        }

        System.out.println(sum);

        return "haan";
    }

}

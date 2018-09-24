package practice.interview.problems.yatra;

/**
 * Created by kartik on 15/09/17.
 */
public class MinElemInRotatedSortedArray {

    public static void main(String[] args) {

        int arr[] = {7,8,9,1,2,3,4,5};

        System.out.println(binSearch(arr, 0 , arr.length-1));

    }

    static int binSearch(int[] arr, int left, int right){

        if (right < left)
            return arr[0];
        
        if (right == left)
            return arr[left];
        
        int mid = left + (right - left)/2;
        
        if (mid < right && arr[mid+1] < arr[mid])
            return arr[mid+1];

        if (mid > left && arr[mid] < arr[mid - 1])
            return arr[mid];
        
        if (arr[right] > arr[mid])
            return binSearch(arr, left, mid-1);
        else
            return binSearch(arr, mid+1, right);
    }

}

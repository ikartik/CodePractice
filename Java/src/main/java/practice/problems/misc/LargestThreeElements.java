package practice.problems.misc;

/**
 * Created by kartik on 13/09/17.
 */
public class LargestThreeElements {

    public static void main(String[] args) {
        int arr[] = {12,35,42,1,46,432,3,565,2,3,32};
        getAllBitches(arr);
    }

    static void getAllBitches(int arr[]){

        int first = 0, second = 0, third = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > first){
                third = second;
                second = first;
                first = arr[i];
            }
            else if(arr[i] > second){
                third = second;
                second = arr[i];
            }
            else if(arr[i] > third){
                third = arr[i];
            }
        }
        System.out.println(first+", "+second+", "+third);
    }

}

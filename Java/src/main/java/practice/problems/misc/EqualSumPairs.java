package practice.problems.misc;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kartik on 13/09/17.
 */
public class EqualSumPairs {

    static  class Pair{
        int first;
        int second;
        String pair;
        Pair(int first, int second){
            this.first = first;
            this.second = second;
            this.pair = "("+first+", "+second+")";
        }
    }

    public static void main(String[] args) {

        int arr[] = {3, 4, 7, 1, 2, 9, 8};

        Map<Integer, Pair> map = new HashMap<Integer, Pair>();
        int sum;
        Pair pair;
        for(int i=0; i<arr.length-1; i++)
            for(int j=i+1; j<arr.length-1; j++) {
                sum = arr[i]+arr[j];
                pair = new Pair(arr[i], arr[j]);
                if (!map.containsKey(sum))
                    map.put(sum, pair);
                else{
                    Pair p = map.get(sum);
                    System.out.println("("+arr[i]+","+arr[j]+") , ("+p.first+","+p.second+")");
                }
            }
    }

}

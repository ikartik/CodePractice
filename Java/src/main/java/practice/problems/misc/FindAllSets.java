package practice.problems.misc;

import java.util.*;

/**
 * @author kartik sharma
 * @date 17/09/18
 */
public class FindAllSets {

    /*
    find all sets for a^3 + b^3 = c^3 + d^3  ,  for a,b,c,d < N
    */

    public static void main(String[] args) {

        int n = 100;
        int sum;

        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        int a[] = new int[n-1];

        for (int i = 1; i < n; i++) {
            a[i - 1] = i * i * i;
        }

//        System.out.println(Arrays.toString(a));

        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {

                sum = a[i] + a[j];

                ArrayList<Integer> list = map.getOrDefault(sum, new ArrayList<Integer>());
                list.add(a[i]);
                list.add(a[j]);
                map.put(sum, list);

            }
        }

        for (Integer key: map.keySet()) {
            if (map.get(key).size() > 2)
                System.out.println(key + " : " + map.get(key));
        }

    }





}

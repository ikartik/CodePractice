package practice.problems.misc;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author kartik sharma
 * @date 21/05/18
 */
public class SortStringArrayOfAnagrams {

    @Test
    public void myMethod(){

        String[] arr = {"abc", "jui", "bac", "bsed", "uij", "sedf", "gds", "iju", "sebd"};

        HashMap<String, LinkedList<String>> map = new HashMap<>();

        System.out.println(Arrays.toString(arr));

        for(String s : arr){

            char[] el = s.toCharArray();
            Arrays.sort(el);

            String ss = new String(el);

            LinkedList ll = map.getOrDefault(ss, new LinkedList<>());
            ll.add(s);

            map.put(ss, ll);

        }

        int i = 0;
        for (String key : map.keySet()) {
            LinkedList<String> ll = map.get(key);
            for(String ss : ll) {
                arr[i] = ss;
                i += 1;
            }
        }

        System.out.println(Arrays.toString(arr));

    }

}

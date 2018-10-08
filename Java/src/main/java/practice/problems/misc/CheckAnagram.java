package practice.problems.misc;

import java.util.Arrays;

/**
 * @author kartik sharma
 * @date 08/10/18
 */
public class CheckAnagram {

    public static void main(String[] args) {

        String a = "kartikrmasha";
        String b = "kitraksharma";

        checkForAnagrams(a, b);

    }

    static void checkForAnagrams(String a, String b) {

        boolean flag;

        if (a == null || b == null || a.length() != b.length()) {
            System.out.println("Not Anagrams !");
            return;
        }

        int arr[] = new int[26];

        for (int i = 0; i < a.length(); i++) {
            int index = Character.getNumericValue(a.charAt(i))-10;
            arr[index] += 1;
        }

        for (int i = 0; i < b.length(); i++) {
            int index = Character.getNumericValue(b.charAt(i))-10;
            arr[index] -= 1;
        }

        for (int count : arr) {
            if(count != 0){
                System.out.println("Not Anagrams !");
                return;
            }
        }

        System.out.println("Anagrams !");

    }


}

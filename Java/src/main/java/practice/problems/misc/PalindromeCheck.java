package practice.problems.misc;


import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by kartik on 25/08/17.
 */
public class PalindromeCheck {

    public static void main(String[] args) {

        String input = "kartik";

        System.out.println(check1(input));
        System.out.println(check2(input));

    }

    public static Boolean check1(String input){
        Long start = System.currentTimeMillis();
        char [] cArr = input.toCharArray();
        char [] rArr = new char[cArr.length];

        int i = cArr.length-1;
        for (char c : cArr){
            rArr[i] = c;
            i -= 1;
        }

        for (i=0; i<cArr.length; i++)
            if(cArr[i] != rArr[i]){
                Long end = System.currentTimeMillis();
                System.out.println("Time taken : "+(end-start));
                return false;
        }
        Long end = System.currentTimeMillis();
        System.out.println("Time taken : "+(end-start));
        return true;

    }

    public static Boolean check2(String input){

        Long start = System.currentTimeMillis();
        int n = input.length();
        int i,j;
        char [] cArr = input.toCharArray();

        for (i=0,j=n-1; i<n/2 && j>n/2; i++,j--)
            if(cArr[i] != cArr[j]) {
                Long end = System.currentTimeMillis();
                System.out.println("Time taken : "+(end-start));
                return false;
            }
        Long end = System.currentTimeMillis();
        System.out.println("Time taken : "+(end-start));
        return true;
    }

    public static Boolean checkPalindrome(String input){
        int n = input.length();
        char [] cArr = input.toCharArray();

        for (int i=0,j=n-1; i<n/2 && j>n/2; i++,j--)
            if(cArr[i] != cArr[j])
                return false;
        return true;
    }

}

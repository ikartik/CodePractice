package practice.problems.misc;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kartik on 19/07/17.
 */
public class UniqueCharInString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(findOut(input));
        System.out.println(isUniqueChars(input));


    }
    public static Boolean findOut(String input){
        int i = 0;
        boolean[] boo = new boolean[128];
        while(i<input.length()){
            if(boo[input.charAt(i)]){
                return false;
            }
            boo[input.charAt(i)] = true;
            i++;
        }
        return true;
    }

    public static Boolean isUniqueChars(String str){
        int checker = 0;
        for (int i = 0; i<str.length(); i++){
            int val = str.charAt(i) - 'a';
            if((checker & (1 << val))>0){
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }
}

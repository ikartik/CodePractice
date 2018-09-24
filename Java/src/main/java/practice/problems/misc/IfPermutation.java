package practice.problems.misc;

import java.util.ArrayList;

/**
 * Created by kartik on 19/07/17.
 */
public class IfPermutation {

    public static void main(String[] args) {

        String a = "abcdef";
        String b = "cababc";

        System.out.println(findOut(a, b));
    }

    public static Boolean findOut(String a, String b){

        if(a.length()!=b.length()){
            return false;
        }

        int letters[] = new int[128];

        char[] aCharArray = a.toCharArray();

        for(char aChar : aCharArray){
            letters[aChar]+=1;
        }

        for(int i=0; i<b.length(); i++) {
            int bChar = b.charAt(i);
            letters[bChar]-=1;
            if(letters[bChar]<0){
                return false;
            }

        }

        return true;
    }

}

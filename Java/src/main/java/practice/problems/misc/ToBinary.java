package practice.problems.misc;

/**
 * Created by kartik on 19/07/17.
 */
public class ToBinary {

    public static void main(String[] args) {

        int x = 2;
        int y = 4;

        System.out.println("x : " + Integer.toBinaryString(x) + " , "+ Integer.toBinaryString(x >> 2));
        System.out.println("y : " + Integer.toBinaryString(y) + " , "+ Integer.toBinaryString(y >> 2));


    }

}

package practice.interview.problems.goldmansachs;

import java.util.Arrays;

/**
 * @author kartik sharma
 * @date 16/07/18
 */

public class MinimumNumberFromSequence {


    public int[] find(char[] input) {
        int[] output = new int[input.length + 1];
        output[0] = 1;
        int low = 0;
        int start = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 'D') {
                output[i + 1] = output[i] - 1;
                if (output[i+1] == low) {
                    for (int j = start; j <= i + 1; j++) {
                        output[j] = output[j] + 1;
                    }
                }
            } else {
                low = output[start];
                output[i + 1] = low + 1;
                start = i + 1;
            }
        }
        return output;
    }

    public static void main(String args[]) {
        MinimumNumberFromSequence ms = new MinimumNumberFromSequence();
        int output[] = ms.find("DDIDDIID".toCharArray());
        System.out.println(Arrays.toString(output));

        output = ms.find("IIDDD".toCharArray());
        System.out.println(Arrays.toString(output));

        output = ms.find("DIDI".toCharArray());
        System.out.println(Arrays.toString(output));

        output = ms.find("DI".toCharArray());
        System.out.println(Arrays.toString(output));

        output = ms.find("ID".toCharArray());
        System.out.println(Arrays.toString(output));

        output = ms.find("D".toCharArray());
        System.out.println(Arrays.toString(output));

        output = ms.find("I".toCharArray());
        System.out.println(Arrays.toString(output));

        output = ms.find("IID".toCharArray());
        System.out.println(Arrays.toString(output));

        output = ms.find("DDI".toCharArray());
        System.out.println(Arrays.toString(output));

    }
}
package practice.interview.problems.expedia;

import java.util.HashSet;

/**
 * @author kartik sharma
 * @date 20/04/18
 */
public class CountNumbersWithDistinctDigits {

    // Given a range [m,n] , print the count of numbers having distinct digits.
    // For eg, 12 is said to have all digits distinct while 121 is not.


    public static void main(String[] args) {

        int m = 10;
        int n = 40;
        int count = 0;
        for (int i = m; i <= n; i++) {

            HashSet<Character> set = new HashSet<Character>();

            char[] number = String.valueOf(i).toCharArray();
            boolean flag = true;

            for (int j = 0; j < number.length; j++) {
                if(set.contains(number[j])) {
                    flag = false;
                    break;
                }
                else {
                    set.add(number[j]);
                }

            }
            if(flag) {
                System.out.print(i + " ");
                count += 1;
            }
        }
        System.out.println("\nTotal count : " + count);

    }

}

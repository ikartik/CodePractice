package practice.problems.hackerrank;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

/**
 * @author kartik sharma
 * @date 01/05/18
 */
public class SumOfSubStringsOfANumber {

    // Complete the substrings function below.
    static int substrings(String n) {

        char[] chars = n.toCharArray();
        int l = n.length();
        int sum = 0;
        for (int i = 0; i < l; i++) {
            StringBuffer sb = new StringBuffer();
            sb.append(String.valueOf(chars[i]));
            sum += Integer.parseInt(sb.toString());
            for (int j = i + 1; j < l; j++) {
                sb.append(String.valueOf(chars[j]));
                sum += Integer.parseInt(sb.toString());
            }
        }
        return sum%(1000000000+7);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        String n = scanner.nextLine();

        int result = substrings(String.valueOf(100));

        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

//        scanner.close();
    }
}

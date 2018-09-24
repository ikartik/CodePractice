package practice.problems.misc;

/**
 * @author kartik sharma
 * @date 23/05/18
 */
public class Count2sInARange {


    public static void main(String[] args) {

        int n = 23;
        System.out.println(count2s(n));

    }

    static int count2s(int n) {
        int count = 0;
        int len = String.valueOf(n).length();
        for (int i = 0; i < len; i++) {
            count += count2sInRangeAtDigit(n, i);
        }

        return count;
    }

    static int count2sInRangeAtDigit(int number, int d) {
        int powerOf10 = (int) Math.pow(10, d);
        int nextPowerOf10 = powerOf10 * 10;
        int right = number % powerOf10;

        int roundDown = number - number % nextPowerOf10;
        int roundUp = roundDown + nextPowerOf10;

        int digit = (number / powerOf10) % 10;

        if (digit < 2)
            return roundDown / 10;
        else if(digit > 2)
            return roundUp / 10;
        else
            return roundDown / 10 + right + 1;

    }

}

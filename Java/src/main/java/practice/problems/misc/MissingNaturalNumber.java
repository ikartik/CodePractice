package practice.problems.misc;

/**
 * @author kartik sharma
 * @date 03/10/18
 */
public class MissingNaturalNumber {

    public static void main(String[] args) {


        int[] a = {1, 2, 3, 4, 7, 8, 9, 6};
        int x1, x2;
        int n = a.length;


        x1 = a[0];
        for (int i = 1; i < n; i++) {
            x1 ^= a[i];
        }

        x2 = 1;
        for (int i = 1; i < n; i++) {
            x1 ^= i;
        }

        System.out.println(x1 ^ x2);

    }

}

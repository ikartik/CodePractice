package practice.interview.problems.inmobi;

import java.util.Arrays;

/**
 * @author kartik sharma
 * @date 05/06/18
 */
public class SmallestMissingPositiveInteger {

    public static void main(String[] args) {

        int a[] = {2, 3, 7, 6, 8, -1, -10, 15};

        int i = 0, j = 0, temp;
        for (i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }

        int b[] = new int[a.length - j];
        int k = 0;
        for (i = j; i < a.length; i++) {
            b[k] = a[i];
            k++;
        }

        System.out.println(Arrays.toString(b));

        for (i = 0; i < b.length; i++) {
            if(b[i] < b.length && b[i]-1 >=0)
                b[b[i]-1] = -100;
        }

        System.out.println(Arrays.toString(b));

        for (i = 0; i < b.length; i++) {
            if (b[i] > 0) {
                System.out.println(i + 1);
                break;
            }
        }
    }

}

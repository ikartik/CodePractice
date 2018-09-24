package practice.interview.problems.goldmansachs;

import java.util.Vector;

/**
 * Created by kartik on 14/09/17.
 */
public class ChildJumpingStairs {

    /*
        A child going up a staircase with n steps,
        can hop up 1, 2, or 3 steps at a time.
        How many ways can the child reach the top?
    */

    public static void main(String[] args) {
        long start, end;
        int n = 10;


        start = System.currentTimeMillis();
        for (int i = 1; i <= n; i++) {
            System.out.print(waysRec(i) + " ");
        }
        end = System.currentTimeMillis();

        System.out.println("");
        System.out.println("Runtime Rec : " + (end - start));
        System.out.println("");

        start = end;
        for (int i = 1; i <= n; i++) {
            System.out.print(waysItr(i) + " ");
        }
        end = System.currentTimeMillis();

        System.out.println("");
        System.out.println("Runtime Itr : " + (end - start));
        System.out.println("");

        start = end;
        for (int i = 1; i <= n; i++) {
            System.out.print(waysDP(i) + " ");
        }
        end = System.currentTimeMillis();

        System.out.println("");
        System.out.println("Runtime DP : " + (end - start));
        System.out.println("");

    }

    static int waysRec(int n) {
        if (n == 1)
            return 1;
        else if (n == 2)
            return 2;
        else if (n == 3)
            return 4;
        else
            return waysRec(n - 1) + waysRec(n - 2) + waysRec(n - 3);
    }

    static int waysItr(int n) {
        int ways = 0;
        int a = 1, b = 2, c = 4;

        if (n == 1)
            return 1;
        else if (n == 2)
            return 2;
        else if (n == 3)
            return 4;
        else {

            for (int i = 3; i < n; i++) {
                ways = a + b + c;
                a = b;
                b = c;
                c = ways;
            }
        }
        return ways;

    }

    static int waysDP(int n) {
        if (n == 1)
            return 1;
        else if (n == 2)
            return 2;
        else if (n == 3)
            return 4;
        Vector<Integer> table = new Vector<Integer>(n);
        table.add(1);
        table.add(2);
        table.add(4);
        for (int i = 3; i < n; i++)
            table.add(i, (table.get(i - 1) + table.get(i - 2) + table.get(i - 3)));
        return table.lastElement();
    }
}

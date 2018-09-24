package practice.problems.dynamicProgramming;

/**
 * @author kartik sharma
 * @date 24/08/18
 */
public class NthFibonacciNumber {

    public static void main(String[] args) {


        long a, b;

        int n = 5-1;

        if (n < 0)
            return;

        a = System.currentTimeMillis();
        System.out.println(fibRec(n));
        b = System.currentTimeMillis();
        System.out.println("Recursive : " + (b - a));


        a = System.currentTimeMillis();
        System.out.println(fibMemUtil(n));
        b = System.currentTimeMillis();
        System.out.println("Memoization : " + (b - a));


        a = System.currentTimeMillis();
        System.out.println(fibTab(n));
        b = System.currentTimeMillis();
        System.out.println("Tabulation : " + (b - a));


        a = System.currentTimeMillis();
        System.out.println(fibItr(n));
        b = System.currentTimeMillis();
        System.out.println("Iterative : " + (b - a));

    }

    public static int fibTab(int n) {
        int tab[] = new int[n+1];
        tab[0] = 0;
        tab[1] = 1;

        for (int i = 2; i <= n; i++) {
            tab[i] = tab[i-1] + tab[i-2];
        }
        return tab[n];
    }


    public static int fibItr(int n) {
        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }


    public static int fibMemUtil(int n) {
        return fibMem(n, new int[n + 1]);
    }

    public static int fibMem(int n, int[] mem) {

        int result;

        if (mem[n] != 0)
            return mem[n];

        if (n == 1 || n == 2)
            result = 1;
        else
            result =  fibMem(n - 1, mem) + fibMem(n - 2, mem);

        mem[n] = result;
        return result;
    }


    public static int fibRec(int n) {

        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        return fibRec(n - 1) + fibRec(n - 2);
    }
}

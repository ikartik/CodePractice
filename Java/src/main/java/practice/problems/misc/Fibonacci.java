package practice.problems.misc;

/**
 * Created by kartik on 14/09/17.
 */
public class Fibonacci {

    static int c, a=0, b=1, n=10;;

    public static void main(String[] args) {
        System.out.print( " "  + a + " " + b);
        fibItr(a, b, n-2);
        System.out.println("");
        System.out.print( " "  + a + " " + b);
        fibRec(n-2);
        System.out.println("");
        System.out.println( 2 ^ 5);
    }

    static void fibItr(int a, int b, int n){
        while(n > 0) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
            n -= 1;
        }

    }

    static void fibRec(int count){
        if(count > 0){
            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
            fibRec(count-1);
        }
    }



}

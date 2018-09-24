package practice.problems.misc;

/**
 * @author kartik sharma
 * @date 23/05/18
 */
public class SwapNumbers {

    public static void main(String[] args) {

        int a = 4, b = 13;

        System.out.println(a + ", " + b);

        a = a^b;

        System.out.println(a + ", " + b);

        b = a^b;

        System.out.println(a + ", " + b);

        a = a^b;

        System.out.println(a + ", " + b);

        System.out.println(13|2);

    }

}

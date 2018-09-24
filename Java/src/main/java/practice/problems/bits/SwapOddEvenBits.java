package practice.problems.bits;

/**
 * Created by kartik on 19/09/17.
 */
public class SwapOddEvenBits {

    public static void main(String[] args) {

//        int num = 86;

        int num = 27;
        System.out.println(Integer.toBinaryString(num));
        swapBits(num);
        swapSolution(num);

    }

    static void swapBits(int n){

        int c = n;
        int bit1, bit2;

        StringBuilder s = new StringBuilder();

        while(c > 0){

            bit1 = c & 1;
            c >>= 1;

            bit2 = c & 1;
            c >>= 1;

            s.insert(0, bit2);
            s.insert(0, bit1);
        }

        System.out.println(s);
    }

    static void swapSolution(int n){
        int a = n & 0xaaaaaaaa;
        int b = a >>> 1;

        int c = n & 0x55555555;
        int d =  c << 1;

        System.out.println(b | d);

    }

}

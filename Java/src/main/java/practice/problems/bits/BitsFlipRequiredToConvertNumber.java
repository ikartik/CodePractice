package practice.problems.bits;

/**
 * Created by kartik on 19/09/17.
 */
public class BitsFlipRequiredToConvertNumber {

    public static void main(String[] args) {

        int a = 23;
        int b = 11;

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));

        findOut(a, b);
        findSolution(a, b);

    }

    static void findOut(int a, int b){

        int c = a ^ b;
        int c0=0;

        while(c > 0){
            c0 += c%2;
            c /= 2;
        }
        System.out.println(c0);
    }

    static void findSolution(int a, int b){
        int count = 0;
        for (int c = a ^ b; c != 0; c = c & (c-1)) {
            count++;
            }
        System.out.println(count);
    }

}

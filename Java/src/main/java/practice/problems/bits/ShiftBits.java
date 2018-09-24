package practice.problems.bits;

/**
 * Created by kartik on 12/09/17.
 */
public class ShiftBits {

    public static void main(String[] args) {

        System.out.println(repeatedArithmeticShift(-1, 1));
        System.out.println(repeatedLogicalShift(-1, 1));

    }

    static int repeatedArithmeticShift(int x, int count) {
        for (int i =0; i <count; i++) {
            x >>= 1;
        }
        return x;
    }
    static int repeatedLogicalShift(int x, int count) {
        for (int i =0; i < count; i++) {
            x >>>= 1;
        }
        return x;
    }

}

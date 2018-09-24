package practice.problems.bits;

/**
 * Created by kartik on 12/09/17.
 */
public class ClearBits {

    public static void main(String[] args) {
        System.out.println(clearBitsFromRightmostToIth(15, 2));
    }

    static int clearIthBit(int num, int i){
        return num & ~(1 << i);
    }

    static int clearBitsFromIthTo0(int num, int i) {
        int mask =(-1 << (i + 1));
        return num & mask;
    }

    static int clearBitsFromRightmostToIth(int num, int i){
        return num & ((1 << i) - 1);
    }

}

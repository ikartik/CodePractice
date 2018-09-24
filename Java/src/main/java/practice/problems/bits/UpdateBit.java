package practice.problems.bits;

/**
 * Created by kartik on 12/09/17.
 */
public class UpdateBit {

    public static void main(String[] args) {
        System.out.println(updateIthBit(3, 3, 1));
    }

    static int updateIthBit(int num, int i, int bit){
        System.out.println(~(i << 1));
        System.out.println(num & ~(i << 1));
        System.out.println(bit << i);
        return (num & ~(i << 1)) | (bit << i);
    }
}

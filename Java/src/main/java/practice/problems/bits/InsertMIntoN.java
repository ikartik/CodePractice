package practice.problems.bits;

/**
 * Created by kartik on 12/09/17.
 */
public class InsertMIntoN {

    public static void main(String[] args) {

        System.out.println(insertMIntoNMy(100000000, 10011, 2, 6));
        System.out.println(insertMIntoNBook(100000000, 10011, 2, 6));
    }

    static String insertMIntoNMy(int n, int m, int i, int j){

        int a = (~0 << (j + 1)) | ((1 << i) - 1);
        int b = n & a;
        int c = (m << i);

        return Integer.toBinaryString(b | c);

    }

    static String insertMIntoNBook(int n, int m, int i, int j) {

        int allOnes = ~0;
        int left = allOnes << (j + 1);
        int right = ((1 << i) - 1);
        int mask = left | right;

        int n_cleared = n & mask;
        int m_shifted = m << i;

        return Integer.toBinaryString(n_cleared | m_shifted);
    }
}

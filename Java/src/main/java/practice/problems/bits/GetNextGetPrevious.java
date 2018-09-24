package practice.problems.bits;

/**
 * Created by kartik on 19/09/17.
 */
public class GetNextGetPrevious {

    public static void main(String[] args) {

        int num = 1;

        int next = getNext(num);
        int prev = getPrev(next);

        System.out.println(num);
        System.out.println(next);
        System.out.println(prev);

    }

    static int getNext(int n) {
        int temp = n, c0 = 0, c1 = 0;

        while (((temp & 1) == 0) && (temp != 0)) {
            c0++;
            temp >>= 1;
        }
        while ((temp & 1) == 1){
            c1++;
            temp >>= 1;
        }
        if (c0 + c1 == 31 || c0 + c1 == 0) {
            return -1;
        }

        return n + (1 << c0) + (1 << (c1 - 1 )) - 1;
    }

    static int getPrev(int n) {
        int temp = n, c0 = 0, c1 = 0;

        while ((temp & 1) == 1) {
            c1++;
            temp >>= 1;
        }

        if(temp == 0)
            return -1;

        while (((temp & 1) ==0) && (temp != 0)) {
            c0++;
            temp >>= 1;
        }

        return n - (1 << c1) - (1 << (c0 - 1 )) + 1;
    }

}

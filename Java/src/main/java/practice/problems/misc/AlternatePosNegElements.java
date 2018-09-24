package practice.problems.misc;

/**
 * Created by kartik on 13/09/17.
 */
public class AlternatePosNegElements {

    public static void main(String[] args) {

        int a[] = {1, -3, 5, 6, -3, 6, 7, -4, 9, 10};
        int pos = 0, neg = 1, n = a.length, temp;

        while(true){
            while(pos < n && a[pos] >= 0)
                pos += 2;
            while(neg < n && a[neg] <= 0)
                neg +=2;
            if(pos < n && neg < n){
                temp = a[pos];
                a[pos] = a[neg];
                a[neg] = temp;
            }
            else
                break;
        }
        for(int each : a)
            System.out.print(each+" ");
    }

}

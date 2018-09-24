package practice.interview.problems.linkedIn;

import java.util.Arrays;

/**
 * @author kartik sharma
 * @date 20/05/18
 */
public class MergeSortedWords {

    public static void main(String[] args) {


        String a[] = {"a", "d", "j", "k", "l"};
        String b[] = {"c", "e", "f", "h", "m"};

        int n1 = a.length;
        int n2 = b.length;

        int i = 0;
        int j = 0;
        int k = 0;

        String ans[] = new String[n1+n2];

        while(i < n1 && j < n2){

            if(a[i].compareTo(b[j]) < 0){
                ans[k] = a[i];
                i += 1;
            } else {
                ans[k] = b[j];
                j += 1;
            }
            k += 1;
        }
        while(i < n1){
            ans[k] = a[i];
            i += 1;
            k += 1;
        }
        while(j < n2){
            ans[k] = b[j];
            j += 1;
            k += 1;
        }

        System.out.println(Arrays.toString(ans));

    }

}

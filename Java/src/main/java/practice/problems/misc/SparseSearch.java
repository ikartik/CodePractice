package practice.problems.misc;

import org.junit.Test;

/**
 * @author kartik sharma
 * @date 21/05/18
 */
public class SparseSearch {

    /*

    Sparse Search: Given a sorted array of strings that is interspersed with empty strings.
    Write a method to find the location of a given string.
    EXAMPLE
    Input: ball, {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""}
    Output: 4

    */

    @Test
    public void myMethod() {

        String a[] = {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
        String x = "ball";

        if (a == null || x == null || x.isEmpty())
            System.out.println("Invalid input");

        System.out.println("Found at index " + modifiedBinSearch(a, 0, a.length-1, x));

    }

    public int modifiedBinSearch(String[] a, int first, int last, String x) {

        int mid = (first + last) / 2;
        if (first > last)
            return -1;
        if (a[mid].equalsIgnoreCase(x))
            return mid;


        if (a[mid].isEmpty()) {

            int left = mid - 1;
            int right = mid + 1;

            while (true) {
                System.out.println(left + ", " + first + ", " + right + ", " + last);

                if (left < first && right > last)
                    return -1;
                else if (right <= last && !a[right].isEmpty()) {
                    mid = right;
                    break;
                } else if (left >= first && !a[left].isEmpty()) {
                    mid = left;
                    break;
                }

                left -= 1;
                right += 1;
            }
        }

        if (a[mid].equalsIgnoreCase(x))
            return mid;
        else if (a[mid].compareTo(x) < 0)
            return modifiedBinSearch(a, mid + 1, last, x);
        else
            return modifiedBinSearch(a, first, mid - 1, x);

    }

}

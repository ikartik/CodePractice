package practice.interview.problems.uber;

/**
 * @author kartik sharma
 * @date 04/10/18
 */
public class SearchInSortedRotatedArray {

    // Search an Element in a Sorted and Rotated Array


    public static void main(String[] args) {

        int[] a = {10, 20, 1, 3, 6, 8};
//        int[] a = {1, 2, 3, 4, 6, 7, 9};

        int x = 7;

        for (int i = 0; i < a.length; i++) {
            binSearch(a, a[i], 0, a.length - 1);
        }

    }

    static void binSearch(int a[], int x, int l, int r) {

        if (l > r)
            return;

        int mid = (l + r) / 2;

        if (a[mid] == x)
            System.out.println(x + " found at index " + mid);
        /*else if (a[mid] > x) {
            if (a[r] > x)
                binSearch(a, x, mid + 1, r);
            else
                binSearch(a, x, l, mid - 1);
        } else if (a[mid] < x) {
            if (a[l] < x)
                binSearch(a, x, l, mid - 1);
            else
                binSearch(a, x, mid + 1, r);
        }*/

        else if (a[l] <= a[mid]) {
            if (a[l] <= x && a[mid] >= x)
                binSearch(a, x, l, mid - 1);
            else
                binSearch(a, x, mid + 1, r);
        } else if (a[mid] <= x && a[r] >= x)
            binSearch(a, x, mid + 1, r);
        else
            binSearch(a, x, l, mid - 1);

    }

}

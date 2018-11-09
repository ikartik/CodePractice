package practice.interview.problems.chegg;

/**
 * @author kartik sharma
 * @date 09/11/18
 */
public class FindPivotElementInRotatedSortedArray {


    public static void main(String[] args) {

        int a[] = {11, 12, 3, 5, 8, 10};

        findIt(a, 0, a.length - 1);

    }

    public static void findIt(int a[], int left, int right) {

        if (left > right)
            return;
        if (left == right) {
            System.out.println("Equal : " + a[left]);
            return;
        }

        int mid = (left + right) / 2;

        if (left == right - 1) {
            System.out.println("Single : " + a[mid + 1]);
            return;
        }

        if (a[mid] < a[mid - 1]) {// && a[mid] > a[mid+1]) {
            System.out.println("Found : " + a[mid]);
            return;
        } else {
            if (a[mid] < a[left])
                findIt(a, left, mid);
            else if(a[mid] > a[right])
                findIt(a, mid, right);
            else{
                System.out.println("sorted array, not rotated : " + a[0]);
                return;
            }
        }

    }

}

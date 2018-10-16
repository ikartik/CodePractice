package practice.problems.misc;

import java.util.Stack;

/**
 * @author kartik sharma
 * @date 12/10/18
 */
public class NextGreaterElement {

    public static void main(String[] args) {

        int a[] = {40, 50, 11, 32, 55, 68, 75};
        int n = a.length;
        int b[] = new int[n];

        //    b = {50, 55, 32, 55, 68, 75, -1}


        Stack<Integer> s = new Stack<>();
        s.push(a[0]);

        for (int i = 1; i < n; i++) {
            if (s.peek() != null) {
                while (true) {
                    if (s.size() == 0 || s.peek() > a[i]) {
                        break;
                    }
                    System.out.println(s.pop() + ":" + a[i]);
                }
            }
            s.push(a[i]);
        }
        while (s.size() != 0) {
            System.out.println(s.pop() + ":" + -1);
        }

    }

}

package practice.interview.problems.blackbuck;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author kartik sharma
 * @date 30/04/18
 */
public class TransformQueue {

    // Given a queue and a number k, reverse the first k elements in the queue.
    // Input
    //      Queue = {7, -1, 10, 16, 54, 6, 18}
    //      k = 3
    // Output
    //      Queue = {10, -1, 7, 16, 54, 6, 18}


    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
//        7, -1 , 10 , 16, 54, 6  18
        q.add(7);
        q.add(-1);
        q.add(10);
        q.add(16);
        q.add(54);
        q.add(6);
        q.add(18);

        System.out.println(q);
        transform(q, 3, q.size());
        System.out.println(q);


    }

    static void transform(Queue<Integer> q, int k, int n) {

        if (q.isEmpty() || k > q.size())
            return;

        Stack<Integer> s = new Stack<Integer>();

        int i = 0;
        while (i < k) {
            s.push(q.remove());
            i++;
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        i = n - k;
        while (i > 0) {
            q.add(q.remove());
            i -= 1;
        }
    }
}
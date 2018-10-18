package practice.interview.problems.lifcare;

import org.junit.Test;

/**
 * @author kartik sharma
 * @date 18/10/18
 */

public class NthElementFromLast {

    class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    @Test
    public void method() {

        Node list1 = new Node(1);
        list1.next = new Node(2);
        list1.next.next = new Node(3);
        list1.next.next.next = new Node(4);
        list1.next.next.next.next = new Node(5);

        int n = 3;

        Node n1 = list1, n2 = list1;

        while (n > 0) {
            n2 = n2.next;
            n -= 1;
        }

        while (n2 != null) {
            n1 = n1.next;
            n2 = n2.next;
        }

        System.out.println(n1.data);

    }
}

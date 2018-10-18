package practice.interview.problems.lifcare;

import org.junit.Test;

import java.util.Stack;

/**
 * @author kartik sharma
 * @date 18/10/18
 */
public class SumOfTwoLinkedList {

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
//        list1.next = new Node(2);
//        list1.next.next = new Node(3);
//        list1.next.next.next = new Node(4);
//        list1.next.next.next.next = new Node(5);


        Node list2 = new Node(3);
        list2.next = new Node(6);
//        list2.next.next = new Node(7);
//        list2.next.next.next = new Node(2);
//        list2.next.next.next.next = new Node(3);

        Node list3 = sum(list1, list2);

        printList(list1);
        printList(list2);
        printList(list3);

    }

    public void printList(Node list) {
        while (list != null) {
            System.out.print(list.data + " ");
            list = list.next;
        }
        System.out.println("");
    }

    public Node sum(Node l1, Node l2) {
        Node result = null;

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        while (l1 != null || l2 != null) {
            if (l1 != null) {
                s1.push(l1.data);
                l1 = l1.next;
            }
            if (l2 != null) {
                s2.push(l2.data);
                l2 = l2.next;
            }
        }

        int carry = 0;

        while (!s1.isEmpty() && !s2.isEmpty()) {

            int total = s1.pop() + s2.pop() + carry;
            carry = total / 10;
            total = total % 10;

            Node n = new Node(total);
            n.next = result;
            result = n;

        }

        Stack<Integer> s3 = s1.isEmpty() ? s2 : s1;

        while (!s3.isEmpty()) {
            int total = s3.pop() + carry;
            carry = total / 10;
            total = total % 10;

            Node n = new Node(total);
            n.next = result;
            result = n;
        }

        if (carry != 0) {
            Node n = new Node(carry);
            n.next = result;
            result = n;
        }

        return result;
    }

}
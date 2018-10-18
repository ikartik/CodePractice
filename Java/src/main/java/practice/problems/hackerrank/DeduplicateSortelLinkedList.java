package practice.problems.hackerrank;

import org.junit.Test;

/**
 * @author kartik sharma
 * @date 17/10/18
 */
public class DeduplicateSortelLinkedList {


    // Delete duplicate-value nodes from a sorted linked list

    @Test
    public void testMethod() {

        LinkedList list = new LinkedList();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.push(6);
        list.push(7);
        list.push(8);
        list.push(9);

        list.printList();

    }

    class LinkedList {
        public Node head;

        class Node {
            private int data;
            private Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public void push(int new_data) {
            Node new_node = new Node(new_data);
            new_node.next = head;
            head = new_node;
        }

        void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

    }

}

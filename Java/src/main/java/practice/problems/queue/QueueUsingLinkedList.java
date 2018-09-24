package practice.problems.queue;

import org.junit.Test;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

/**
 * @author kartik sharma
 * @date 15/09/18
 */
public class QueueUsingLinkedList {

    class Queue {
        private Node front;
        private Node back;
        private Node queue;

        public Queue() {
            this.front = this.back = null;
        }

        public void enQueue(int data) {
            Node node = new Node(data);

            if (front == null) {
                queue = node;
                front = node;
            } else {
                back.next = node;
            }
            back = node;
        }

        public Integer deQueue() {
            int val;
            if (back == null || front == null) {
                return null;
            } else {
                val = front.data;
                queue = front.next;
                front = queue;
            }
            return val;
        }

        public void printQueue() {
            System.out.print("Current queue : ");
            Node head = queue;
            while (head != null) {
                System.out.print(head.data + " ");
                head = head.next;
            }
        }

        public Integer poll() throws NoSuchElementException {
            return front.data;
        }

        public Integer peek() {
            return front != null ? front.data : null;
        }

    }

    class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    @Test
    public void testMethod() {

        Queue q = new Queue();

        System.out.println("Deleted : " + q.deQueue());

        q.enQueue(1);
        q.enQueue(2);

        System.out.println("Deleted : " + q.deQueue());

        q.enQueue(3);
        q.enQueue(4);

        System.out.println("Deleted : " + q.deQueue());

        q.enQueue(5);
        q.enQueue(6);

        q.printQueue();

    }

}

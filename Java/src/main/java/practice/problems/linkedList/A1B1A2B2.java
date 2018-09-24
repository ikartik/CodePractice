package practice.problems.linkedList;

import org.junit.Test;

/**
 * @author kartik sharma
 * @date 16/09/18
 */

public class A1B1A2B2 {


    /*

    Given a list like : 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8
    Transform it as : 1 -> 5 -> 2 -> 6 -> 3 -> 7 -> 4 -> 8

    */

    class Node{
        private int data;
        private Node next;
        public Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    @Test
    public void testMethod(){
        Node list = new Node(1);
        list.next = new Node(2);
        list.next.next = new Node(3);
        list.next.next.next = new Node(4);
        list.next.next.next.next = new Node(10);
        list.next.next.next.next.next = new Node(20);
        list.next.next.next.next.next.next = new Node(30);
        list.next.next.next.next.next.next.next = new Node(40);

        printList(list);

        Node newList = transform(list);

        printList(newList);
    }

    public Node transform(Node head){
        Node start = head;
        Node slow = head;
        Node fast = head.next;

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        while(start.next.next != null){

            Node pick = slow.next; // 4
            slow.next = pick.next; // 3-5
            Node later = start.next; // 2
            start.next = pick; // 1-4
            pick.next = later; // 1-4-2

            start = start.next.next;
        }
        return head;
    }

    public void printList(Node list){
        while(list != null){
            System.out.print(list.data + " ");
            list = list.next;
        }
        System.out.println("");
    }

}

/*
1-2-3-4-5-6

1-4-2-3-5-6
1-4-2-5-3-6


*/
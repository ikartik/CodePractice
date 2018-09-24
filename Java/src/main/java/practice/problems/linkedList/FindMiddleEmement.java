package practice.problems.linkedList;

import org.junit.Test;

/**
 * @author kartik sharma
 * @date 15/09/18
 */
public class FindMiddleEmement {

    class LinkedList{
        private int data;
        private LinkedList next;
        public LinkedList(int data){
            this.data = data;
            this.next = null;
        }
    }

    @Test
    public void testMethod(){

        LinkedList list = new LinkedList(1);
        list.next = new LinkedList(2);
        list.next.next = new LinkedList(3);
        list.next.next.next = new LinkedList(4);
        list.next.next.next.next = new LinkedList(5);
        list.next.next.next.next.next = new LinkedList(6);
        list.next.next.next.next.next.next = new LinkedList(7);
        list.next.next.next.next.next.next.next = new LinkedList(8);


        System.out.println(findMiddle(list));

    }

    int findMiddle(LinkedList head){

        if(head == null)
            return 0;

        LinkedList slow = head;
        LinkedList fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

}

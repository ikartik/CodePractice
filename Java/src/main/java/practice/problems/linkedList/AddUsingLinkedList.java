package practice.problems.linkedList;

/**
 * Created by kartik on 19/08/17.
 */
public class AddUsingLinkedList {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        LinkedList.head1 = new LinkedList.Node(1);
        LinkedList.head1.next = new LinkedList.Node(2);
        LinkedList.head1.next.next = new LinkedList.Node(3);
        LinkedList.head1.next.next.next = new LinkedList.Node(8);

        LinkedList.head2 = new LinkedList.Node(2);
        LinkedList.head2.next = new LinkedList.Node(4);
        LinkedList.head2.next.next = new LinkedList.Node(6);
        LinkedList.head2.next.next.next = new LinkedList.Node(8);

        list.printList(LinkedList.head1);
        list.printList(LinkedList.head2);
        LinkedList.Node rs = list.addLinkedList(LinkedList.head1, LinkedList.head2);
        list.printList(rs);
    }

}

class LinkedList {
    static Node head1, head2;
    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    Node addLinkedList(Node head1, Node head2){

        head1 = reverseList(head1);
        head2 = reverseList(head2);

        Node bigList = head1;
        Node bigHead = head1;
        Node smallList = head2;

        while(bigList != null && smallList != null){
            bigList = bigList.next;
            smallList = smallList.next;
        }

        if(bigList == null){
            bigList = head2;
            smallList = head1;
            bigHead = head2;
        }
        else{
            bigList = head1;
            bigHead = head1;
            smallList = head2;
        }

        int carry = 0;
        while(smallList != null && bigList != null){
            int data1 = smallList.data;
            int data2 = bigList.data;

            data1 += data2 + carry;
            if(data1 >= 10){
                data2 = data1%10;
                carry = 1;
            } else{
                data2 = data1;
                carry = 0;
            }
            bigList.data = data2;
            smallList = smallList.next;
            bigList = bigList.next;
        }

        while(carry!=0 && bigList!=null){
            bigList.data = bigList.data + carry;
            bigList = bigList.next;
            carry = 0;
        }

        return reverseList(bigHead);
    }

    Node reverseList(Node list){
        Node headOfreversed = null;
        Node headOfunreversed = list;
        Node nodeToreverse = null;

        while(headOfunreversed != null){
            headOfreversed = nodeToreverse;
            nodeToreverse = headOfunreversed;
            headOfunreversed = headOfunreversed.next;
            nodeToreverse.next = headOfreversed;
        }
        headOfreversed = nodeToreverse;
        return headOfreversed;
    }

    void printList(Node list){
        while(list != null){
            System.out.print(list.data+" ");
            list = list.next;
        }
        System.out.println("");
    }
}
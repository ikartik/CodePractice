package practice.problems.linkedList;

/**
 * Created by kartik on 22/08/17.
 */
public class MergeSortLinkedList {

    public static void main(String[] args) {

        LL ll = new LL();
        LL.Node linkedList = new LL.Node(14);
        linkedList.next = new LL.Node(10);
        linkedList.next.next = new LL.Node(16);
        linkedList.next.next.next = new LL.Node(5);
        linkedList.next.next.next.next = new LL.Node(11);

        ll.printList(linkedList);

        LL.Node sortedLinkedList = ll.mergeSort(linkedList);
        System.out.println("###");

        ll.printList(sortedLinkedList);
    }
}

class LL{

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }
    void printList(Node list){
        while(list != null){
            System.out.println(list.data);
            list = list.next;
        }
    }
    Node mergeSort(Node head){
        if (head == null || head.next == null)
            return head;

        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;
        middle.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(nextOfMiddle);

        Node sortedList = sortedMerge(left, right);

        return sortedList;
    }

    Node getMiddle(Node head){

        if(head == null)
            return head;

        Node fastPointer = head.next;
        Node slowPointer = head;

        while(fastPointer != null){
            fastPointer = fastPointer.next;
            if(fastPointer != null){
                fastPointer = fastPointer.next;
                slowPointer = slowPointer.next;
            }
        }
        return slowPointer;
    }

    Node sortedMerge(Node left, Node right){

        Node result = null;

        if(left == null)
            return right;
        if(right == null)
            return left;

        if(left.data <= right.data){
            result = left;
            result.next = sortedMerge(left.next, right);
        }
        else{
            result = right;
            result.next = sortedMerge(left, right.next);
        }

        return result;
    }
}


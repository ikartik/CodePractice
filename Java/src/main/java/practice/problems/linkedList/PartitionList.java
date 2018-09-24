package practice.problems.linkedList;

/**
 * Created by kartik on 22/08/17.
 */
public class PartitionList {

    public static void main(String[] args) {
        LL ll = new LL();
        LL.Node list = new LL.Node(3);
        list.next = new LL.Node(5);
        list.next.next = new LL.Node(8);
        list.next.next.next = new LL.Node(5);
        list.next.next.next.next = new LL.Node(10);
        list.next.next.next.next.next = new LL.Node(2);
        list.next.next.next.next.next.next = new LL.Node(1);

        ll.printList(list);
        System.out.println("###");
        ll.printList(partitionList(list, 5));

    }

    static LL.Node partitionList(LL.Node node, int x){

        LL.Node head = node;
        LL.Node tail = node;

        while(node != null){

            LL.Node next = node.next;

            if(node.data < x){
                node.next = head;
                head = node;
            }
            else{
                tail.next = node;
                tail = node;
            }
            node = next;
        }
        tail.next = null;
        return head;
    }
}

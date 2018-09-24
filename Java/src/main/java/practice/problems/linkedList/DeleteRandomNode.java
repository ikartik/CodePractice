package practice.problems.linkedList;

/**
 * Created by kartik on 22/08/17.
 */
public class DeleteRandomNode {

    // Delete any node except first and last

    public static void main(String[] args) {

        LL ll = new LL();
        LL.Node list = new LL.Node(1);
        list.next = new LL.Node(2);
        list.next.next = new LL.Node(3);
        list.next.next.next = new LL.Node(4);
        list.next.next.next.next = new LL.Node(5);
        list.next.next.next.next.next = new LL.Node(6);

        ll.printList(list);
        System.out.println("###");

        Boolean deleted = deleteRandomNode(list.next.next.next);

        if(deleted == true)
            ll.printList(list);
        else
            ll.printList(null);
    }

    static Boolean deleteRandomNode(LL.Node node){

        if(node == null || node.next == null)
            return false;

        LL.Node next = node.next;
        node.data = next.data;
        node.next = next.next;

        return true;
    }
}

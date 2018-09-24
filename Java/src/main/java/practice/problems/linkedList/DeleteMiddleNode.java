package practice.problems.linkedList;

/**
 * Created by kartik on 22/08/17.
 */
public class DeleteMiddleNode {

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

        ll.printList(deleteMiddleNode(list));
    }

    static LL.Node deleteMiddleNode(LL.Node node){

        LL.Node result = node;

        if(node == null)
            return null;

        LL.Node fastPtr = node;
        LL.Node slowPtr = node;
        LL.Node previous = null;

        while(fastPtr != null){
            fastPtr = fastPtr.next;
            if(fastPtr != null){
                fastPtr = fastPtr.next;
                previous = slowPtr;
                slowPtr = slowPtr.next;
            }
        }
        previous.next = slowPtr.next;
        return result;
    }

}

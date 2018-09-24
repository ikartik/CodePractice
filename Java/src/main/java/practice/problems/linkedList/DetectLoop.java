package practice.problems.linkedList;

/**
 * Created by kartik on 24/08/17.
 */
public class DetectLoop {

    public static void main(String[] args) {

        LL ll = new LL();

        LL.Node list = new LL.Node(1);
        list.next = new LL.Node(2);
        list.next.next = new LL.Node(3);
        list.next.next.next = new LL.Node(4);
        list.next.next.next.next = new LL.Node(5);
        list.next.next.next.next.next = list.next.next;
        list.next.next.next.next.next = new LL.Node(6);
        list.next.next.next.next.next.next = new LL.Node(7);
        list.next.next.next.next.next.next.next = new LL.Node(8);
        list.next.next.next.next.next.next.next.next = list.next.next;
//        list.next.next.next.next.next.next.next.next.next = new LL.Node(10);
//        list.next.next.next.next.next.next.next.next.next.next = new LL.Node(11);
//        list.next.next.next.next.next.next.next.next.next.next.next = new LL.Node(12);
//        list.next.next.next.next.next.next.next.next.next.next.next.next = list.next.next.next; // 4

        LL.Node point = findLoopPoint(list);

        System.out.println(point!=null?point.data:null);

    }

    static LL.Node findLoopPoint(LL.Node head){

        LL.Node fast = head;
        LL.Node slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                break;
        }

        if(fast == null || fast.next == null)
            return null;

        fast = head;

        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }

        return fast;
    }

}

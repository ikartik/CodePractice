package practice.problems.linkedList;

/**
 * Created by kartik on 23/08/17.
 */
public class SumOfTwoLists {

    public static void main(String[] args) {

        LL list = new LL();

        LL.Node first = new LL.Node(1);
        first.next = new LL.Node(2);
        first.next.next = new LL.Node(3);

        LL.Node second = new LL.Node(4);
        second.next = new LL.Node(7);
        second.next.next = new LL.Node(2);

        list.printList(addLists(first, second, 0));

    }

    static LL.Node addLists(LL.Node l1, LL.Node l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }
        LL.Node result = null;
        int value = carry;
        if (l1 != null) {
            value += l1.data;
        }
        if (l2 != null) {
            value += l2.data;
        }
        result.data = value % 10;
        if (l1 != null || l2 != null) {
            LL.Node more = addLists(l1 == null ? null : l1.next, l2 == null ? null : l2.next, value >= 10 ? 1 : 0);
//            result.setNext(more);
        }
        return result;
    }

}

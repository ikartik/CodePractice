package practice.problems.linkedList;

/**
 * @author kartik sharma
 * @date 30/04/18
 */
public class MergeKSortedLists {

    /*

    Merge k sorted linked lists and return it as one sorted list.

    Example :

    1 -> 10 -> 20
    4 -> 11 -> 13
    3 -> 8 -> 9
    will result in

    1 -> 3 -> 4 -> 8 -> 9 -> 10 -> 11 -> 13 -> 20

    */


    static class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(10);
        l1.next.next = new ListNode(20);

        ListNode l2 = new ListNode(4);
        l2.next = new ListNode(11);
        l2.next.next = new ListNode(13);

        ListNode l3 = new ListNode(3);
        l3.next = new ListNode(8);
        l3.next.next = new ListNode(9);

        ListNode result = new ListNode(-1);

        while(l1 != null || l2 != null || l3 != null){

            if(l1 != null && l2 != null && l3 != null){
                if(l1.val < l2.val && l1.val < l3.val)
                    result.next = l1;
                if(l2.val < l1.val && l2.val < l3.val)
                    result.next = l2;
                if(l3.val < l1.val && l3.val < l3.val)
                    result.next = l3;
            }

        }


    }


}

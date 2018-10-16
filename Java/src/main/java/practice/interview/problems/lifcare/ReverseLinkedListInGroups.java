package practice.interview.problems.lifcare;

import java.util.Stack;

/**
 * @author kartik sharma
 * @date 11/10/18
 */
public class ReverseLinkedListInGroups {

    static class LinkedList {
        private LinkedList next;
        private int data;

        public LinkedList(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList(1);
        list.next = new LinkedList(2);
        list.next.next = new LinkedList(3);
        list.next.next.next = new LinkedList(4);
        list.next.next.next.next = new LinkedList(5);
        list.next.next.next.next.next = new LinkedList(6);
        list.next.next.next.next.next.next = new LinkedList(7);
        list.next.next.next.next.next.next.next = new LinkedList(8);
        list.next.next.next.next.next.next.next.next = new LinkedList(9);

        int k = 2;

        printList(list);

        LinkedList reversed = reverseInGroups(list, k);

        printList(reversed);

    }

    static LinkedList reverseInGroups(LinkedList root, int k) {

        int count = 0;

        LinkedList ans = new LinkedList(0);
        LinkedList temp = ans;

        Stack<LinkedList> stack = new Stack<>();

        while (root != null) {

            if (count % k == 0 && count != 0) {

                while (!stack.isEmpty()) {
                    temp.next = stack.pop();
                    temp = temp.next;
                    temp.next = null;
                }
            }
            stack.push(root);
            root = root.next;
            count += 1;

        }

        while (!stack.isEmpty()) {
            temp.next = stack.pop();
            temp = temp.next;
            temp.next = null;
        }

        return ans.next;

    }


    static void printList(LinkedList root) {
        while (root != null) {
            System.out.print(root.data + " ");
            root = root.next;
        }
        System.out.println("");
    }


/*    static LinkedList reverse(LinkedList root) {
        LinkedList reversedList = null;
        LinkedList reversedHead = null;
        LinkedList unreversedHead = root;

        while (unreversedHead != null) {
            reversedHead = unreversedHead;
            unreversedHead = unreversedHead.next;
            reversedHead.next = reversedList;
            reversedList = reversedHead;
        }

        return reversedList;
    }*/


}

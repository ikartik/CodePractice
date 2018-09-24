package practice.problems.linkedList;

/**
 * Created by kartik on 22/08/17.
 */
public class KthLastElement {

    public static void main(String[] args) {

        LL.Node test = null;

        LL.Node list = new LL.Node(1);
        list.next = new LL.Node(2);
        list.next.next = new LL.Node(3);
        list.next.next.next = new LL.Node(4);
        list.next.next.next.next = new LL.Node(5);
        list.next.next.next.next.next = new LL.Node(6);
        list.next.next.next.next.next.next = new LL.Node(7);

        LL linkedList = new LL();
        linkedList.printList(list);

        System.out.println("###");

//        System.out.println(kthLastElement(list, 1));
//        System.out.println(LastKthElement(list, 5).data);

        LL.Node result = twoPointerKthElementFromLast(list, 12);

        System.out.println(result!=null?result.data:null);

    }

    static int kthLastElement(LL.Node list, int k){

        if(list == null)
            return 0;

        int index = kthLastElement(list.next, k) + 1;

        if(index == k){
            System.out.println(k + " th element from last is "+ list.data);
        }
        return index;
    }

    static LL.Node LastKthElement(LL.Node head, int k){
        Index idx = new Index();
        return LastKthElement(head, k, idx);
    }

    static LL.Node LastKthElement(LL.Node head, int k, Index idx){
        if(head == null)
            return null;

        LL.Node node = LastKthElement(head.next, k, idx);
        idx.value = idx.value + 1;

        if(idx.value == k){
            return head;
        }
        return node;
    }

    static LL.Node twoPointerKthElementFromLast(LL.Node list, int k){

        LL.Node first = list;
        LL.Node second = list;

        if(list == null)
            return null;

        for(int i=0; i<k && second!=null; i++){
            second = second.next;
        }

        while(second != null){
            first = first.next;
            second = second.next;
        }
        return first;
    }
}

class Index{
    public int value = 0;
}
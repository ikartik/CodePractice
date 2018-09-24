package practice.problems.linkedList;

/**
 * Created by kartik on 23/08/17.
 */
public class SumLists {

    public static void main(String[] args) {

        LL list = new LL();

        LL.Node first = new LL.Node(1);
        first.next = new LL.Node(2);
//        first.next.next = new LL.Node(3);

        LL.Node second = new LL.Node(4);
        second.next = new LL.Node(7);
        second.next.next = new LL.Node(2);

        LL.Node third = new LL.Node(3);
        third.next = new LL.Node(2);
//        third.next.next = new LL.Node(1);

        LL.Node fourth = new LL.Node(7);
        fourth.next = new LL.Node(4);
        fourth.next.next = new LL.Node(5);

        list.printList(addBackwards(first, second));
        System.out.println("###");
        list.printList(addForwards(third, fourth));

    }

    static LL.Node addBackwards(LL.Node first, LL.Node second){

        LL.Node bigger = first;
        LL.Node smaller = second;

        while(bigger != null && smaller != null){
            bigger = bigger.next;
            smaller = smaller.next;
        }

        if(bigger == null && smaller != null){
            bigger = second;
            smaller = first;
        }
        else{
            bigger = first;
            smaller = second;
        }

//        bigger = reverseList(bigger);
//        smaller = reverseList(smaller);

        LL.Node biggerHead = bigger;

        int carry = 0;
        int data1, data2;

        while(bigger != null && smaller != null){

            data1 = bigger.data;
            data2 = smaller.data;

            data2 = carry + data1 + data2;

            if(data2 >= 10){
                data1 = data2%10;
                carry = 1;
                bigger.data = data1;
            }
            else{
                bigger.data = data2;
                carry = 0;
            }
            bigger = bigger.next;
            smaller = smaller.next;
        }

        return biggerHead;
    }

    static LL.Node addForwards(LL.Node first, LL.Node second){

        LL.Node bigger = first;
        LL.Node smaller = second;

        while(bigger != null && smaller != null){
            bigger = bigger.next;
            smaller = smaller.next;
        }

        if(bigger == null && smaller != null){
            bigger = second;
            smaller = first;
        }
        else{
            bigger = first;
            smaller = second;
        }

        bigger = reverseList(bigger);
        smaller = reverseList(smaller);

        LL.Node biggerHead = bigger;

        int carry = 0;
        int data1, data2;

        while(bigger != null && smaller != null){

            data1 = bigger.data;
            data2 = smaller.data;

            data2 = carry + data1 + data2;

            if(data2 >= 10){
                data1 = data2%10;
                carry = 1;
                bigger.data = data1;
            }
            else{
                bigger.data = data2;
                carry = 0;
            }
            bigger = bigger.next;
            smaller = smaller.next;
        }

        return reverseList(biggerHead);
    }

    static LL.Node reverseList(LL.Node list){

        LL.Node rList = null;
        LL.Node rHead = null;
        LL.Node uHead = list;

        while(uHead != null){

            rHead = uHead;
            uHead = uHead.next;
            rHead.next = rList;
            rList = rHead;

        }

        return rList;
    }

}

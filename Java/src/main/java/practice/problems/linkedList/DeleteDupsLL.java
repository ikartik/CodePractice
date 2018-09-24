package practice.problems.linkedList;

/**
 * Created by kartik on 22/08/17.
 */
public class DeleteDupsLL {
    public static void main(String[] args) {

        LL linkedList = new LL();
        LL.Node list = new LL.Node(13);
        list.next = new LL.Node(6);
        list.next.next = new LL.Node(12);
        list.next.next.next = new LL.Node(6);
        list.next.next.next.next = new LL.Node(14);
        list.next.next.next.next.next = new LL.Node(13);
        list.next.next.next.next.next.next = new LL.Node(7);

        linkedList.printList(list);
        System.out.println("###");

        linkedList.printList(deleteDupWithNoBuffer(list));

        /*HashSet<Integer> set = new HashSet<Integer>();

        LL.Node previous = null;
        LL.Node newList = list;

        while(list != null){

            if(set.contains(list.data)){
                previous.next = list.next;
            }
            else{
                set.add(list.data);
                previous = list;
            }
            list = list.next;
        }
        linkedList.printList(newList);*/
    }

    static LL.Node deleteDupWithNoBuffer(LL.Node list){

        LL.Node result = list;
        LL.Node firstPtr = list;
        LL.Node secondPtr = null;

        while(firstPtr != null){
            secondPtr = firstPtr;
            while(secondPtr.next != null){
                if(secondPtr.next.data == firstPtr.data){
                    secondPtr.next = secondPtr.next.next;
                }
                secondPtr = secondPtr.next;
            }
            firstPtr = firstPtr.next;
        }
        return result;
    }

}

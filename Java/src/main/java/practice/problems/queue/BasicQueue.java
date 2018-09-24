package practice.problems.queue;

import java.util.EmptyStackException;

/**
 * Created by kartik on 25/08/17.
 */
public class BasicQueue {

    static class QueueNode<Integer>{

        private int data;
        private QueueNode next;

        public QueueNode(int data){
            this.data = data;
        }
    }

    private QueueNode<Integer> first;
    private QueueNode<Integer> last;

    public int peek(){
        if(first == null)
            throw new EmptyStackException();
        else
            return first.data;
    }

    public int remove(){
        if(first == null)
            throw new EmptyStackException();
        else{
            int value = first.data;
            first = first.next;
            if(first == null)
                last = null;
            return value;
        }
    }

    public void push(int data){
        QueueNode n = new QueueNode(data);
        if(last == null)
            last = n;
        else
            last.next = n;
        last = n;
        if(first == null)
            first = last;
    }

    public Boolean isEmpty(){
        return first == null;
    }
}

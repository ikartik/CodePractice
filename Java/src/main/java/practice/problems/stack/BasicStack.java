package practice.problems.stack;

import java.util.EmptyStackException;

/**
 * Created by kartik on 24/08/17.
 */
public class BasicStack<Integer> {

    private static class StackNode<Integer> {

        private int data;
        private StackNode<Integer> next;

        public StackNode(int data){
            this.data = data;
        }
    }

    private StackNode<Integer> top;

    public void push(int data){
        StackNode<Integer> node = new StackNode<Integer>(data);
        node.next = top;
        top = node;
    }

    public int pop() {
        if (top != null){
            int item = top.data;
            top = top.next;
            return item;
        }
        else{
            throw new EmptyStackException();
        }
    }

    public int peek(){
        if(top != null){
            return top.data;
        }
        else{
            throw new EmptyStackException();
        }
    }

    public Boolean isEmpty(){
        return top == null;
    }

}


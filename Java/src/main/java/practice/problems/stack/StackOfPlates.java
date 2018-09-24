package practice.problems.stack;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Created by kartik on 28/08/17.
 */
public class StackOfPlates extends BasicStack{

    private int capacity;
    ArrayList<BasicStack> stackList = new ArrayList<BasicStack>();

    public StackOfPlates(int capacity){
        this.capacity = capacity;
    }

    public void push(int data){
        BasicStack stack = getLastStack();
        if(stack!=null){
            stack.push(data);
        }
        else {
            stack  = new BasicStack();
            stack.push(data);
            stackList.add(stack);
        }
    }
    public int pop(){
        BasicStack stack = getLastStack();
        int value = 0;
        if(stack!=null){
            value = stack.pop();
            if(stack.isEmpty())
                stackList.remove(stackList.size()-1);
        }
        else {
            throw new EmptyStackException();
        }
        return value;
    }
    public int peek(){
        BasicStack stack = getLastStack();
        if(stack!=null){
            return stack.peek();
        }
        else{
            throw new EmptyStackException();
        }
    }
    public BasicStack getLastStack(){
        if(stackList.size() == 0)
            return null;
        else
            return stackList.get(stackList.size()-1);
    }
    public Boolean isEmpty(){
        BasicStack stack = getLastStack();
        return stack==null||stack.isEmpty();
    }
}

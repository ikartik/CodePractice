package practice.problems.queue;

import practice.problems.stack.BasicStack;

/**
 * Created by kartik on 07/09/17.
 */
public class QueueUsingTwoStacks {

    BasicStack stackNew, stackOld;

    public QueueUsingTwoStacks(){
        stackNew = new BasicStack();
        stackOld = new BasicStack();
    }

    public int remove(){
        shiftItems();
        return stackOld.pop();
    }
    public int peek(){
        shiftItems();
        return stackOld.peek();
    }
    public void add(int value){
        stackNew.push(value);
    }
    public void shiftItems(){
        if(stackOld.isEmpty()){
            while(!stackNew.isEmpty()){
                stackOld.push(stackNew.pop());
            }
        }
    }

}

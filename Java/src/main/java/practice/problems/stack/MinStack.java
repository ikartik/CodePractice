package practice.problems.stack;

/**
 * Created by kartik on 24/08/17.
 */
public class MinStack extends BasicStack<Integer>{

    BasicStack<Integer> s2;
    public MinStack(){
        s2 = new BasicStack<Integer>();
    }

    public void push(int data){
        if(getMin() > data){
            s2.push(data);
        }
        super.push(data);
    }

    public int pop(){
        int value = super.pop();
        if(getMin() == value){
            s2.pop();
        }
        return value;
    }

    public int getMin(){
        if(s2.isEmpty())
            return Integer.MAX_VALUE;
        else
            return s2.peek();
    }

}

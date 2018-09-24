package practice.problems.stack;

/**
 * Created by kartik on 24/08/17.
 */
public class StackMainClass {

    public static void main(String[] args) {

        BasicStack bs = new BasicStack();

//        bs.push(5);
//        System.out.println(bs.getMin());
//        bs.push(3);
//        System.out.println(bs.getMin());
//        bs.push(8);
//        System.out.println(bs.getMin());
//        bs.push(2);
//        System.out.println(bs.getMin());
//        bs.push(9);
//        System.out.println(bs.getMin());
//        bs.push(1);
//        System.out.println(bs.getMin());
//        System.out.println("Deleted "+bs.pop());
//        System.out.println(bs.getMin());
//        System.out.println("Deleted "+bs.pop());
//        System.out.println(bs.getMin());
//        System.out.println("Deleted "+bs.pop());
//        System.out.println(bs.getMin());
//        System.out.println("Deleted "+bs.pop());
//        System.out.println(bs.getMin());

        bs.push(21);
        bs.push(12);
        bs.push(5);
        bs.push(1);
        bs.push(6);
        bs.push(2);

        bs = sort(bs);

    }

    public static BasicStack sort(BasicStack stack){
        BasicStack rev = new BasicStack();

        while(!stack.isEmpty()){
            int temp = stack.pop();
            while(!rev.isEmpty() && rev.peek() > temp){
                stack.push(rev.pop());
            }
            rev.push(temp);
        }
        while(!rev.isEmpty()){
            stack.push(rev.pop());
        }
        return stack;
    }
}

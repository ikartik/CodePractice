package practice.problems.queue;

/**
 * Created by kartik on 25/08/17.
 */
public class QueueMainClass {

    public static void main(String[] args){

        QueueUsingTwoStacks que = new QueueUsingTwoStacks();

        que.add(4);
        que.add(7);
        que.add(1);
        que.remove();
        que.add(5);
        que.remove();
        que.remove();
        System.out.println(que.peek());

    }

}

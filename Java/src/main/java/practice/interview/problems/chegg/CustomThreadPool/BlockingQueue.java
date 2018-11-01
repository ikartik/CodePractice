package practice.interview.problems.chegg.CustomThreadPool;

import java.util.LinkedList;
import java.util.List;

/**
 * @author kartik sharma
 * @date 01/11/18
 */
public class BlockingQueue {

    private List taskQueue = new LinkedList<>();
    private int limit = 1;

    public BlockingQueue(int size) {
        if (size > 0)
            this.limit = size;
    }

    public synchronized void enqueue(Object item) throws InterruptedException {
        while (taskQueue.size() == limit)
            wait();
        if (taskQueue.size() == 0)
            notifyAll();
        taskQueue.add(item);
    }

    public synchronized Object dequeue() throws InterruptedException {
        while (taskQueue.size() == 0)
            wait();
        if (taskQueue.size() == limit)
            notifyAll();
        return taskQueue.remove(0);
    }

}

package practice.interview.problems.chegg.CustomThreadPool;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kartik sharma
 * @date 01/11/18
 */
public class ThreadPool {

    private BlockingQueue queue;
    private List<PoolThread> threads = new ArrayList<>();
    private Boolean stopped = false;

    public ThreadPool(int poolSize) {
        queue = new BlockingQueue(poolSize);
        for (int i = 0; i < poolSize; i++) {
            threads.add(new PoolThread(queue));
        }
        for (PoolThread thread : threads) {
            thread.start();
        }
    }

    public synchronized void execute(Object task) throws InterruptedException {
        if (this.stopped)
            throw new IllegalStateException("ThreadPool is stopped");
        this.queue.enqueue(task);
    }

    public synchronized void stop() {
        this.stopped = true;
        for (PoolThread thread : threads) {
            thread.doStop();
        }
    }


}

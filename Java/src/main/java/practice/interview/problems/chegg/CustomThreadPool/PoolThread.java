package practice.interview.problems.chegg.CustomThreadPool;

/**
 * @author kartik sharma
 * @date 01/11/18
 */
public class PoolThread extends Thread {

    private BlockingQueue queue;
    private Boolean stopped = false;

    public PoolThread(BlockingQueue taskQueue) {
        this.queue = taskQueue;
    }

    public void run() {
        while (!isStopped()) {
            try {
                Runnable runnable = (Runnable) queue.dequeue();
                runnable.run();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public Boolean isStopped() {
        return stopped;
    }

    public void doStop() {
        stopped = true;
        this.interrupt();
    }
}

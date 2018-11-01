package practice.interview.problems.chegg.CustomThreadPool;

/**
 * @author kartik sharma
 * @date 01/11/18
 */
public class MainClass {

    public static void main(String[] args) throws InterruptedException {

        int numOfThreads = 5;
        int poolSize = 2;

        ThreadPool threadPool = new ThreadPool(poolSize);

        for (int i = 1; i <= numOfThreads; i++) {
            threadPool.execute(new PrinterThread(i));
        }

        Thread.sleep(10000);
        threadPool.stop();

    }

}

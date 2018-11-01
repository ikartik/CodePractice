package practice.interview.problems.chegg.CustomThreadPool;

/**
 * @author kartik sharma
 * @date 01/11/18
 */
public class PrinterThread implements Runnable {

    private int num;

    public PrinterThread(int number) {
        this.num = number;
    }

    @Override
    public void run() {

        String name = Thread.currentThread().getName() + " : " + num;

        System.out.println("START " + name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("END " + name);
    }
}

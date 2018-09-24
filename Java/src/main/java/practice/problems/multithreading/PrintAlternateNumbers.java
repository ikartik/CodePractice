package practice.problems.multithreading;

/**
 * @author kartik sharma
 * @date 20/04/18
 */
public class PrintAlternateNumbers {

    public static void main(String[] args) {

        Object object = new Object();

        MyThread t1 = new MyThread("odd", object);
        MyThread t2 = new MyThread("even", object);
        t1.start();
        t2.start();
    }


    static class MyThread extends Thread {
        private String name;
        int num = 1;
        Object lock;

        MyThread(String name, Object lock) {
            this.name = name;
            this.lock = lock;
        }

        @Override
        public void run() {
            super.run();

            while (num <= 10) {

                if ((num % 2 != 0 && name.equalsIgnoreCase("odd"))
                        || (num % 2 == 0 && name.equalsIgnoreCase("even"))) {

                    synchronized (lock){
                        System.out.println(name + " : " + num);
//                        lock.notify();
//                        try {
//                            lock.wait();
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
                    }
                }
                num += 1;
            }
        }
    }

}

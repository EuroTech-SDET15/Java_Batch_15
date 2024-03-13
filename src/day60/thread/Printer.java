package day60.thread;

public class Printer extends Thread  {

    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            // 0 1 2          9 10
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

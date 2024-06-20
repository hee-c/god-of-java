package e.thread.sync.practice;

import java.util.Date;

public class TimerThread extends Thread {
    public void run() {
        printCurrentTime();
    }

    public void printCurrentTime() {
        for (int i = 0; i < 10; i++) {
            Date d = new Date();
            System.out.println(d);
            long time = System.currentTimeMillis();
            System.out.println(time - time % 1000);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

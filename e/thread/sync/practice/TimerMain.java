package e.thread.sync.practice;

public class TimerMain {
    public static void main(String[] args) {
        TimerThread timer = new TimerThread();
        timer.start();
    }
}

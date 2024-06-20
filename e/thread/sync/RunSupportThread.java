package e.thread.sync;

public class RunSupportThread {
    public static void main(String[] args) {
        RunSupportThread t = new RunSupportThread();
        t.checkThreadState1();
    }

    public void checkThreadState1() {
        SleepThread st = new SleepThread(2000);

        try {
            System.out.println("Check thread state = " + st.getState());
            st.start();
            System.out.println("Check thread state = " + st.getState());

            Thread.sleep(1000);
            System.out.println("Check thread state = " + st.getState());

            st.join();
            st.interrupt();
            System.out.println("Check thread state = " + st.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

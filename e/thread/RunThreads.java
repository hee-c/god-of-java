package e.thread;

public class RunThreads {
    public static void main(String[] args) {
        RunThreads threads = new RunThreads();
        threads.runBasic();
    }

    public void runBasic() {
        RunnableSample runnableSample = new RunnableSample();
        new Thread(runnableSample).start();

        ThreadSample threadSample = new ThreadSample();
        threadSample.start();
        System.out.println("RunThreads.runBasic() method is ended.");
    }
}

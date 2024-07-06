package concurrency;

public class ThreadRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("From runnable");
    }
}

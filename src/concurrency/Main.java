package concurrency;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from the main thread");
        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another thread ==");
        anotherThread.start();


        new Thread(){
            public void run(){
                System.out.println("from anonymous thread class");
            }
        }.start();

        Thread myRunnableThread = new Thread(new ThreadRunnable());
        myRunnableThread.start();
        System.out.println("Hello again from the main thread");
    }
}

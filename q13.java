public class q13 {

    public final Object obj1 = new Object();
    public final Object obj2 = new Object();

    public void DeadlockThreads() {

        Thread t1 = new Thread(() -> {
            synchronized (obj1) {
                System.out.println("Thread 1 is running locking Object 1");

                synchronized (obj2) {
                    System.out.println("Thread 1 is running locking Object 2");
                }
                ;
            };
        });

        Thread t2 = new Thread(() -> {
            synchronized (obj2) {
                System.out.println("Thread 2 is running locking Object 1");

                synchronized (obj1) {
                    System.out.println("Thread 2 is running locking Object 2");
                }
                ;
            };
        });
        t1.start();
        t2.start();
    }

    public static void main(String[] Args){
        q13 q = new q13();
        q.DeadlockThreads();
    }

}

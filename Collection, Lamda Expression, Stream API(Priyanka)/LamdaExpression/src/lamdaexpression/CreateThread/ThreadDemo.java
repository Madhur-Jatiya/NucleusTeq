package lamdaexpression.CreateThread;

public class ThreadDemo {

    public static void main(String[] args) {
        Runnable thread1 = () -> {
            for (int i = 0; i <=10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t = new Thread(thread1);
        t.start();
    }

}

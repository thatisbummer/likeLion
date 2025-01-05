package likeLionTestQ.ThreadQ;

import java.util.Random;

class IncrementCounter implements Runnable{
    Random random = new Random();
    @Override
    public void run() {
        System.out.println("start");
        for (int i = 1; i < 101; i++) {
            System.out.println(i + " up");

            try {
                Thread.sleep(random.nextInt(0,11));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class DecrementCounter implements Runnable{
    Random random = new Random();
    @Override
    public void run() {
        System.out.println("start");
        for (int i = 100  ; i > 0; i--) {
            System.out.println("decrement " + i);
            try {
                Thread.sleep(random.nextInt(0,10));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class CounterApp {
    public static void main(String[] args) {
        Thread thread = new Thread(new IncrementCounter());
        Thread thread1 = new Thread(new DecrementCounter());

        thread.start();
        thread1.start();
    }
}

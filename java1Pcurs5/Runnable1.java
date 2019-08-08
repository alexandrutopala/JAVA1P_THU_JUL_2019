import java.util.concurrent.*;

public class Runnable1 implements Runnable {
    Semaphore s = new Semaphore(1, true);
    int x;
    
    @Override
    public void run() {
        try {
            for (int i = 0; i < 25; i++) {
                s.acquire();
                System.out.println(x++);
                s.release();
                
                Exemplu1.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
import java.util.concurrent.atomic.*;

public class Runnable2 implements Runnable {
    AtomicInteger x = new AtomicInteger(0);
    
    @Override
    public void run() {
        for (int i = 0; i < 25; i++) {
            System.out.println(x.getAndIncrement());
        }
    }
}
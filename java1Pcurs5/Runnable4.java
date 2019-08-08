import java.util.concurrent.*;

public class Runnable4 implements Runnable {
    private CyclicBarrier barrier = new CyclicBarrier(2);
    
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        
        System.out.println(name + " a ajuns la bariera");
        
        try {
            barrier.await();
        } catch (InterruptedException |
                 BrokenBarrierException e) {
            e.printStackTrace();
        }
        
        System.out.println(name + " a trecut de bariera");
    }
}
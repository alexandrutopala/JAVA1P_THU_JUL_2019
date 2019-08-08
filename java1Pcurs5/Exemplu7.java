import java.util.concurrent.*;

public class Exemplu7 {
    public static void main(String [] args) {
        ExecutorService service = 
            Executors.newFixedThreadPool(3);
            
        Runnable task = new Runnable4();
        
        service.execute(task);
        service.execute(task);
        service.execute(task);
        
        service.shutdown();
    }
}
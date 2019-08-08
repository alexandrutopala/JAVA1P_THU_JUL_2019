import java.util.concurrent.*;

public class Exemplu4 {
    public static void main(String [] args) {
        Runnable task = new OddNumbersRunnable();
        
        ExecutorService service = 
            Executors.newCachedThreadPool();
            
        service.execute(task);
        service.execute(task);
        service.execute(task);
        service.execute(task);
        
        service.shutdown();
        //service.shutdownNow();
        
        System.out.println("End main");
    }
   
    
    
}
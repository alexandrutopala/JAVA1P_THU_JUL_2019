import java.util.concurrent.*;

public class Exemplu2 {
    public static void main(String [] args) {
        Runnable task = new OddNumbersRunnable();
        
        ExecutorService service = 
            Executors.newFixedThreadPool(2);
            
        service.execute(task);
        service.execute(task);
        
        service.shutdown();
        //service.shutdownNow();
        
        System.out.println("End main");
    }
   
    
    
}
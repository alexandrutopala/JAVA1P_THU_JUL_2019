import java.util.concurrent.*;

public class Exemplu1 {
    public static void main(String [] args) {
        Runnable task = new OddNumbersRunnable();
        
        ExecutorService service = 
            Executors.newSingleThreadExecutor();
            
        service.execute(task);
        service.execute(task);
        
        service.shutdown();
        //service.shutdownNow();
        
        System.out.println("End main");
    }
    
    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    
    
}
import java.util.concurrent.*;

public class Exemplu3 {
    public static void main(String [] args) throws Exception {
        
        ExecutorService service = 
            Executors.newSingleThreadExecutor();
            
        Callable<String> task = new DownloadTask();
        
        Future<String> future = service.submit(task);
        
        System.out.println("Am inceput descarea..");
        
        String result = future.get();
        
        System.out.println(result);
    }
}
import java.util.concurrent.*;

public class Exemplu5 {
    public static void main(String [] args) {
        
        Runnable task = Exemplu5::m;
                        // () -> Exemplu5.m()
        
        ScheduledExecutorService service = 
            Executors.newScheduledThreadPool(2);
        
        System.out.println(java.time.LocalTime.now());    
        //service.schedule(task, 2, TimeUnit.SECONDS);    
        
        service.scheduleAtFixedRate(
            task, 
            0,
            2,
            TimeUnit.SECONDS);
        
        service.scheduleWithFixedDelay(
            task, 
            0,
            2,
            TimeUnit.SECONDS);
        
    }
    
    private static void m() {
        System.out.println("Start " + java.time.LocalTime.now());
        Exemplu1.sleep(1000);
        System.out.println("End " + java.time.LocalTime.now());
    }
}

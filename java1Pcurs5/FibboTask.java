import java.util.concurrent.*;

public class FibboTask extends RecursiveTask<Integer> {
    
    private Integer n;
    
    public FibboTask(Integer n) {
        this.n = n;
    }
    
    @Override
    protected Integer compute() {
        if (n <= 1) {
            return 1;
        }
        
        FibboTask task1 = new FibboTask(n-1);
        FibboTask task2 = new FibboTask(n-2);
        
        task2.fork();
        
        Integer result1 = task1.compute();
        Integer result2 = task2.join();
        
        return result1 + result2;
    }
    
    
    
}
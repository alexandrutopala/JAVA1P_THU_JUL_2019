import java.util.concurrent.*;

public class Exemplu6 {
    public static void main(String [] args) {
        
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask<Integer> task = new FibboTask(9);
        
        Integer result = pool.invoke(task);
        
        System.out.println(result);
        
        ForkJoinTask<?> task2 = new PrintTask(
            java.util.Arrays.asList(2, 3, 5, 2, 4, 6, 7, 6)
        );
        
        pool.invoke(task2);
        
        
        
        
    }
}
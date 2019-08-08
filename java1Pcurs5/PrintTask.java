import java.util.concurrent.*;
import java.util.*;

public class PrintTask extends RecursiveAction {

    private List<Integer> list;
    
    public PrintTask(List<Integer> list) {
        this.list = list;
    }
    
    @Override
    protected void compute() {
        if (list.size() <= 2) {
            list.forEach(System.out::println);
            return;
        }
        
        int middle = list.size() / 2;
        
        PrintTask task1 = 
            new PrintTask(list.subList(0, middle));
            
        PrintTask task2 = 
            new PrintTask(list.subList(middle, list.size()));
            
        invokeAll(task1, task2);    
    }
}



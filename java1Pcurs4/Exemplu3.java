import java.util.*;
import java.util.stream.*;

public class Exemplu3 {
    public static void main(String [] args) {
        List<String> list = 
            Arrays.asList("aa", "bbb", "c");
        
        String result =    
            list.stream()
                .collect(Collectors.joining(", "));
                
        System.out.println(result);
    }
}
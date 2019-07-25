import java.util.*;
import java.util.stream.*;

public class Exemplu4 {
    public static void main(String [] args) {
        List<String> list = 
            Arrays.asList("aa", "bbb", "c");
        
        List<Integer> result =
            list.stream()
                .map(String::length)
                .collect(Collectors.toList());
                
        System.out.println(result);        
    }
}
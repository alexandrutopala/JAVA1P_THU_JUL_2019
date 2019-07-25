import java.util.*;

/*
 *  Stream<Object> -----> mapToInt(ToIntFunction) -----> IntStream
 *  
 *  Stream<Object> -----> mapToLong(ToLongFunction) -----> LongStream
 *  IntStream -----> mapToObj(IntFunction) ----> Stream<Object>
 */

public class Exemplu1 {
    public static void main(String [] args) {
        List<String> list = 
            Arrays.asList("aa", "b", "ccc");
        
        int result =    
            list.stream()
                .mapToInt(s -> s.length())
                .sum();
        
        System.out.println(result);        
    }
}
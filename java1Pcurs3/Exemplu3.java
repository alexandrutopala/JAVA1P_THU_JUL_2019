import java.util.*;

public class Exemplu3 {
    public static void main(String [] args) {
        List<Integer> list = 
            Arrays.asList(2, 6, 1, 3, 5, 2, 9, 10, 2, 12);
            
        list.stream()
            .filter(x -> x % 2 == 0)
            .distinct()
            .sorted()
            .limit(3)
            .forEach(System.out::println);
            
            
            
            
    }
}
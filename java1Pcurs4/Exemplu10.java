import java.util.*;

public class Exemplu10 {
    public static void main(String [] args) {
        List<Integer> list =
            Arrays.asList(2, 6, 3, 4, 1, 2);
            
        list.parallelStream()
            .filter(x -> x % 2 == 0)
            .forEachOrdered(System.out::println);
    }
}
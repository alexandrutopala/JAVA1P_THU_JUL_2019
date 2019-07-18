import java.util.stream.*;

public class Exemplu2 {
    public static void main(String [] args) {
        Stream<Integer> s1 = Stream.empty();
        
        Stream<Integer> s2 = Stream.of(1, 4, 2);
        
        Stream<Integer> s3 = Stream.iterate(1, i -> i + 2);
        
        Stream<Integer> s4 = Stream.generate(() -> 2);
        
        s3.limit(10)
          //.filter(i -> i % 3 == 0)
          .forEach(System.out::println); // i -> System.out.println(i)
          
        s2.sorted()
          .forEach(System.out::println);
    }
}



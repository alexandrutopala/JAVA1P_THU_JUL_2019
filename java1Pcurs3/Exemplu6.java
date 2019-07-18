import java.util.*;

public class Exemplu6 {
    public static void main(String [] args) {
        List<String> list = 
            Arrays.asList("aaa", "bb", "c", "dddd");
         
        int suma = 
            list.stream()
                .filter(s -> s.length() % 2 == 0)
                .map(s -> s.length())
                .reduce(0, (a, b) -> a + b);
        
        System.out.println(suma);        
    }
}
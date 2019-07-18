import java.util.*;

public class Exemplu5 {
    public static void main(String [] args) {
        List<String> list = 
            Arrays.asList("aaa", "bb", "c", "dddd");
         
       
        list.stream()
            .filter(s -> s.length() % 2 == 0)
            .map(s -> s.length())
            .forEach(System.out::println);
                        
    }
}
import java.util.*;

public class Exemplu7 {
    public static void main(String [] args) {
        List<String> list = 
            Arrays.asList("abc", "xyz", "qw");
        
        boolean b =    
            list.stream()
                .map(String::length) // (String s) -> s.length()
                .allMatch(i -> i == 3);
            
        System.out.println(b);        
    }
}

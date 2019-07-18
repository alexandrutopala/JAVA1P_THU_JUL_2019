import java.util.*;

public class Exemplu4 {
    public static void main(String [] args) {
        List<String> list = 
            Arrays.asList("aaa", "bb", "c", "dddd");
         
        long nr =     
            list.stream()
                .filter(s -> s.length() % 2 == 0)
                .count();
                
        System.out.println(nr);        
    }
}
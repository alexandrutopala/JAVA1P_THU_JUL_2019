import java.util.*;

public class Exemplu8 {
    public static void main(String [] args) {
        List<String> list =
            Arrays.asList("aa", "b", "cccc", "ddd", "ee");
        
        long nr =     
            list.stream()
                .map(s -> s.split(""))
                .map(as -> Arrays.asList(as))
                .flatMap(ls -> ls.stream())
                .filter(c -> "aeiou".contains(c))
                .count();
            
        System.out.println(nr);    
            
    }
}
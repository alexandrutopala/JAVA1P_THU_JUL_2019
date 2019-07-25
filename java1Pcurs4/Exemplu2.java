import java.util.*;


public class Exemplu2 {
    public static void main(String [] args) {
        List<String> list = 
            Arrays.asList("aa");
        
        OptionalDouble result =    
            list.stream()
                .mapToInt(s -> s.length())
                .average();
        
        System.out.println(result);
        
        //double avg = result.getAsDouble();
        double avg1 = result.orElse(0.0);
        System.out.println(avg1);
        double avg2 = result.orElseGet(() -> 0.0);
        double avg3 = result.orElseThrow(() -> new RuntimeException(":)"));
        
        result.ifPresent(System.out::println);
        
        System.out.println(result.isPresent());
        
        
        Optional<String> o1 = Optional.empty();
        String s1 = "hello";
        
        Optional<String> o2 = Optional.of(s1);
        Optional<String> o3 = Optional.ofNullable(s1);
        
        
        
    }
}
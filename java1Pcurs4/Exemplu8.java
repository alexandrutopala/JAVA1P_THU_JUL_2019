import java.util.*;
import java.util.stream.*;

public class Exemplu8 {
    public static void main(String [] args) {
        List<Produs> produse = Arrays.asList(
            new Produs("telefon", 1500, "electronice"),
            new Produs("pantaloni", 100, "textile"),
            new Produs("frigider", 2500, "electrocasnice"),
            new Produs("laptop", 3000, "electronice"),
            new Produs("tricou", 50, "textile"),
            new Produs("telefon", 2000, "electronice")
        );
        
        Map<String, Double> map = 
            produse.stream()
                   .collect(Collectors.groupingBy(
                        Produs::getCategorie,
                        Collectors.averagingInt(Produs::getPret)
                   ));
               
        System.out.println(map);       
               
    }
}
        
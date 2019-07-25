import java.util.*;
import java.util.stream.*;

public class Exemplu6 {
    public static void main(String [] args) {
        List<Produs> produse = Arrays.asList(
            new Produs("telefon", 1500, "electronice"),
            new Produs("pantaloni", 100, "textile"),
            new Produs("frigider", 2500, "electrocasnice"),
            new Produs("laptop", 3000, "electronice"),
            new Produs("tricou", 50, "textile"),
            new Produs("telefon", 2000, "electronice")
        );
        
        Map<String, Integer> map =
            produse.stream()
                   .collect(Collectors.toMap(
                        Produs::getNume,//p -> p.getNume(),
                        Produs::getPret, //p -> p.getPret()
                        (v1, v2) -> v1 + v2
                   ));
               
        System.out.println(map);       
    }
}

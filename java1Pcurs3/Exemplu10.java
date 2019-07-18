import java.util.*;

public class Exemplu10 {
    public static void main(String [] args) {
        
        Locale l1 = new Locale("en", "US");
        
        Locale l2 = new Locale.Builder()
                         .setLanguage("fr")
                         .setRegion("FR")
                         .build();
        
        Locale l3 = Locale.CHINA;
        
        Locale l = Locale.getDefault();
        System.out.println(l);
        
        Locale.setDefault(l3);
        
        ResourceBundle bundle = 
            ResourceBundle.getBundle("message", l2);
            
        String hello = bundle.getString("hello");
        System.out.println(hello);
        
        
    }
}
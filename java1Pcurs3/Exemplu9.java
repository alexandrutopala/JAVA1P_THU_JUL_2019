import java.time.*;

public class Exemplu9 {
    public static void main(String [] args) {
        LocalDate ld = LocalDate.now();
        print(ld);
        
        LocalDate ld2 = LocalDate.of(2018, 3, 4); // 4 Mar 2018
        LocalDate ld3 = LocalDate.of(2018, Month.MARCH, 4);
        
        print(ld3.isBefore(ld));
        
        LocalTime lt = LocalTime.now();
        print(lt);
        
        LocalTime lt2 = LocalTime.of(13, 24); // 13:24
        print(lt2);
        
        LocalDateTime ldt = LocalDateTime.now();
        print(ldt);
        
        LocalDateTime ldt2 = 
            LocalDateTime.of(2017, Month.APRIL, 1, 11, 15);
         
        LocalDateTime ldt3 = LocalDateTime.of(ld, lt);
        print(ldt3);
        
        ZoneId.getAvailableZoneIds()
            .forEach(System.out::println);
            
        ZoneId id = ZoneId.of("Europe/London");
        
        ZonedDateTime zdt = ZonedDateTime.now();
        ZonedDateTime zdt2 = ZonedDateTime.now(id);
        
        print(zdt);
        print(zdt2);
        
        Instant ins = Instant.now();
        print(ins);
        
        /// intervale de timp
        Period p1 = Period.of(2, 1, 0); // 2 ani si o luna
        print(p1);
        
        System.out.println(ld.minus(p1));
        
        Period p2 = Period.between(ld, ld2);
        print(p2);
        
        Duration d1 = Duration.ofDays(1)
                            .plusMinutes(13);
        print(d1);                    
                            
    }
    
    private static void print(Object o) {
        System.out.println(o);
    }
}
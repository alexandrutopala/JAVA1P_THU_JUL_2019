import java.io.*;
import java.nio.file.*;

public class CommandLine {
    public static void main(String [] args) {
        
        try (InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(isr)) {
            
             String line;
             String [] input;
             Path current = Paths.get(".").toAbsolutePath();
             Path p;
             
             while (true) {
                 int count = current.getNameCount(); 
                 int low = count - 3 >= 0 ? count - 3 : 0;
                 System.out.print(current.subpath(low, count) + " > ");
                 
                 line = br.readLine();
                 input = line.split(" ");
                 
                 switch (input[0].toUpperCase()) {
                     case "CD" : 
                        p = Paths.get(input[1]);
                        current = current.resolve(p).normalize();
                        break;
                     case "PWD" : break;
                     case "TOUCH" : break;
                     case "MKDIR" : break;
                     case "LS" : break;
                     case "RM" : break;
                     case "EXIT" : 
                        System.exit(0);
                        break;
                     default : System.err.println("Comanda invalida");
                 }
             }
             
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static String concatStrings(String[] input) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i < input.length; i++) {
            sb.append(input[i]);
            sb.append(" ");
        }
        return sb.toString();
    }
    
    
    
    
    
}
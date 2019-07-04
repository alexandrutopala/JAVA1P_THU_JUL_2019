import java.io.*;

public class Exemplu5 {
    public static void main(String [] args) {
        try (FileOutputStream fos = new FileOutputStream("pisica.seri");
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {
        
             Pisica p = new Pisica("tom", 4, 2);
             oos.writeObject(p);
                
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
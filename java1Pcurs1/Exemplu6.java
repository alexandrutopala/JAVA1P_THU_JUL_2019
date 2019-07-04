import java.io.*;

public class Exemplu6 {
    public static void main(String [] args) {
        try (FileInputStream fis = new FileInputStream("pisica.seri");
             BufferedInputStream bis = new BufferedInputStream(fis);
             ObjectInputStream ois = new ObjectInputStream(bis)) {
        
             Pisica p = (Pisica) ois.readObject();    
             System.out.println(p);
                 
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
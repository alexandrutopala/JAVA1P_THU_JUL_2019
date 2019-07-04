import java.io.*;

public class Exemplu4 {
    public static void main(String [] args) {
        try (FileReader fr = new FileReader("Exemplu4.java");
             BufferedReader br = new BufferedReader(fr);
             PrintWriter pw = new PrintWriter("Exemplu4Copy.java")) {
                 
             String line;
             
             while ((line = br.readLine()) != null) {
                 pw.println(line);
             }
                 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
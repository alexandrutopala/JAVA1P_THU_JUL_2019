import java.io.*;

public class Exemplu3 {
    public static void main(String [] args) {
        try (InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(isr);
             PrintWriter pw = new PrintWriter("file1.txt")) {
        
             String line = br.readLine();
             pw.println(line);
        } catch (IOException e) {
        }
    }
}
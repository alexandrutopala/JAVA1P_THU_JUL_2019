import java.io.*;

public class Exemplu2 {
    public static void main(String [] args) {
        try (FileWriter fw = new FileWriter("file1.txt");
             BufferedWriter bw = new BufferedWriter(fw)) {
             
            bw.write("Hello world\n");     
                 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
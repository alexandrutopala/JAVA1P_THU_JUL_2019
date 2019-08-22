public class Exemplu3 {
    public static void main(String [] args) {
        Path p1 = Paths.get(Paths.OS.WINDOWS);
        
        System.out.println(p1.getRoot());
    }
}
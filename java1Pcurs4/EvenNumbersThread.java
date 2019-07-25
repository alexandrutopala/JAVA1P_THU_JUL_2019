public class EvenNumbersThread extends Thread {
    
    
    
    @Override
    public void run() {
        java.util.stream.Stream.iterate(0, i -> i + 2)
            .limit(10)
            .peek(x -> Exemplu11.dormi())
            .forEach(System.out::println);
    }
}
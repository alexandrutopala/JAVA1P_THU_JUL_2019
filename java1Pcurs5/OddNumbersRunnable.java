public class OddNumbersRunnable implements Runnable {
    @Override
    public void run() {
        java.util.stream.Stream.iterate(1, i -> i + 2)
        
            .limit(10)
            .peek(i -> Exemplu1.sleep(i * 100))
            .forEach(System.out::println);
    }
}
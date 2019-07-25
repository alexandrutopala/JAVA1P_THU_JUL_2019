public class Exemplu11 {
    public static void main(String [] args) throws Exception {
        EvenNumbersThread t1 = new EvenNumbersThread();
        Runnable task = Exemplu11::oddNumbers;
        
                        // () -> Exemplu11.oddNumbers();
        Thread t2 = new Thread(task);
                       
        t1.start();
        t2.start();
        
        //t1.sleep(2000);
        t1.join(); // firul care executa metoda join
                   // va astepta pana la terminarea lui t1
        t2.join();
        
        System.out.println("End main");
    }
    
    private static void oddNumbers() {
        java.util.stream.Stream.iterate(1, i -> i + 2)
            .limit(10)
            .peek(x -> dormi())
            .forEach(System.out::println);
    }
    
    public static void dormi() {
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



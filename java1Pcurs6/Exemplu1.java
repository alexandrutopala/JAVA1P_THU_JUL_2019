public class Exemplu1 {
    public static void main(String [] args) {
        Masina m1 = new Masina.Builder()
            .setMarca("BMW")
            .setCombustibil("diesel")
            
            .setCaiPutere(200)
            .build();
    }
}
public class Pisica {
    
    private static Pisica singleton = new Pisica();
    
    String nume;
    
    private Pisica() {
    }
    
    public static Pisica getInstance() {
        /*if (singleton == null) {
            singleton = new Pisica();
        }*/
        return singleton;
    }
}
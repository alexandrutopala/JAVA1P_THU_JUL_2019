public class Caine {
    String nume;

    private final static class SingletonHolder {
        public static final Caine SINGLETON = new Caine();
    }
    
    private Caine() {
    }
    
    public static Caine getInstance() {
        return SingletonHolder.SINGLETON;
    }
}
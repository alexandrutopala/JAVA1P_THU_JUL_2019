public class Pisica extends Animal implements java.io.Serializable {
    private final static long serialVersionUID = 2L;
    public transient String nume = "mitzi";
    public int varsta;
    public int greutate;
    public String culoare;
    transient public Stapan stapan = new Stapan();
    
    public Pisica(String nume, int varsta, int greutate) {
        this.nume = nume;
        this.varsta = varsta;
        this.greutate = greutate;
        System.out.println("c-tor Pisica");
    }
    
    @Override
    public String toString() {
        return nume + " " + varsta + " " + greutate + " " + culoare ;
    }
    
    
}
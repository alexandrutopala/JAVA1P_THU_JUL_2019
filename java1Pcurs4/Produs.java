public class Produs {
    private String nume;
    private int pret;
    private String categorie;
    
    public Produs(String nume, int pret, String categorie) {
        this.nume = nume;
        this.pret = pret;
        this.categorie = categorie;
    }
    
    public String getNume() {
        return nume;
    }
    
    public void setNume(String nume) {
        this.nume = nume;
    }
    
    public int getPret() {
        return pret;
    }
    
    public void setPret(int pret) {
        this.pret = pret;
    }
    
    public String getCategorie() {
        return categorie;
    }
    
    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
    
    @Override
    public String toString() {
        return nume + " " + pret;
    }
    
    
}
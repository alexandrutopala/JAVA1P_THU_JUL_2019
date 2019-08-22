public class Masina {
    int caiPutere;
    String combustibil;
    String marca;
    
    
    
    public static class Builder {
        private Masina masina = new Masina();
        
        public Builder setCaiPutere(int caiPutere) {
            masina.caiPutere = caiPutere;
            return this;
        }
        
        public Builder setCombustibil(String combustibil) {
            masina.combustibil = combustibil;
            return this;
        }
        
        public Builder setMarca(String marca) {
            masina.marca = marca;
            return this;
        }
        
        public Masina build() {
            return masina;
        }
        
        
    }
}
public class Exemplu1 {
    public static void main(String [] args) {
        
        
        
        Operatie o1 = new Operatie(){
        
            @Override
            public int calculeaza(int x, int y) {
                return x + y;
            }
        };
        
        Operatie o2 = (x, y) -> x + y;
        Operatie o3 = (int x, int y) -> x + y;
        Operatie o4 = (x, y) -> {
            int c = x + y;
            return c;
        };
        
    }
    
    
}
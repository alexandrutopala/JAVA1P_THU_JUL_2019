public class User implements Listener {
    String nume;
    
    User(String nume) {
        this.nume = nume;
    }
    
    public void receiveMessage(String message) {
        System.out.println(nume + ": " + message);
    }
} 
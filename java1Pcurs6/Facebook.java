public class Facebook {
    public static void main(String [] args) {
        User gigel = new User("Gigel");
        User maria = new User("Maria");
        User costel = new User("Costel");
        
        Chat chat = new Chat();
        
        chat.addListener(gigel);
        chat.addListener(maria);
        chat.addListener(costel);
        
        chat.notifyListeners("Buna");
    }
}
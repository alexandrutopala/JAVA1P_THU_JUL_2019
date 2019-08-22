import java.util.*;

public class Chat {
    private List<Listener> listeners = new ArrayList<>();
    
    
    public void addListener(Listener l) {
        listeners.add(l);
    }
    
    public void notifyListeners(String message) {
        listeners.forEach(listener -> listener.receiveMessage(message));
    }
}
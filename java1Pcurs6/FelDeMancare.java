import java.util.*;

public class FelDeMancare {
    public static enum Tip {
        DULCE, IUTE
    }
    
    private static Map<FelDeMancare.Tip, FelDeMancare> registry = new HashMap<>();
    
    String nume;
    
    public static FelDeMancare getInstance(Tip tip) {
        if (!registry.containsKey(tip)) {
            registry.put(tip, new FelDeMancare());
        }
        return registry.get(tip);
    }
}
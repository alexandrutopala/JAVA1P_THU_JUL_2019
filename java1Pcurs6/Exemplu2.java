public class Exemplu2 {
    public static void main(String [] args) {
        FelDeMancare dulce = FelDeMancare.getInstance(
                FelDeMancare.Tip.DULCE
        );
        
        dulce.nume = "prajitura";
        
        FelDeMancare iute = FelDeMancare.getInstance(
                FelDeMancare.Tip.IUTE
        );
        
        iute.nume = "pizza";
        
        System.out.println(dulce.nume);
        System.out.println(iute.nume);
    }
}
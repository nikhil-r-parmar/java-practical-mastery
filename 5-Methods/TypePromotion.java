
// Understand how Java picks a method when an exact parameter type match does not exist.

public class TypePromotion {
    public static void analyze(long a) { 
        System.out.println("Matched Long: " + a);

    }

    public static void analyze() {
        

    }

    public static void analyze() {

    }

}
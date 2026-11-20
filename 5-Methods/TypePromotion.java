
// Understand how Java picks a method when an exact parameter type match does not exist.

public class TypePromotion {
    public static void analyze(long a) { 
        System.out.println("Matched Long: " + a);

    }

    public static void analyze(double a) {
        System.out.println("Matched Double: " + a);

    }

    public static void analyze(int a, int b) {
        System.out.println("Matched two ints: " + a + ", " + b);

    }

    public static void main(String[] args) {
        analyze(10);
        analyze(3.5f);
        analyze('N');   // print's it's ascii value
        analyze(1032l);
        analyze(18, 45);

    }

}
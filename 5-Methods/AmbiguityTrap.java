
//  Experience a classic compile-time ambiguity error in method overloading and learn how to resolve it at the call site without changing the method definitions.

public class AmbiguityTrap {
    public static void calculate(int a, double b) {
        System.out.println("First int, Second double: " + (a+b));

    }

    public static void calculate(double a, int b) {
        System.out.println("First double, Second int: " + (a+b));

    }

}
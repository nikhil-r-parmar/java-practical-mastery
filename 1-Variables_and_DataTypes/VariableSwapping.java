
public class VariableSwapping {
    public static void main (String Nicky[]) {

        int a = 10;
        int b = 20;

        System.out.println("Before swap: A - " + a + " B - " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap: A - " + a + " B - " + b);

    }
}
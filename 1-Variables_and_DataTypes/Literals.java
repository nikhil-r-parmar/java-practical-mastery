// Create Number Representation program using Java Literals.
// 6/11/2026
// Author: Nikhil

public class Literals {
    public static void main(String args[]) {

        // value - 26
        int decimal = 26;
        int binary = 0b11010;
        int octal = 032;
        int hexadecimal = 0X1A;

        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hexadecimal);

        boolean allequal = false;
        if (decimal == binary && binary == octal && octal == hexadecimal) {
            allequal = true;
        };

        System.out.println("All Literals Equal?: " + allequal);

        long lnum = 9876543210l;
        float fnum = 5.5f;

        System.out.println("Long Number: " + lnum);
        System.out.println("Float Number: " + fnum);

    }
}
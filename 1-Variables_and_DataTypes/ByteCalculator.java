// Byte calculator using type casting
// author: Nikhil
// 6/11/2026

public class ByteCalculator {
    public static void main (String args[]) {

        byte no1 = 100;
        byte no2 = 20;
        int add = no1 + no2;
        System.out.println(add);

        int sub = no1 - no2;
        System.out.println(sub);

        int mult = no1 * no2;
        System.out.println(mult);

        // this will not work because addition in integer (4 bytes) and byte size is less than it ( 1 byte only).
        // byte sum = add;

        // this works using type promotion means addition ke liye sum ki size ko promoye karna
        byte sum = (byte) add;
        System.out.println(sum);

    }
}

// Create an integer array named original containing:
// Create another integer array named copy with the same size.

public class CopyArray {
    public static void main(String[] args) {
        int[] origional = {12, 24, 36, 48, 60};
        int[] copy = new int[origional.length];

        for (int i=0; i<origional.length; i++) {
            copy[i] = origional[i];

        }

        System.out.println("Copied array: ");
        for (int i=0; i<origional.length; i++) {
            System.out.println(copy[i]);

        }
        
        origional[0] = 99;

        System.out.println("Copy After Original Update: ");
        for (int i=0; i<origional.length; i++) {
            System.out.println(copy[i]);

        }

    }
}
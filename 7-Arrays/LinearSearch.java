
// A shopkeeper has stored eight product codes in an integer array. He wants to check whether a particular product code exists.

public class LinearSearch {
    public static void main(String[] args) {
        int[] codes = {101, 205, 310, 415, 520, 625, 730, 835};

        int search = 520;
        boolean found = false;

        for (int i=0; i<codes.length; i++) {
            if (codes[i] == search) {
                System.out.println("Product Code Found");
                System.out.println("Index: " + i);
                found = true;

            } 
            
        }

        if (!found) {
            System.out.println("Product Code not Found");

        }

    }
}
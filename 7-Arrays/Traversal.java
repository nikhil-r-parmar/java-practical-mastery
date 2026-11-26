
// You have an array of six integer values. Print all elements in forward order and then in reverse order using loops.

public class Traversal {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60};

        // forward traverse
        System.out.println("Forward Traversal: "); 
        for (int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
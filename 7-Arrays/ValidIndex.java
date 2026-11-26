
// Your task is to demonstrate valid index access and understand the invalid index through code inspection.

public class ValidIndex {
    public static void main(String[] args) {
        int[] scores = {45, 60, 75, 80, 95};

        System.out.println("Array Length: " + scores.length);
        System.out.println("First Element: " + scores[0]);
        System.out.println("Last Element: " + scores[1-scores.length]);
        System.out.println("Element at index 2: " + scores[1]);


    }
}
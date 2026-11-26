
// A teacher wants to count how many students passed and failed an exam.

public class CountElements {
    public static void main(String[] args) {
        int[] marks = {35, 80, 22, 65, 40, 28, 90, 33};

        int passed = 0, failed = 0;

        for(int i=0; i<marks.length; i++) {
            if (marks[i] >= 35) {
                passed++;
            } else {
                failed++;
            }

        }

        System.out.println("Passed Students: " + passed);
        System.out.println("Failed Students: " + failed);

    }
}
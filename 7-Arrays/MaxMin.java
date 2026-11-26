
// A teacher has recorded marks of eight students and wants to find the highest and lowest marks.

public class MaxMin {
    public static void main(String[] args) {
        int[] marks = {45, 82, 67, 29, 95, 54, 38, 71};

        int max = 0;
        int maxIndex = 0;
        for (int i=0; i<marks.length; i++) {
            if (max < marks[i]) {
                max = marks[i];
                maxIndex = i;
            }
        }

        System.out.println("Highest Marks: " +  max);
        System.out.println("Highest Marks Index: " +  maxIndex);

    }
}
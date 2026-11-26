

// A teacher wants to calculate the total and average marks of six students using an integer array.

public class SumAvg {
    public static void main(String[] args) {
        int[] marks = {70, 85, 90, 65, 80, 75};

        int sum = 0;
        for(int i=0; i<marks.length; i++) {
            sum += marks[i];
        }
        System.out.println("Total Marks: " + sum);

        double avg = sum / (double)marks.length;
        System.out.println("Average Marks: " + avg);



    }
}
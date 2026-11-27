
// create an 2d array and Calculate and print the sum of each column separately.

public class ColumnSum {
    public static void main(String[] args){
        int[][] marks = {
            {70, 80, 90, 85},
            {60, 75, 88, 92},
            {95, 89, 78, 84}
        };

        for (int i=0; i<marks[0].length; i++) {
            int sum = 0;
            for (int j=0; j<marks.length; j++) {
                sum += marks[j][i];
            }
            System.out.println("Subject " + (i+1) + " Total: " + sum);
        }

    }
}
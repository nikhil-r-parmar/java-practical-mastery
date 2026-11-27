

// A teacher wants to calculate the total marks obtained by each student across four subjects.

public class RowsSum {
    public static void main(String[] args){
        int[][] marks = {
            {70, 80, 90, 85},
            {60, 75, 88, 92},
            {95, 89, 78, 84}
        };

        

        for(int i=0; i<marks.length; i++) {
            int sum = 0;

            for(int j=0; j<(marks[i].length); j++) {
                sum += marks[i][j];
            }
            System.out.println("Student " + (i+1) + " Marks: " + sum);
        }

    }
}
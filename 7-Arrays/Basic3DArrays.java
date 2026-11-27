

// A college stores marks for 2 students across 2 subjects in 2 different semesters.

// Create a 3D integer array and print all its elements using nested loops.

public class Basic3DArrays {
    public static void main(String[] args) {
        int[][][] college = {
            {
                {70, 80},
                {85, 90}
            },
            {
                {75, 88},
                {92, 95}
            }
        };


        for(int i=0; i<college.length; i++){

            System.out.println("Semester " + (i+1) + ": ");
            for(int j=0; j<college[i].length; j++) {

                System.out.print("Student " + (j+1) + ": "); 
                for(int k=0; k<college[i][j].length; k++) {
                    System.out.print(college[i][j][k] + " ");

                }
                System.out.println();

            }
            System.out.println();

        }

    }
}
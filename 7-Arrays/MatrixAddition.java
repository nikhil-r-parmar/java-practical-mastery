
// A teacher has marks from two tests. Write a Java program to add the corresponding elements of two matrices and store the results in a third matrix.

public class MatrixAddition {
    public static void main(String[] args) {

        int[][] matrixA = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        int[][] matrixB = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] sumMatrix = new int[3][3];

        for(int i=0; i<matrixA.length; i++) {
            for(int j=0; j<matrixB.length; j++) {
                System.out.println(matrixA[i][j]);
                System.out.println(matrixB[i][j]);

            }
        }

    }
}

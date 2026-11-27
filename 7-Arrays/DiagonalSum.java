
// A teacher wants to calculate the sums of both diagonals of a square matrix.

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        int primaryDiagonalSum = 0;
        for(int i=0; i<matrix.length; i++) {
            primaryDiagonalSum += matrix[i][i];
        }

        System.out.println("Primary Diagonal Sum: " + primaryDiagonalSum);

    }
}
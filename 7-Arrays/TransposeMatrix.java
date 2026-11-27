
// A teacher wants to transpose a 3×3 matrix. Create a new matrix containing the rows and columns exchanged.

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        int[][] transposeMatrix = new int[3][3];

        System.out.println("\nOrigional Matrix: ");
        for (int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix.length; j++) {
                transposeMatrix[j][i] = matrix[i][j];
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nTransposed Matrix: ");
        for (int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix.length; j++) {
                System.out.print(transposeMatrix[i][j] + " ");
                
            }
            System.out.println();
        }
    }
}
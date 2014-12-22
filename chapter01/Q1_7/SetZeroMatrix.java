/**
 * Question 1.7: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to
 * 0.
 */

public class SetZeroMatrix {

    public static void setZeros(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = column[j] = true;
                }
            }
        }

        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < column.length; j++) {
                if (row[i] || column[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 0, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 0, 14, 15},
                {16, 17, 18, 19, 0}};
        setZeros(matrix);
        printMatrix(matrix);
    }
}

package array.question;

//https://www.geeksforgeeks.org/inplace-rotate-square-matrix-by-90-degrees/
public class MatrixRotation {
    public static void rotateMatrix(int[][] matrix)
    {
        int n = matrix.length;

        // transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                swap(matrix, i, j);
            }
        }

        // reverse each column
        for (int i = 0; i < n/2 ; i++) {
            for (int j = 0; j < n ; j++) {
                //swap(matrix, j, i, n - j - 1, i);
                reverseColumn(matrix,i,j);
            }
        }
    }

    private static void reverseColumn(int[][] matrix, int i, int j){
        int length = matrix.length;
        int temp = matrix[i][j];
        matrix[i][j] = matrix[length-i-1][j];
        matrix[length-i-1][j] = temp;
    }

    private static void swap(int[][] matrix, int i, int j)
    {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
    // driver program
    public static void main(String[] args)
    {
        int[][] matrix
                = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        rotateMatrix(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

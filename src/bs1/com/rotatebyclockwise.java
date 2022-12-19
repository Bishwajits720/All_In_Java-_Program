package bs1.com;

import java.util.Arrays;

public class rotatebyclockwise {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 2},
                       { 5, 6, 7, 3 },
                      { 9, 10, 11,5  },
                     { 13, 14, 15 ,76} };
        System.out.println(rotate(arr));
        System.out.println(printMatrix(arr));

    }
    static int[][] rotate(int[][] matrix) {
        int n =matrix.length;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < (matrix.length/2); j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][n-1-i];
                matrix[i][n-1-i] = temp;
            }
        }
        return matrix;
    }
    static int printMatrix(int arr[][])
    {
        int N= 4;
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
                System.out.print( arr[i][j] + " ");
            System.out.println();
        }
        return -1;
    }
}

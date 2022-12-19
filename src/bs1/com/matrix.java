package bs1.com;

public class matrix {
    public static void main(String[] args) {
        int matrix[][] = {{0, 1}, {1, 1}};
        int target[][] = {{1, 0}, {0, 1,}};
        System.out.println(rotate(matrix));

    }

    static int rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }

        }
        // reverse the matrix
        int start = 0;
        int end = matrix.length;
        while (start <= end) {
            for (int row = 0; row < matrix.length; row++) {
                int temp = matrix[row][start];
                matrix[row][start] = matrix[row][end];
                matrix[row][end] = temp;

            }
            start++;
            end--;
        }
        return 0;
    }

    static boolean check(int [][] matrix ,int[][] target){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j]!=target[i][j]){
                    return false;
                }

            }

        }
 return true;

    }
    static boolean find(int[][] mat , int [][] target){
        for (int i = 0; i < 4; i++) {
            if (check(mat,target)){
                return true;
            }
            rotate(mat);
        }
        return false;
    }
}

package bs.com;


import java.util.Arrays;

public class rowcolmatrix2 {
    public static void main(String[] args) {
        int matrix[][] = {{0, 1}, {1, 0}};
        int target[][] = {{1, 0}, {0, 1,}};
        System.out.println(findRotation(matrix,target));

    }

        static boolean findRotation(int[][] mat, int[][] target) {
            for (int i = 0; i < 4; ++i) {
                if (Arrays.deepEquals(mat, target))
                    return true;
                rotate(mat);
            }
            return false;
        }

        static void rotate(int[][] M) {
            for (int i = 0, j = M.length - 1; i < j; ++i, --j) {
                int[] temp = M[i];
                M[i] = M[j];
                M[j] = temp;
            }
            for (int i = 0; i < M.length; ++i)
                for (int j = i + 1; j < M.length; ++j) {
                    final int temp = M[i][j];
                    M[i][j] = M[j][i];
                    M[j][i] = temp;
                }
        }
    }


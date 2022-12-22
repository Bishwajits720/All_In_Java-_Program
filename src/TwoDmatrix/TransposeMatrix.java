package TwoDmatrix;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {

        int arr[][] ={{1,2,3},{4,5,6},{7,8,9}};

        printMatrix(transpose(arr));

    }
    static int[][] transpose(int arr[][]){
        int r =arr.length;
        int c = arr[0].length;

        int[][] arr11 = new int[r][c];

        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
                arr11[j][i] = arr[i][j];
            }
        }

     return arr11;

    }
    static void printMatrix (int arr[][]){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++)
                System.out.print (arr[i][j] + " ");
            System.out.println ("");
        }
    }

}

package Maths.DSA.matrix;

import java.util.Arrays;

public class multiplication2 {
    public static void main(String[] args) throws Exception {

        int arr1[][] ={{1,2,3}
                     ,{4,5,6}
                    ,{7,8,9}};

        int arr2[][] = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};

        int[][] prod = new int[3][3];

        for (int i = 0; i < prod.length ; i++) {
            for (int j = 0; j < prod[0].length ; j++) {
                for (int k = 0; k < 3; k++) {
                    prod[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        for (int i = 0; i < prod.length ; i++) {
            for (int j = 0; j < prod[0].length ; j++) {
                System.out.print(prod[i][j] + " ");
            }
            System.out.println();
        }





    }
}

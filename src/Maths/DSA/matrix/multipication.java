package Maths.DSA.matrix;

import java.util.*;

public class multipication {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
                 arr[i][j] =sc.nextInt();
            }
        }
        print(arr);


    }
    static void print(int[][] arr){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}

package Maths.DSA.matrix;

import java.util.*;

public class WaveOutput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int arr[][] = new int[r][c];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr[0].length; i++) {
          if (i%2 ==0){
              for (int j = 0; j <arr.length ; j++) {
                  System.out.println(arr[i][j]);
              }
          }else {
              for (int j = arr.length -1; j >=0 ; j--) {
                  System.out.println(arr[i][j]);
              }
              
          }
            
        }
    }
}

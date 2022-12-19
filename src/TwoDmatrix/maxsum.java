package TwoDmatrix;

import java.util.*;

public class maxsum {
    public static void main(String [] args){

        int[][] arr =new int[6][6];

        Scanner sc =new Scanner(System.in);

        for(int i= 0; i< 6;i++){
            for (int j = 0; j <6 ; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }


     int maxsum=-63;

        for (int i = 0; i <=3 ; i++) {
            for (int j = 0; j <=3 ; j++) {
                int curr =arr[i][j] +
                        arr[i][j+1]+
                        arr[i][j+2]+
                        arr[i+1][j+1]+
                        arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];

                if (curr>maxsum){
                    maxsum =curr;
                }
            }
        }
        System.out.println(maxsum);

    }
}

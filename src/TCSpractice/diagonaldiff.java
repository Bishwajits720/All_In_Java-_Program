package TCSpractice;

import java.util.Arrays;
import java.util.Scanner;

public class diagonaldiff {
    public static void main(String[] args) {
        int arr[][] = new int[3][3], i, j, suml = 0, sumr = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("enter matrix elemnet  [" + i + "][" + j + "]");
                arr[i][j] = sc.nextInt();

            }

        }
//        System.out.println("matrix is ");
//        for (i =0 ; i<3;i++ ){
//            for (j=0; j<3;j++){
//                System.out.print(Arrays.toString(new int[]{arr[i][j]}));
//            }
        //           System.out.println();
//        }

        System.out.print(Arrays.toString(arr[i]));
    }
}



package TCSpractice;

import java.util.Scanner;

public class symertix {
    public static void main(String[] args) {
        int arr[][] = new int[3][3],f=0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("enter element [" + i + "][" + j + "]");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("matrix is");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] != arr[j][i]) {
                    f = 1;
                    break;

                }
            }
        }
            if ( f ==0){
                System.out.println("mat is symmtric");
            }else {
                System.out.println("mat is not symmertic");
            }

        }

    }

package TCSpractice;

import java.util.Scanner;

public class interchnage {
    public static void main(String [] args){
        int arr[][] = new int[3][3] ,t;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter element");
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                System.out.println("enter no of pocket ["+i+"]["+j+"]");
                arr[i][j] = sc.nextInt();
            }

        }
        System.out.println("matrix is.....");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j<3 ; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
      //swaping 1st row and last row
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                t=arr[j][0];
                arr[j][0] =arr[j][2];
                arr[j][2] =t;


            }
            System.out.println("mat is   ");
            for (int j = 0; j <3 ; j++) {
                for (int k = 0; k <3 ; k++) {
                    System.out.print(arr[j][k]+ " ");

                }
                System.out.println();

            }

        }

    }
}

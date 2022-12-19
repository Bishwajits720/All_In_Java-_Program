package TCSpractice;


import java.util.Scanner;

public class triangularmatrix {
    public static void main(String[] args) {
         int arr[][] =new int[3][3];
         Scanner sc =new Scanner(System.in);
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.println("enter element ["+i+"]["+j+"]");
                arr[i][j] =sc.nextInt();
            }
        }
        System.out.println("mat is.....");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(arr[i][j] +" ");

            }
            System.out.println();
        }
        System.out.println("matrix is upper element are");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                if (j+i>=3){
                    System.out.print(arr[i][j]+ " ");

                }
               // System.out.println();
            }
        }

    }
}

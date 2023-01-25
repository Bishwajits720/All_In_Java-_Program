package patterns;

import java.util.*;


public class pattern1 {
    public static void main(String[] args){
       //pattern1(4);
       //pattern2(4);
      pattern3(4);
        
    }
    static void pattern1(int n){
       // no of line(row)
        for (int i = 0; i <= n; i++) {
            //for every row ,run the col
            for (int j = n - i +1 ; j > 0 ; j--) {
                System.out.print("* " );
            }
            System.out.println();
        }

        
    }
    static void pattern2(int n){

        for (int i = 0; i <=n; i++) {

            for (int j = 0; j < i ; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
        for (int i = 0; i <=n; i++) {
            for (int j =n-i+1; j >0 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void pattern3(int n){
        for (int i = 0; i <=n ; i++) {
            for (int k = 4; k >=i ; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {

                System.out.print("* ");
                
            }
            System.out.println();
        }
        //reversed pyramid star
        for (int i = 0; i <=n ; i++) {
            for (int k = n-i; k <4 ; k++) {
                System.out.print(" ");

            }
            for (int j = n-i+1; j >0 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    
    }

}

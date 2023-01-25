package Maths.DSA;

import java.util.Scanner;

public class rangePrime {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int l = sc.nextInt();
        int h = sc.nextInt();

        for (int i = l; i<=h ; i++){
            int c =0;

            for (int j = 2 ; j*j <=i ;j++){
                if (i % j == 0){
                    c++;
                    break;
                }
            }
            if (c ==0){
                System.out.println(i);
            }
        }

    }
}

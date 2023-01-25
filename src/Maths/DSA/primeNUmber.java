package Maths.DSA;

import java.util.Scanner;

public class primeNUmber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    ISprime(x);

    }
    static void ISprime(int x){

        int c =0;
        for (int i = 2 ; i* i <=x ;i++ ){
            if (x % i == 0){
                c++;
                break;
            }
        }
        if (c== 0){
            System.out.println("  prime");
        }else {
            System.out.println("  not prime");
        }

    }
}

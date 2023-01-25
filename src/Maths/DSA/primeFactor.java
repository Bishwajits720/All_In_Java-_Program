package Maths.DSA;

import java.util.Scanner;

public class primeFactor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 2 ; i <= x ; i ++){
            while(x % i ==0){
                x =x /i;
                System.out.println(i);
            }
        }
    }
}

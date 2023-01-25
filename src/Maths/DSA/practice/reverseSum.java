package Maths.DSA.practice;

import java.util.Scanner;

public class reverseSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sumReverse(n);


    }
    public static void sumReverse(int n ){
        int sum = 0;

        while (n >0){
            int rem = n %10 ;
            sum = sum + rem;
            n = n /10;

        }
        System.out.println(sum);

    }
}

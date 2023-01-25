package Maths.DSA.practice;

import java.util.Arrays;

public class reverse2 {
    public static void main(String[] args) throws Exception {
         int arr[] ={12,30,56,78,93};
        System.out.println(Arrays.toString(reverse3((arr))));

    }

    static int[] reverse3(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {

            int rev = reverseNumber(arr[i]);
            arr[i] = rev;


        }
        return arr;


    }
    static int reverseNumber(int n){
        int rev = 0;

        while(n >0){
            int rem = n %10;
            rev = (rev *10) +rem;
            n = n /10;
         }


    return rev;

    }
}

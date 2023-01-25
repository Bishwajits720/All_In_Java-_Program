package arrayspractice.DSA;

import java.io.*;
import java.util.*;

public class sort {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        for (int i = 0; i <arr.length -1 ; i++) {
            while (arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                i=0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

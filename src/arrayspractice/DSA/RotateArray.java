package arrayspractice.DSA;

import java.util.*;

public class RotateArray {
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
           arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        rotateArray(arr,k);
    }
    static void rotateArray(int arr[] , int  k){

        k = k% arr.length;

        reverse(arr,0, arr.length-k-1);
        reverse(arr, arr.length -k, arr.length-1);
        reverse(arr,0, arr.length -1);


        System.out.println(Arrays.toString(arr));
    }
    static int[] reverse(int arr[] , int s , int e){

        while(s <e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
         }

       return arr;
    }
}

package partice;

import java.util.Arrays;

public class rotationArray {
    public static void main(String[] args) {
       int arr[] ={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(rotate(arr,3)));

    }
    static int[] rotate(int arr[] , int k ){
        //56781234

        k = k %arr.length;

        reverse(arr, 0, arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k, arr.length-1);


    return arr;
    }

    static void reverse(int arr[], int i, int j){
            while(i <j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                 i++;
                 j--;

            }
    }

}

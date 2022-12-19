package bs.com;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int []arr = {1,2,6,5,4,3};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped ;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j-1]){
               int temp = arr[j];
               arr[j] =arr[j-1];
               arr[j-1] =temp;

                }

            }
            if (swapped == false){
                break;
            }
        }
    }
}

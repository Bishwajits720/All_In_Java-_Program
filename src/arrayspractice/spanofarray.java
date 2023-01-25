package arrayspractice;

import java.util.*;

public class spanofarray {
    public static void main(String[] args) throws Exception {

         int arr[] = {5,2,6,1,3,7,9};

         for (int i = 0 ; i <arr.length -1 ; i++){
             if (arr[i] >arr[i+1] ){
                 int temp = arr[i];
                 arr[i] = arr[i+1];
                 arr[i+1] = temp;
                 i=-1;
             }
         }

        System.out.println(Arrays.toString(arr));

         int x = arr[arr.length-1] - arr[0];
        System.out.println(x);

    }

}

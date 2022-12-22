package arrayspractice;

import java.util.*;

public class sortsingle {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,2,3,4,2,4,5,2,3,1};
        sortsin(arr);

    }
    static void sortsin(int arr[]){
         int s =0;
         int e =arr.length;
         int i =0;

         while(s<e){
             if (arr[s] >=arr[e]){
                 int temp = arr[s];
                 arr[s] =arr[e];
                 arr[e] = temp;
                 s++;
                 e--;

             }
         }
        System.out.println(Arrays.toString(arr));
    }
}

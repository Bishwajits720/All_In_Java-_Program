package partice;

import java.util.ArrayList;
import java.util.Arrays;

public class oneTwoZeroSort {
    public static void main(String[] args) {

        int arr[] ={1,1,0,0,2,0,2,1,0};
        sort(arr);

    }
    static void sort(int arr[]){

        int s= 0;
        int e= arr.length -1;
        int i = 0;

        while(i <= e && s < e){
            if(arr[i] == 0){
                arr[i] = arr[s];
                arr[s] =0;
                s++;
                i++;
            }else  if(arr[i] == 2){
                arr[i] = arr[e];
                arr[e] =2;
                e--;
            }else{
                i++;
            }

        }
        System.out.println(Arrays.toString(arr));

    }
}

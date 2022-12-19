package TCSpractice;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,};
        int target =1;
        System.out.println(search(arr,target));

    }
    static int search(int arr[],int target){

        int start =0;
        int end =arr.length -1;

        while(start <= end){
            int mid = start +(end -start)/2;
            if(arr[mid] == target){
                return mid;
            } else if(arr[mid] < target){
                start =mid +1;
            }else if(arr[mid] > target){
                end = mid -1;
            }



        }
       return -1;
    }
}

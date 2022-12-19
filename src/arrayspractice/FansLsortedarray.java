package arrayspractice;

import java.util.*;

public class FansLsortedarray {
    public static void main(String[] args) {
        int arr[] ={5,7,7,8,8,8,8,10,11};
        int target = 8;
        int ans[] = search(arr,target);
        System.out.println(Arrays.toString(ans));


    }
    static int[] search(int arr[] ,int target){

        int[] ans = new int[2];
        ans[0] =findex1(arr,target);
        ans[1] =findex2(arr,target);

       return ans;
    }

    static int findex1(int[] arr, int target){
         int index =-1;

         int s =0;
         int e =arr.length -1;
         while (s<=e){
             int mid =s +(e-s)/2;
             if(arr[mid] >= target){
                 e =mid -1;
             }else {
                  s = mid+1;
             }

             if (arr[mid] == target)   index = mid;
         }





         return index;
    }

    static int findex2(int[] arr, int target){
        int index =-1;
        int s =0;
        int e =arr.length -1;
        while (s<=e){
            int mid =s +(e-s)/2;
            if(arr[mid] <= target){
                s =mid +1;
            }else {
                e = mid -1;
            }

            if (arr[mid] == target)   index = mid;
        }



        return index;
    }

}

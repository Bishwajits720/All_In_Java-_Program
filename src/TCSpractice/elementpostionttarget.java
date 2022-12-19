package TCSpractice;

import java.awt.image.BandedSampleModel;
import java.util.Arrays;

public class elementpostionttarget {
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 8, 8, 8, 8, 9, 12};
        int target = 8;
        System.out.println(Arrays.toString(bs1(arr,target)));

    }

    static int[] bs1(int arr[], int target) {
        int [] ans ={-1,-1};
       ans[0] = search(arr,target,true);
       ans[1] = search(arr,target, false);
       return ans;

    }

    static int search(int[] arr ,int target, boolean findindex){
        int  ans =-1;

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else {
                ans=mid;
                if (findindex){
                  end = mid -1;
                }else{
                   start= mid+1;
                }

        }

    }
        return ans;
    }
}
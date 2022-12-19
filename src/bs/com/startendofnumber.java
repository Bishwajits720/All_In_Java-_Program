package bs.com;

import java.util.Arrays;

public class startendofnumber {
    public static void main(String[] args) {
        int [] arr = {2,3,3,3,3,4,4,4,5,5,5,6,6,6,};
        int target =5;
        int[] ans= startandend(arr ,target);
        System.out.println(Arrays.toString(ans));


    }

    static int[] startandend(int[]  nums, int target) {
        int[] ans = {1, -1};
         ans[0] = search(nums, target, true);
         ans[1] = search(nums, target, false);

         return ans;

    }
     static int search(int[] nums, int target, boolean findsearch) {
         int ans = -1;
         int start = 0;
         int end = nums.length - 1;

         while (start <= end) {
             int mid = start + (end - start) / 2;
             if (target < nums[mid]) {
                 end = mid - 1;
             } else if (target > nums[mid]) {
                 start = mid + 1;
             } else {
                 ans = mid;
                 if (findsearch) {
                     end = mid - 1;
                 } else {
                     start = mid + 1;

                 }
             }
         }
         return ans;
     }
}








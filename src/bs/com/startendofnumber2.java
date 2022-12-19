package bs.com;

import java.util.Arrays;

public class startendofnumber2 {
    public static void main(String[] args){
        int [] arr = {2,3,3,3,3,4,4,4,5,5,5,6,6,6,};
        int target =5;
        int[] ans= searchrange(arr ,target);
        System.out.println(Arrays.toString(ans));


    }
    static int[] searchrange(int[] nums , int target){
        int[] result = new  int[2];
        result [0] = finstartingindex(nums , target );
        result [1] = finsendingindex(nums , target );
        return  result;

    }
    static int finstartingindex(int[] nums , int target){
        int index = -1;

        int start = 0;
        int end  = nums.length -1;

        while(start <= end ){
            int mid= start + (end - start) / 2;
            if (nums[mid] >= target){
                end= mid- 1;
            } else {
                start = mid +1;

            }
            if (nums[mid]== target )
                index= mid;
        }
        return index;

    }


    static int finsendingindex(int[] nums , int target){
        int index = -1;

        int start = 0;
        int end  = nums.length -1;

        while(start <= end ){
            int mid= start + (end - start) / 2;
            if (nums[mid] <= target){
                start= mid + 1;
            } else {
                end = mid -1;

            }
            if (nums[mid]== target )
                index= mid;

        }
        return index;
    }
}
package arrayspractice;

import java.util.Arrays;

class sol{
    public int[] productExp(int[] nums){
        int  n= nums.length;

        int[] left =new int[n];
        int[]  right =new int[n];

        int[] output = new int[n];

        left[0] =1;
        right[n-1] =1;

        for (int i = 1; i <n ; i++) {
            left[i] = nums[i-1] * left[i-1];
        }

        for (int i = n-2; i >=0; i--) {
            right[i] = nums[i+1] *right[i+1];
        }

        for (int i = 0; i <n ; i++) {
            output[i] = left[i] *right[i];
        }
        return output;
    }


}


public class productofarray {


    // left  product and right product then
    // multiple them to get the ans
    public static void main(String[] args) {
        sol ss =new sol();
        int arr[] = {1,2,3,4};

        System.out.println(Arrays.toString(ss.productExp(arr)));
    }




}

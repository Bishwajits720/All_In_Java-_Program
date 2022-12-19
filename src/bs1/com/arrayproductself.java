package bs1.com;

import java.util.Arrays;

public class arrayproductself {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,};
        System.out.println(Arrays.toString(product(arr)));

    }
    static int[] product(int arr[]){
        int n = arr.length;
        int [] ans =new int[n];
        for (int i = 0; i < n; i++) {
            int temp = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                temp *= arr[j];
            }
            ans[i] = temp;
        }

      return ans;

    }
}

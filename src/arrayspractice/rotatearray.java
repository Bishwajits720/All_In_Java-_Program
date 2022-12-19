package arrayspractice;


import java.util.Arrays;

class solnn{
   public int[] rotate(int arr[] , int k) {

      k = k % arr.length;
      int n = arr.length;
      reverse(arr, 0, n - 1);
      reverse(arr, 0, k - 1);
      reverse(arr, k, n - 1);

      return arr;
   }

   private void reverse(int[] arr, int i, int j) {

      while(i<j){
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] =temp;
         i++;
         j--;
      }
   }
}

public class rotatearray {
   public static void main(String[] args) {
      solnn s =new solnn();
      int arr[]= {1,2,3,4,5,6,7};
      int k = 3;
      System.out.println(Arrays.toString(s.rotate(arr,k)));
   }



}

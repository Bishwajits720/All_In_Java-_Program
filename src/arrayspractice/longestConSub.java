package arrayspractice;

import java.util.*;

// sliding Windows  - brute force approach
public class longestConSub {
    public static void main(String[] args) {
        int arr[] ={1,2,3,2,4,2,1,2};
        int k =3;
        int ans =searchmac(arr,k);
        System.out.println(ans);
    }
    static int searchmac(int arr[] , int k){
        int max =0;
        for (int i = 0; i < arr.length-k; i++) {
            int wins=0;
            for (int j = i; j <i+k ; j++) {
                 wins += arr[j];
            }
            max =Math.max(max,wins);
        }
      return max;
    }

}


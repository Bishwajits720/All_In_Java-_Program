package TwoDmatrix;

import java.util.*;

class sol{
    public boolean searchmat(int arr[][] ,int target){

        if (arr.length == 0)  return false;

          int r= arr.length;
          int c =arr[0].length;

          int ll = 0;
          int rr = r*c-1;

          while(ll<=rr){
              int mid = ll+(rr-ll)/2;
              int me =arr[mid/c][mid%c];
              if (me ==target){
                  return true;
              }else if(me< target){
                  ll =mid+1;
              }else if(me>target){
                  rr=mid-1;
              }

          }
   return  false;
    }

}
// imagine it like 1d - array

public class sortedsearch {
    public static void main(String[] args) {
        sol s =new sol();
        int arr[][] ={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(s.searchmat(arr,11));
    }
}

package recursion;

import java.lang.module.FindException;

public class linearserach {
    public static void main(String[] args) {
     int arr[] ={1,3,5,7,9,12,13,16};


     int ans =search1(arr,13,0);
        System.out.println(ans);

    }
    static boolean search(int arr[],int target , int index) {
          if (index == arr.length){
              return false;
          }

    return arr[index]==target || search(arr, target, index +1);
    }

    static int search1(int arr[],int target , int index) {
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }else {

            return  search1(arr, target, index +1);
        }


    }

}

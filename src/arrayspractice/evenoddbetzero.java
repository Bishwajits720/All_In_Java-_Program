package arrayspractice;

import java.util.*;
public class evenoddbetzero {
    public static void main(String[] args) {
    int arr[] ={1,2,3,4,5,6,7,8,9,0};
        System.out.println(funv(arr));
     }
    static ArrayList<Integer> funv(int[] arr){

        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>0 && arr[i]%2==0) {
                a.add(arr[i]);

            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] ==0){
                a.add(arr[i]);
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>0 && arr[i]%2 !=0){
                a.add(arr[i]);
            }
        }


    return a;
    }
}

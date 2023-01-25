package Maths.DSA;

import java.util.*;

public class commonInArr {
    public static void main(String[] args)  {
     int[] arr1={1,2,4,3,5,6,4,3,2,3,4,1,1};
     int[] arr2={2,3,4,2,1,2,3,2,1,5,4,1,2};

     sol1111(arr1,arr2);



    }
    static void sol1111(int arr1[] ,int arr2[]){

        HashMap<Integer , Integer> h = new HashMap<>();

        for (int i=0; i< arr1.length ; i++){
            if (h.containsKey(arr1[i])){
               h.put(arr1[i] , h.get(arr1[i]) +1 );
            }else {
                h.put(arr1[i] , 1);
            }

        }
        for (int i = 0; i < arr2.length ; i++) {
            if (h.containsKey(arr2[i])){
                System.out.println(arr2[i]);
                h.remove(arr2[i]);
            }
        }

    }
}

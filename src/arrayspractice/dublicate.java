package arrayspractice;

import  java.util.*;

public class dublicate {
    public static void main(String[] args) {

        int arr[]={1,2,3,3,2,4,5,1};
        dub(arr);



    }
    static void dub(int arr[]){

        HashMap<Integer ,Integer> h =new HashMap<>();

        for (int i = 0; i <arr.length ; i++) {
            if (h.containsKey(arr[i])){
               h.put(arr[i], h.get(arr[i])+1 );
            }else {
                h.put(arr[i], 1);
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            if (h.get(arr[i])==1)
                System.out.println(arr[i]);
        }


    }
}

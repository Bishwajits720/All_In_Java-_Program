package arrayspractice;

import  java.util.*;

public class dublicate {
    public static void main(String[] args) {

        int arr[]={1,2,3,3,2,4,5,1,1,2,3,4,5,6};
        dub(arr);



    }
    static void dub(int arr[]){

        HashMap<Integer ,Integer> h =new HashMap<>();

        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            if (h.containsKey(arr[i])){
               h.put(arr[i], h.get(arr[i])+1 );
            }else {
                h.put(arr[i], 1);
            }
        }
     for (Map.Entry<Integer ,Integer> e : h.entrySet()){
         if (e.getValue() >=1){
             a.add(e.getKey());
         }
     }
        System.out.println(a);
    }
}

package Maths.DSA;

import java.util.*;

public class dublicateArray {
    public static void main(String[] args) {
      int arr[] = {1,2,3,2,1,3,4,2,5,6};
        System.out.println(findarray9(arr));

    }
    static ArrayList<Integer> findarray9(int arr[]){

        ArrayList<Integer> a = new ArrayList<>();

        HashMap<Integer,Integer> h = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(h.containsKey(arr[i])){
                 h.put(arr[i] , h.get(arr[i])+1);
            }else {
                h.put(arr[i] , 1);
            }

        }
        for (Map.Entry<Integer , Integer> e : h .entrySet()){
            if (e.getValue() >= 1){
                a.add(e.getKey());
            }
        }
        return a;
    }
}

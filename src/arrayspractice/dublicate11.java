package arrayspractice;

import java.util.*;

class sol11{
    public ArrayList<Integer> dubicate(int arr[]){

        HashMap<Integer,Integer> h  =new HashMap<>();

        for(int i = 0 ; i< arr.length;i++){
            if (h.containsKey(arr[i])){

                h.put(arr[i] , h.get(arr[i])+1);
            }else {
                h.put(arr[i] , 1);
            }


        }
        ArrayList<Integer> as = new ArrayList<>();

        for (Map.Entry<Integer , Integer> e : h.entrySet()){
            if (e.getValue() >=1 ){
                as.add(e.getKey());

            }
        }

        return as;
    }


}
public class dublicate11 {
    public static void main(String[] args) {

        int arr[] ={1,1,2,2,3,3,4,4,5,2,1,2,3,3,5,4,3};
        sol11 s =new sol11();
        System.out.println(s.dubicate(arr));
    }
}

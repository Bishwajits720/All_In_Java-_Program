package arrayspractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.*;

public class hashset {
    public static void main(String[] args) {

        Integer[] arr1={1,2,3,4,5};
        Integer [] arr2={6,7,8,9,10};

        HashSet<Integer> h = new HashSet<Integer>();

        List<Integer> l1 = Arrays.asList(arr1);
        List<Integer> l2 =Arrays.asList(arr2);

        //made as list of array1 and array2
        h.addAll(l1);
        h.addAll(l2);

        List<Integer> fl = new ArrayList<Integer>();

        Iterator<Integer> it =h.iterator();
         while (it.hasNext()){
           // System.out.print(it.next());
         }

         for(Integer num : h){
             if(l1.contains(2)){
                 fl.add(num);
             }
             System.out.println(fl);
         }


    }
}

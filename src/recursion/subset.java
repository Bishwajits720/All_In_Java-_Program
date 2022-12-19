package recursion;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class subset {
    public static void main(String[] args) {
         int arr[] ={1,2,3};
         List<Integer> crr =new ArrayList<Integer>();
         List<List<Integer>> ans =new ArrayList<>();
        res(arr,0,crr,ans);
        System.out.println(ans);



    }
    static void res(int arr[] ,int i, List<Integer> curr, List<List<Integer>> ans){

        if(i== arr.length){
            ans.add(new ArrayList<>(curr));
            return;
        }

        curr.add(arr[i]);
        res(arr,i+1,curr,ans);
        curr.remove(curr.size() -1); //backtrackimg
        res(arr,i+1,curr,ans);
    }
}

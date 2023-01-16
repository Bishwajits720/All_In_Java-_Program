package arrayspractice;

import java.util.*;

public class Subset2 {
    public static void main(String[] args) {
        List<List<Integer>> res =  new ArrayList<>();

        int arr[] = {1,2,3};
        System.out.println(backtracking(res,new ArrayList<>(),arr,0));


    }
    static List<List<Integer>> backtracking(List<List<Integer>> res ,List<Integer> temp, int[] arr, int start){

        res.add(new ArrayList<>(temp));

        for(int i = start; i <arr.length; i++){

           temp.add(arr[i]);
           backtracking(res,temp,arr,i+1);
           temp.remove(temp.size()-1);

        }

        if (temp.size() == 2){
            System.out.println(temp);
        }
        return res;

    }



}

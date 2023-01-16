package recursion;

import java.util.ArrayList;

public class subset4 {
    public static void main(String[] args) {

        ArrayList<Integer> res =  new ArrayList<>();
        int arr[] ={1,2,3};
        backtracking1(res,arr,0);


    }
    static void backtracking1(ArrayList<Integer> res , int[] arr,int start){

        for (int i = start; i <arr.length  ; i++) {
            res.add(arr[i]);
            backtracking1(res,arr,i+1);
            res.remove(start);

        }

        System.out.println(res);

    }


}

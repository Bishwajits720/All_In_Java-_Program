package arrayspractice;

import java.util.*;

public class sunarrayLessthank {
    public static void main(String[] args) {
        int arr [] ={2,4,6,8};
         int  k = 30;
        ArrayList<Integer> path = new ArrayList<>();

        printsub(arr,0,path);
        check(path,k);


    }

    static ArrayList<Integer> printsub(int[] arr, int index , ArrayList<Integer> path){

        if (index == arr.length){

            if (path.size() >0){
                return path;
            }
        }
        else {
            printsub(arr,index+1,path);

            path.add(arr[index]);

            printsub(arr,index+1,path);

            path.remove(path.size() -1);
        }
       return path;
    }
    static void check(ArrayList<Integer> path ,int target){

        for (int i = 0; i < path.size(); i++) {
            System.out.println(path.get(i));

        }


    }
}

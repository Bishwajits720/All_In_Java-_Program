package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class LS2 {
    public static void main(String[] args) {
     int arr[] ={1,2,4,4,4,5,7,9,};

        System.out.println(ls3(arr,4,0));


    }

    static ArrayList<Integer> ls(int arr[] , int target ,int index, ArrayList<Integer> list){
        if (index == arr.length){
            return list;
        } if (arr[index] == target){
            list.add(index);
        }
        return ls(arr,target,index +1,list);


    }

    static ArrayList<Integer> ls3(int arr[],int target , int index){

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length){
            return list;
        }
        // this will contant the answer call for that function only
        if (arr[index]  == target){
            list.add(index);
        }
    ArrayList<Integer> ansbelow = ls3(arr,target,index +1);

        list.addAll(ansbelow) ;

        return list;
    }

}

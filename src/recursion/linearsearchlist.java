package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class linearsearchlist {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,4,4,7,8,9};
        int target = 4;
        ArrayList<Integer> list =new ArrayList<>();
        System.out.println(sol(arr,target,0,list));

    }
    static ArrayList<Integer> sol(int arr[],int target,int index,ArrayList<Integer> list){
        if (index == arr.length){
            return list;
        }
        if (target ==arr[index]){
            list.add(index);
        }
        return sol(arr,target,index+1,list);
    }
}

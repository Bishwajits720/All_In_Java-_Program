package arrayspractice;

import java.util.*;

public class listdemo {
    public static void main(String[] args) {
       int arr[] ={1,2,3,4,5,6,7,8,9,10};
        System.out.println(search(arr));


    }
    static List<Integer> search(int arr[]){

        List<Integer> l1 =new ArrayList<>();
       List<Integer> l2 =new ArrayList<>();


        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] %2 ==0){
                l1.add(arr[i]);

            }else {
                l2.add(arr[i]);

            }
        }
       return l2 ;
    }
}

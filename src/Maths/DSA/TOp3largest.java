package Maths.DSA;

import java.util.*;
public class TOp3largest {
    public static void main(String[] args) throws Exception {

        int arr[] ={1,4,3,8,5,2,7,9,11};
        int k = 3;

        PriorityQueue<Integer> q = new PriorityQueue<>();

        for (int i = 0; i <arr.length; i++) {

            if (i < k){
                q.add(arr[i]);
            }else {
                if (arr[i]> q.peek()){
                    q.remove();
                    q.add(arr[i]);
                }
            }

        }
        System.out.println(q);


    }
}

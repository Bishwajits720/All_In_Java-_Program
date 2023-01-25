package arrayspractice.DSA;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthMax {
    public static void main(String[] args) {

        int arr[] ={1,3,5,2,6,8,7,4,9};
        Kthelement(arr,4);

    }
    static void Kthelement(int arr[] , int k){

        PriorityQueue<Integer> q = new PriorityQueue<>();

        for (int i = 0 ; i < arr.length ; i++) {
            q.add(arr[i]);
            if (q.size() >k){
                q.poll();
            }
        }
        System.out.println(q.peek());
    }
}

package arrayspractice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Kthlargetsmallest {
    public static void main(String[] args) {
        int arr[] = {1,3,2,6,4,5,7,9,8};
        //{1,2,3,4,5,6,7,8,9}
        int k = 3;
       Kth(arr , k);


    }
    static void Kth(int arr[] , int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            q.add(arr[i]);
            if (q.size()>k) {
                q.poll();
            }


        }
        System.out.println(q.peek());

    }
}

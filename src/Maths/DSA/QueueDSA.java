package Maths.DSA;

import java.util.Collections;
import java.util.PriorityQueue;

public class QueueDSA {
    public static void main(String[] args) throws Exception {

        PriorityQueue<Integer> q = new PriorityQueue<>();
        int arr[] ={1,4,3,2,5,6,9,7,8};
        //{1,2,3,4,5,6,7,8,9}
        int k = 3;

        for (int x :arr){
            q.add(x);
        }
        while (q.size()> k){
            q.remove();
        }
        System.out.println(q.peek());
    }
}

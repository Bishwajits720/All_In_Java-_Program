package arrayspractice.DSA;
import java.util.*;

public class SecLargest {
    public static void main(String[] args) throws Exception {
        int arr[] = {3,2,5,1,4,8,6,7,9,10};
        largest(arr,2);

    }
    static void largest(int arr[] , int k){

        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < arr.length ; i++) {
            q.add(arr[i]);
            if (q.size() >2){
                q.poll();
            }
        }
        System.out.println(q.peek());
    }
}

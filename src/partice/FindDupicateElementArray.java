package partice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class sol {
    public void find(int arr[]) {

        HashMap<Integer, Integer> h = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (h.containsKey(arr[i])) {
                h.put(arr[i], h.get(arr[i]) + 1);
            } else {
                h.put(arr[i], 1);
            }


            for (Map.Entry<Integer, Integer> e : h.entrySet()) {
                if (e.getValue() > 1) {
                    System.out.println(e.getKey() + " ");
                }


            }


        }
    }

}


public class FindDupicateElementArray {
    public static void main(String[] args) {

        sol s = new sol();


//        Scanner sc =new Scanner(System.in);
//        System.out.println("enter the size");
//        int n =sc.nextInt();
//        int [] arr =new int[n];
//        System.out.println("enter array elements :");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }

        int arr[] = {1, 1, 2, 3, 3, 3, 4, 5, 5, 6};
        s.find(arr);

       }

}

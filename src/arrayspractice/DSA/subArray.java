package arrayspractice.DSA;

import java.util.ArrayList;

public class subArray {
    public static void main(String[] args) throws Exception{

        int[] arr= {1,2,3,4};

        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            for (int j = i; j < arr.length ; j++) {
                for (int k = i; k <= j ; k++) {
                    System.out.print(arr[k]);
                }
                System.out.println();
            }


        }
    }
}

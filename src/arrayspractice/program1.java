package arrayspractice;

import java.util.*;

public class program1 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
         int size = sc.nextInt();
         int[] arr = new int[size];
        for (int i = 0; i <size ; i++) {
            arr[i] =sc.nextInt();
        }
        sc.close();
        System.out.println(Arrays.toString(arr));


    }
}

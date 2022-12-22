package arrayspractice;

import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int arr[] ={1,4,2,5,6,3,7,8,1,9};
        insert(arr);
        System.out.println(Arrays.toString(arr));



    }

    static void insert(int arr[]){
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = i+1; j>0 ; j--) {
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] =arr[j-1];
                    arr[j-1] = temp;

                }else {
                    break;
                }

            }
        }



    }
}

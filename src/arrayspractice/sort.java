package arrayspractice;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {

     int arr[] ={1,4,6,7,3,5,3,2,4,5,1,6,7,6,3,8,9,3,2,10};
     sorrrt(arr);


    }
    static void sorrrt(int arr[]){

        for (int i = 0; i < arr.length ; i++) {
            for (int j = i; j < arr.length ; j++) {
                if (arr[i] > arr[j]){
                    int temp =arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));



    }


}

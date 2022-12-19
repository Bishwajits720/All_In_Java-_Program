package partice;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {

        int arr[] ={3,2,4,1,5};

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]>arr[j]){
                    //< for reverse
                    int temp =arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;

                }
            }
        }


        System.out.println(Arrays.toString(arr));

    }
}

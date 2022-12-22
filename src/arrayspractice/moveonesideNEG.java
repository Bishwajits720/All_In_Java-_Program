package arrayspractice;


import java.util.Arrays;

public class moveonesideNEG {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,-1,-2,-3,-4,6};
        System.out.println(Arrays.toString(shiftneg(arr)));

    }
    static int[] shiftneg(int[] arr){
        int j =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0){
                if (i!= j ){
                    swap(arr,i,j);
                    j++;
                }

            }
        }


        return arr;
    }
    static int[] swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j] = temp;

        return arr;
    }

}
